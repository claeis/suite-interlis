package ch.interlis.testsuite.util;
import org.interlis2.validator.Validator;
import ch.ehi.basics.settings.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestUtil {
	private static final Logger logger = LoggerFactory.getLogger(TestUtil.class);

    public static boolean runJob(String vendor, String xtf) {
    		logger.debug("Vendor used for testing: " + vendor);

    		if (vendor.equalsIgnoreCase("iG/Check")) {
    			logger.warn("iG/Check not yet implemented.");
    			logger.warn("Something like 'Process p = Runtime.getRuntime().exec(command);'");
    		} else {
    			Settings settings = new Settings();
    			settings.setValue(Validator.SETTING_ILIDIRS, "../data/models/");

    			boolean ret=Validator.runValidation(xtf, settings);
    			return ret;
    		}
    		return false;
    }
}
