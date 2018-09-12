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
 * Tests Reihenfolge innerhalb der Klasseinstanzen
 */
public class OrderAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(OrderAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RRiO.T01a
	 *
	 * @Bezeichnung Reihenfolge - Klasseinstanzen
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer Klasse
	 *
	 * @Testvoraussetzung RRiO.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRiO.T01b
	 *
	 * @Bezeichnung Reihenfolge - Klasseinstanzen
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer Klasse
	 *
	 * @Testvoraussetzung RRiO.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Reihenfolge der Attribute
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T01c
	 *
	 * @Bezeichnung Reihenfolge - Klasseinstanzen
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer Klasse
	 *
	 * @Testvoraussetzung RRiO.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Reihenfolge der EmbeddedLink
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T02a
	 *
	 * @Bezeichnung Reihenfolge - Instanzen einer erweiterten Klasse
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse
	 *
	 * @Testvoraussetzung RRiO.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRiO.T02b
	 *
	 * @Bezeichnung Reihenfolge - Instanzen einer erweiterten Klasse
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse
	 *
	 * @Testvoraussetzung RRiO.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Reihenfolge der Attribute (zuerst müssen die Attribute der Basisklasse codiert werden)
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T03a
	 *
	 * @Bezeichnung Reihenfolge - Instanzen einer erweiterten Beziehungsklasse
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse
	 *
	 * @Testvoraussetzung RRiO.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRiO.T03b
	 *
	 * @Bezeichnung Reihenfolge - Instanzen einer erweiterten Beziehungsklasse
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse
	 *
	 * @Testvoraussetzung RRiO.T03b.xtf
	 *
	 * @Erwartetes.Ergebnis  Fehlermeldung. Zuerst müssen die Rollen der Basisklasse codiert werden
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T03c
	 *
	 * @Bezeichnung Reihenfolge - Instanzen einer erweiterten Beziehungsklasse
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse
	 *
	 * @Testvoraussetzung RRiO.T03c.xtf
	 *
	 * @Erwartetes.Ergebnis  Fehlermeldung. Fehlermeldung. Zuerst müssen die Attribute der Basisklasse codiert werden
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T03c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RRiO.T03d
	 *
	 * @Bezeichnung Reihenfolge - Instanzen einer erweiterten Beziehungsklasse
	 *
	 * @Beschreibung Der Test muss die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse
	 *
	 * @Testvoraussetzung RRiO.T03d.xtf
	 *
	 * @Erwartetes.Ergebnis  Fehlermeldung. Fehlermeldung. Die Rollen der Basisklasse sind obligatorisch
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kapitel 3.3.7
	 */
	@Test
	public void RRiO_T03d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
