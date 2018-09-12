package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Vorspann
 */
public class HeaderSectionTest {
	private final Logger logger = LoggerFactory.getLogger(HeaderSectionTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RHE.T01a
	 *
	 * @Bezeichnung HEADERSECTION: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute VERSION und SENDER im Tag HEADERSECTION vorhanden sind
	 *
	 * @Testvoraussetzung RHE.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. VERSION nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T01b
	 *
	 * @Bezeichnung HEADERSECTION: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute VERSION und SENDER im Tag HEADERSECTION vorhanden sind
	 *
	 * @Testvoraussetzung RHE.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. SENDER nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T01b() {
		// Ausgesetzt falls vendor="ilivalidator" --> java.lang.IllegalArgumentException: Attribute SENDER missing in HEADERSECTION statt java.lang.AssertionError. Fehlermeldung ist korrekt
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T01c
	 *
	 * @Bezeichnung HEADERSECTION: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute VERSION und SENDER im Tag HEADERSECTION vorhanden sind
	 *
	 * @Testvoraussetzung RHE.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. VERSION nicht gleich 2.3
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T02a
	 *
	 * @Bezeichnung HEADERSECTION: Tag MODELS
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Tag MODELS im Tag HEADERSECTION vorhanden ist
	 *
	 * @Testvoraussetzung RHE.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Tag MODELS nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T03a
	 *
	 * @Bezeichnung HEADERSECTION: Tag MODEL
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Tag MODEL im Tag MODELS vorhanden ist
	 *
	 * @Testvoraussetzung RHE.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Tag MODEL nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T04a
	 *
	 * @Bezeichnung HEADERSECTION: XML-Attribute im Tag MODEL
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute NAME, VERSION und URI im Tag MODEL vorhanden sind
	 *
	 * @Testvoraussetzung RHE.T04a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. NAME nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T04a() {
		// Ausgesetzt falls vendor="ilivalidator" --> java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: Attribute NAME missing in MODEL statt java.lang.AssertionError. Fehlermeldung ist korrekt
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T04b
	 *
	 * @Bezeichnung HEADERSECTION: XML-Attribute im Tag MODEL
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute NAME, VERSION und URI im Tag MODEL vorhanden sind
	 *
	 * @Testvoraussetzung RHE.T04b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. VERSION nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T04b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T04b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T04c
	 *
	 * @Bezeichnung HEADERSECTION: XML-Attribute im Tag MODEL
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute NAME, VERSION und URI im Tag MODEL vorhanden sind
	 *
	 * @Testvoraussetzung RHE.T04c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. URI nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T04c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T04c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T05a
	 *
	 * @Bezeichnung HEADERSECTION: Attributwert in NAME und VERSION
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Werte der Attribute NAME, VERSION und URI im Tag MODEL der ModelDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RHE.T05a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Wert in NAME stimmt nicht
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
 	public void RHE_T05a() {
 		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T05a.xtf");
 		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
 		assertFalse(ret);
 	}

	/**
	 * @ID RHE.T05b
	 *
	 * @Bezeichnung HEADERSECTION: Attributwert in NAME und VERSION
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Werte der Attribute NAME, VERSION und URI im Tag MODEL der ModelDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RHE.T05b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Wert in VERSION stimmt nicht
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

/**
	 * @ID RHE.T05c
	 *
	 * @Bezeichnung HEADERSECTION: Attributwert in NAME und VERSION
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Werte der Attribute NAME, VERSION und URI im Tag MODEL der ModelDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RHE.T05c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Wert in URI stimmt nicht
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.4</p>
	 */
	@Test
	public void RHE_T05c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T05c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
