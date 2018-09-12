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
 * Tests Datenbereich: Klassen
 */
public class ClassTest {
	private final Logger logger = LoggerFactory.getLogger(ClassTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKl.T01a
	 *
	 * @Bezeichnung ClassDef
	 *
	 * @Beschreibung Der Test muss prüfen, ob der Wert %Model.Topic.Class% der ClassDef entspricht
	 *
	 * @Testvoraussetzung RKl.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung, Wert %Class% stimmt nicht
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.7</p>
	 */
	@Test
	public void RKl_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02a
	 *
	 * @Bezeichnung TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob die TID vorhanden und eindeutig sind
	 *
	 * @Testvoraussetzung RKl.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. TID leer
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9, 3.3.1 und 3.3.7</p>
	 */
	@Test
	public void RKl_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02b
	 *
	 * @Bezeichnung TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob die TID vorhanden und eindeutig sind
	 *
	 * @Testvoraussetzung RKl.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. TID nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9, 3.3.1 und 3.3.7</p>
	 */
	@Test
	public void RKl_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02c
	 *
	 * @Bezeichnung TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob die TID vorhanden und eindeutig sind
	 *
	 * @Testvoraussetzung RKl.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppelte TID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9, 3.3.1 und 3.3.7</p>
	 */
	@Test
	public void RKl_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02d
	 *
	 * @Bezeichnung TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob die TID vorhanden und eindeutig sind
	 *
	 * @Testvoraussetzung RKl.T02d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. TID werden als XML-ID «à la INTERLIS» codiert. Erstes Zeichen muss Buchstabe, Ziffer oder Unterstrich sein
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9, 3.3.1 und 3.3.7</p>
	 */
	@Test
	public void RKl_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02e
	 *
	 * @Bezeichnung TID
	 *
	 * @Beschreibung Der Test muss prüfen, ob die TID vorhanden und eindeutig sind
	 *
	 * @Testvoraussetzung RKl.T02e.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Zeichen mit Umlauten sind nicht zulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9, 3.3.1 und 3.3.7</p>
	 */
	@Test
	public void RKl_T02e() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
