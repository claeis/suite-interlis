package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Reihenfolge der Objekte im Datenbereich
 */
public class OrderObjectTest {
	private final Logger logger = LoggerFactory.getLogger(OrderObjectTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RRO.T01a
	 *
	 * @Bezeichnung Reihenfolge - Datenbereich
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objekte im Datenbereich prüfen
	 *
	 * @Testvoraussetzung RRO.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung.
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.2.5
	 */
	@Test
	public void RRO_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRO.T01b
	 *
	 * @Bezeichnung Reihenfolge - Datenbereich
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objekte im Datenbereich prüfen
	 *
	 * @Testvoraussetzung RRO.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.2.5
	 */
	@Test
	public void RRO_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRO.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
}
