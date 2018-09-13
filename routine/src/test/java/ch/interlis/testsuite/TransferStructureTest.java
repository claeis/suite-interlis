package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Struktur der Transferdatei
 */
public class TransferStructureTest {
	private final Logger logger = LoggerFactory.getLogger(TransferStructureTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RTR.T01a
	 *
	 * @Bezeichnung TRANSFER: XML-Deklaration
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Deklaration vorhanden ist
	 *
	 * @Testvoraussetzung RTR.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung: XML-Deklaration nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">Extensible Markup Language (XML) 1.0 Kap. 2.8</a></p>
	 */
	@Test
	public void RTR_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T02a
	 *
	 * @Bezeichnung TRANSFER: Aufbau der Transferdatei
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Tags TRANSFER, HEADERSECTION, DATASECTION vorhanden sind
	 *
	 * @Testvoraussetzung RTR.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. TRANSFER nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3</p>
	 */
	@Test
	public void RTR_T02a() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T02b
	 *
	 * @Bezeichnung TRANSFER: Aufbau der Transferdatei
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Tags TRANSFER, HEADERSECTION, DATASECTION vorhanden sind
	 *
	 * @Testvoraussetzung RTR.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. HEADERSECTION nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3</p>
	 */
	@Test
	public void RTR_T02b() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T02c
	 *
	 * @Bezeichnung TRANSFER: Aufbau der Transferdatei
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Tags TRANSFER, HEADERSECTION, DATASECTION vorhanden sind
	 *
	 * @Testvoraussetzung RTR.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. DATASECTION nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3</p>
	 */
	@Test
	public void RTR_T02c() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T03a
	 *
	 * @Bezeichnung TRANSFER: Reihenfolge der Elemente
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Tags TRANSFER, HEADERSECTION, DATASECTION in der richtigen Reihenfolge sind
	 *
	 * @Testvoraussetzung RTR.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung: HEADERSECTION und DATASECTION erfolgen in umgekehrter Reihenfolge
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3</p>
	 */
	@Test
	public void RTR_T03a() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T04a
	 *
	 * @Bezeichnung TRANSFER: xmlns-Attribut
	 *
	 * @Beschreibung Der Test muss prüfen, ob das xmlns-Attribut im Tag TRANSFER vorhanden ist
	 *
	 * @Testvoraussetzung RTR.T04a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung: xmlns-Attribut nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3</p>
	 */
	@Test
	public void RTR_T04a() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
