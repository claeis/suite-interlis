package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Datenbereich: Koordinaten
 */
public class CoordinateAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(CoordinateAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RCO.T01a
	 *
	 * @Bezeichnung COORD
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Koordinaten vorhanden sind.
	 *
	 * @Testvoraussetzung RCO.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Koordinaten nicht vorhanden.
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.8 und 3.3.11.11
	 */
	@Test
	public void RCO_T01a() {
		// Ausgesetzt falls vendor="ilivalidator" --> Absturz Error: java.lang.NullPointerException
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T02a
	 *
	 * @Bezeichnung COORD: Codierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Koordinaten den Codierungsregeln entsprechen.
	 *
	 * @Testvoraussetzung RCO.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung &lt;C4&gt;
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.8 und 3.3.11.11
	 */
	@Test
	public void RCO_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T02b
	 *
	 * @Bezeichnung COORD: Codierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Koordinaten den Codierungsregeln entsprechen.
	 *
	 * @Testvoraussetzung RCO.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Redundante Koordinaten &lt;C2&gt;
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.8 und 3.3.11.11
	*/
	@Test
	public void RCO_T02b() {
		// Ausgesetzt falls vendor="ilivalidator" --> Absturz Error: java.lang.NullPointerException
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T03a
	 *
	 * @Bezeichnung COORD: Codierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Koordinaten der Definition im INTERLIS-Datenmodell entsprechen.
	 *
	 * @Testvoraussetzung RCO.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. &lt;C2&gt; nicht im Wertbereich.
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.8 und 3.3.11.11
	*/
	@Test
	public void RCO_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T03b
	 *
	 * @Bezeichnung COORD: Codierung
	 *
	 * @Beschreibung Der Test muss prüfen, ob die Koordinaten der Definition im INTERLIS-Datenmodell entsprechen.
	 *
	 * @Testvoraussetzung RCO.T03b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. &lt;C3&gt; nicht erlaubt, weil Wertbereich für 2D-Koordinaten ist.
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.8 und 3.3.11.11
	*/
	@Test
	public void RCO_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
