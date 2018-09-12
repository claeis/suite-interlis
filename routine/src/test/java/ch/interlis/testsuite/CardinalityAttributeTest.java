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
 * Tests Datenbereich: Kardinalitäten der Attribute
 */
public class CardinalityAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(CardinalityAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKA.T01a
	 *
	 * @Bezeichnung MANDATORY
	 *
	 * @Beschreibung Der Test muss die Regeln für die Kardinalität der Attribute prüfen
	 *
	 * @Testvoraussetzung RKA.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.1 und 2.7.3
	 */
	@Test
	public void RKA_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKA.T01b
	 *
	 * @Bezeichnung MANDATORY
	 *
	 * @Beschreibung Der Test muss die Regeln für die Kardinalität der Attribute prüfen
	 *
	 * @Testvoraussetzung RKA.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Fehlendes obligatorisches Attribut
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.1 und 2.7.3
	 */
	@Test
	public void RKA_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKA.T02a
	 *
	 * @Bezeichnung BAG OF
	 *
	 * @Beschreibung Der Test muss die Regeln für die Kardinalität der Attribute prüfen
	 *
	 * @Testvoraussetzung RKA.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.1 und 2.7.3
	 */
	@Test
	public void RKA_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKA.T02b
	 *
	 * @Bezeichnung BAG OF
	 *
	 * @Beschreibung Der Test muss die Regeln für die Kardinalität der Attribute prüfen
	 *
	 * @Testvoraussetzung RKA.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Fehlendes obligatorisches Attribut
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.1 und 2.7.3
	 */
	@Test
	public void RKA_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKA.T02c
	 *
	 * @Bezeichnung BAG OF
	 *
	 * @Beschreibung Der Test muss die Regeln für die Kardinalität der Attribute prüfen
	 *
	 * @Testvoraussetzung RCO.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Die Struktur darf nicht mehr als zweimal vorkommen
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.1 und 2.7.3
	 */
	@Test
	public void RKA_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKA.T02d
	 *
	 * @Bezeichnung BAG OF
	 *
	 * @Beschreibung Der Test muss die Regeln für die Kardinalität der Attribute prüfen
	 *
	 * @Testvoraussetzung RCO.T02d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung (mehrere Tags "Namen")
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.1 und 2.7.3
	 */
	@Test
	public void RKA_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
