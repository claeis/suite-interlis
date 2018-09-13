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
 * Tests Zeichencodierung
 */
public class CharacterEncodingTest {
	private final Logger logger = LoggerFactory.getLogger(CharacterEncodingTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RZe.T01a
	 *
	 * @Bezeichnung Zeichencodierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Zeichen den Codierungsregeln gemäss UTF-8 entsprechen
	 *
	 * @Testvoraussetzung RZe.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.2</p>
	 */
	@Test
	public void RZe_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RZe.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RZe.T01b
	 *
	 * @Bezeichnung Zeichencodierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Zeichen den Codierungsregeln gemäss UTF-8 entsprechen
	 *
	 * @Testvoraussetzung RZe.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Datei nicht als UTF-8 codiert 
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.2</p>
	 */
	@Test
	public void RZe_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RZe.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RZe.T01c
	 *
	 * @Bezeichnung Zeichencodierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Zeichen den Codierungsregeln gemäss UTF-8 entsprechen
	 *
	 * @Testvoraussetzung RZe.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Ungültige UTF-8-Zeichen
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.2</p>
	 */
	@Test
	public void RZe_T01c() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RZe.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}	
}
