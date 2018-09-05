package ch.interlis.testsuite.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;

import org.interlis2.validator.Validator;
import ch.ehi.basics.settings.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestUtil {
    private static final String newline=System.getProperty("line.separator");
	private static final Logger logger = LoggerFactory.getLogger(TestUtil.class);

    public static boolean runJob(String vendor, String xtf) {
    		logger.debug("Vendor used for testing: " + vendor);

    		if (vendor.equalsIgnoreCase("iG/Check")) {
    			String homeDirectory = System.getProperty("user.home");
    			String cmd=System.getProperty("ics","ics");
    			Process process=null;
                StringBuffer stderr=new StringBuffer();
                StringBuffer stdout=new StringBuffer();
                Integer exitCode=null;
                try {
                    process = Runtime.getRuntime()
                            .exec(String.format("%s -script igcheck2\\interlis2.cfg -input %s -console",cmd,xtf));
                    appendProcessOutputToStdStreams(process, stderr, stdout);
                    exitCode = process.waitFor();
                } catch (IOException e) {
                    throw new IllegalStateException("failed to execute <"+cmd+">",e);
                } catch (InterruptedException e) {
                    throw new IllegalStateException("failed to execute <"+cmd+">",e);
                }
                System.out.println(String.format("Here is the standard output of the command [%s]:\n", cmd));
                System.out.print(stdout);
                System.out.println(String.format("Here is the standard error of the command [%s] (if any):\n", cmd));
                System.out.print(stderr);
                if(exitCode!=0) {
                    return false;
                }
                if(stderr.indexOf("STACK")>=0 || stderr.indexOf("ERROR")>=0) {
                    return false;
                }
                if(stdout.indexOf("STACK")>=0 || stdout.indexOf("ERROR")>=0) {
                    return false;
                }
                return true;
    		} else {
    			Settings settings = new Settings();
    			settings.setValue(Validator.SETTING_ILIDIRS, "../data/models/");

    			boolean ret=Validator.runValidation(xtf, settings);
    			return ret;
    		}
    }
    private static void appendProcessOutputToStdStreams(Process p, StringBuffer stderr, StringBuffer stdout){
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        // read the output from the command
        new Thread() {
            public void run() {
                try {
                    String s;
                    while ((s = stdInput.readLine()) != null) {
                        if(stdout!=null) {
                            stdout.append(s);
                            stdout.append(newline);
                        }
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }.start();

        // read any errors from the attempted command
        new Thread() {
            public void run() {
                try {
                    String s;
                    while ((s = stdError.readLine()) != null) {
                        stderr.append(s);
                        stderr.append(newline);
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
