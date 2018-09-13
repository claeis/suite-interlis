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
 * Tests Datenbereich: Struktur- und Referenzattribute
*/
public class StructureReferenceAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(StructureReferenceAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RStReA.T01a
	 *
	 * @Bezeichnung StructureValue
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Strukturattribut der StructureDef im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln für den StructureValue, entspricht
	 *
	 * @Testvoraussetzung RStReA.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.4 und 3.3.11.9</p>
	 */
	@Test
	public void RStReA_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RStReA.T01b
	 *
	 * @Bezeichnung StructureValue
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Strukturattribut der StructureDef im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln für den StructureValue, entspricht
	 *
	 * @Testvoraussetzung RStReA.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung der Struktur
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.4 und 3.3.11.9</p>
	 */
	@Test
	public void RStReA_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RStReA.T01c
	 *
	 * @Bezeichnung StructureValue
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Strukturattribut der StructureDef im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln für den StructureValue, entspricht
	 *
	 * @Testvoraussetzung RStReA.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Attribut TestSuite2.Einheiten.KantonRef.KtNummer benötigt
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.4 und 3.3.11.9</p>
	 */
	@Test
	public void RStReA_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RStReA.T02a
	 *
	 * @Bezeichnung ReferenceAttribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Referenzattribut der Definition im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RStReA.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.3 und 3.3.11.14</p>
	 */
	@Test
	public void RStReA_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RStReA.T02b
	 *
	 * @Bezeichnung ReferenceAttribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Referenzattribut der Definition im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RStReA.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.3 und 3.3.11.14</p>
	 */
	@Test
	public void RStReA_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RStReA.T02c
	 *
	 * @Bezeichnung ReferenceAttribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob das Referenzattribut der Definition im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RStReA.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6.3 und 3.3.11.14</p>
	 */
	@Test
	public void RStReA_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
}
