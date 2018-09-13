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
 * Tests Datenbereich: Themen
 */
public class TopicTest {
	private final Logger logger = LoggerFactory.getLogger(TopicTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RTO.T01a
	 *
	 * @Bezeichnung Themen: TopicDef
	 *
	 * @Beschreibung Der Test muss prüfen, ob der Wert %Model.Topic% den Definitionen im INTERLIS-Datenmodell und den Angaben im Element MODELS in der HEADERSECTION entspricht
	 *
	 * @Testvoraussetzung RTO.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Wert %Topic% stimmt nicht
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.5.1, 3.3.4 und 3.3.6</p>
	 */
	@Test
	public void RTO_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02a
	 *
	 * @Bezeichnung Themen: BID
	 *
	 * @Beschreibung Der Test muss prüfen, ob der BID vorhanden ist und der richtigen Codierung entspricht
	 *
	 * @Testvoraussetzung RTO.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. BID nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.1</p>
	 */
	@Test
	public void RTO_T02a() {
		// Ausgesetzt falls vendor="ilivalidator" --> java.lang.IllegalArgumentException: Attribute Attribute BID missing in basket TestSuite.Bodenbedeckung statt java.lang.AssertionError. Fehlermeldung ist korrekt
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02b
	 *
	 * @Bezeichnung Themen: BID
	 *
	 * @Beschreibung Der Test muss prüfen, ob der BID vorhanden ist und der richtigen Codierung entspricht
	 *
	 * @Testvoraussetzung RTO.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. BID leer
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.1</p>
	 */
	@Test
	public void RTO_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02c
	 *
	 * @Bezeichnung Themen: BID
	 *
	 * @Beschreibung Der Test muss prüfen, ob der BID vorhanden ist und der richtigen Codierung entspricht
	 *
	 * @Testvoraussetzung RTO.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. BID werden als XML-ID «à la INTERLIS» codiert. Erstes Zeichen muss Buchstabe, Ziffer oder Unterstrich sein
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.1</p>
	 */
	@Test
	public void RTO_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02d
	 *
	 * @Bezeichnung Themen: BID
	 *
	 * @Beschreibung Der Test muss prüfen, ob der BID vorhanden ist und der richtigen Codierung entspricht
	 *
	 * @Testvoraussetzung RTO.T02d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Zeichen mit Umlauten sind nicht zulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.1</p>
	 */
	@Test
	public void RTO_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T03a
	 *
	 * @Bezeichnung Themen: BID und TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob alle BID inkl. alle TID innerhalb des Transfers eindeutig sind
	 *
	 * @Testvoraussetzung RTO.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppelte BID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.2.6 und 3.3.7</p>
	 */
	@Test
	public void RTO_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T03b
	 *
	 * @Bezeichnung Themen: BID und TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob alle BID inkl. alle TID innerhalb des Transfers eindeutig sind
	 *
	 * @Testvoraussetzung RTO.T03b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Gleicher Wert in BID und in TID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.2.6 und 3.3.7</p>
	 */
	@Test
	public void RTO_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T04a
	 *
	 * @Bezeichnung Themen: Behälter und Modelle
	 *
	 * @Beschreibung Der Test muss Behälter prüfen, die unterschiedlichen Modellen entsprechen
	 *
	 * @Testvoraussetzung RTO.T04a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 */
	@Test
	public void RTO_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T05a
	 *
	 * @Bezeichnung Themen: leere Behälter
	 *
	 * @Beschreibung Der Test muss die Regeln für leere Behälter prüfen
	 *
	 * @Testvoraussetzung RTO.T05a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3, 3.3.5 und 3.3.6</p>
	 */
	@Test
	public void RTO_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T05b
	 *
	 * @Bezeichnung Themen: leere Behälter
	 *
	 * @Beschreibung Der Test muss die Regeln für leere Behälter prüfen
	 *
	 * @Testvoraussetzung RTO.T05b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.3, 3.3.5 und 3.3.6</p>
	 */
	@Test
	public void RTO_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T06a
	 *
	 * @Bezeichnung Themen: Behälter und importierte Modelle
	 *
	 * @Beschreibung Der Test muss Behälter prüfen, die auf Basis von importierten Modellen definiert werden
	 *
	 * @Testvoraussetzung RTO.T06a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung.
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.5.1 und Appendix C</p>
	 */
	@Test
	public void RTO_T06a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T06a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T06b
	 *
	 * @Bezeichnung Themen: Behälter und importierte Modelle
	 *
	 * @Beschreibung Der Test muss Behälter prüfen, die auf Basis von importierten Modellen definiert werden
	 *
	 * @Testvoraussetzung RTO.T06b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.5.1 und Appendix C</p>
	 */
	@Test
	public void RTO_T06b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T06b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	
	/**
	 * @ID RTO.T06c
	 *
	 * @Bezeichnung Themen: Behälter und importierte Modelle
	 *
	 * @Beschreibung Der Test muss Behälter prüfen, die auf Basis von importierten Modellen definiert werden
	 *
	 * @Testvoraussetzung RTO.T06c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.5.1 und Appendix C</p>
	 */
	@Test
	public void RTO_T06c() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T06c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
