package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Datenbereich: Kardinalität der Beziehungen
 */
public class CardinalityAssociationTest {
	private final Logger logger = LoggerFactory.getLogger(CardinalityAssociationTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor", "ilivalidator");
	}

	/**
	 * @ID RKB.T01a
	 *
	 * @Bezeichnung {1} bei beiden Rollen
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T01b
	 *
	 * @Bezeichnung {1} bei beiden Rollen
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Fehlende Rolle (RolleA in Klasse B)
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T01c
	 *
	 * @Bezeichnung {1} bei beiden Rollen
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Zwei Instanzen von B verweisen auf die gleiche Instanz von A
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T01d
	 *
	 * @Bezeichnung {1} bei beiden Rollen
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T01d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Alle Instanzen von A müssen referenziert werden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T01d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T02a
	 *
	 * @Bezeichnung <p>{0..1}</p><p>{1}</p>
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T03a
	 *
	 * @Bezeichnung <p>{0..1}</p><p>{0..1}</p>
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T04a
	 *
	 * @Bezeichnung <p>{1}</p><p>{0..*}</p>
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T04a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T05a
	 *
	 * @Bezeichnung <p>{0..*}</p><p>{1}</p>
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T05a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsches Einbetten
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T05b
	 *
	 * @Bezeichnung <p>{0..*}</p><p>{1}</p>
	 *
	 * @Beschreibung
	 * Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
	 *
	 * @Testvoraussetzung RKB.T05b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.7.1 und 2.7.3</p>
	 */
	@Test
	public void RKB_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

}
