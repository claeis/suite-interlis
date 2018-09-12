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
 * Tests Konsistenzbedingungen
 */
public class ConstraintTest {
	private final Logger logger = LoggerFactory.getLogger(ConstraintTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKo.T01a
	 *
	 * @Bezeichnung UNIQUE
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T01b
	 *
	 * @Bezeichnung UNIQUE
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T02a
	 *
	 * @Bezeichnung UNIQUE (LOCAL)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T02b
	 *
	 * @Bezeichnung UNIQUE (LOCAL)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T03a
	 *
	 * @Bezeichnung UNIQUE WHERE
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T03a() {
		// Ausgesetzt falls vendor="ig/check" --> Absturz PSTACK ….END_PSTACK
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T03b
	 *
	 * @Bezeichnung UNIQUE WHERE
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T03b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T03b() {
		// Ausgesetzt falls vendor="ig/check" --> Absturz PSTACK ….END_PSTACK
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T04a
	 *
	 * @Bezeichnung EXISTENCE CONSTRAINT
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T04a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T04b
	 *
	 * @Bezeichnung EXISTENCE CONSTRAINT
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T04b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T04b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T04b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T04c
	 *
	 * @Bezeichnung EXISTENCE CONSTRAINT
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T04c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T04c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T04c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T05a
	 *
	 * @Bezeichnung MANDATORY mit Vergleich
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T05a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T05b
	 *
	 * @Bezeichnung MANDATORY mit Vergleich
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T05b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T06a
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06b
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06c
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T06d
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06d.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06e
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06e.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06e() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06f
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06f.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06f() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T06g
	 *
	 * @Bezeichnung MANDATORY mit Bedingungsvorgabe
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T06g.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T06g() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06g.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T07a
	 *
	 * @Bezeichnung MANDATORY mit Funktion (INTERLIS.len)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T07a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T07a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T07a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T07b
	 *
	 * @Bezeichnung MANDATORY mit Funktion (INTERLIS.len)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T07b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T07b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T07b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T08a
	 *
	 * @Bezeichnung SET CONSTRAINT mit Funktion (are.Areas)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T07a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T08a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T08a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T08b
	 *
	 * @Bezeichnung SET CONSTRAINT mit Funktion (are.Areas)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T08b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T08b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T08b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T08c
	 *
	 * @Bezeichnung SET CONSTRAINT mit Funktion (are.Areas)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T08c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T08c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T08c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	
	/**
	 * @ID RKo.T08d
	 *
	 * @Bezeichnung SET CONSTRAINT mit Funktion (are.Areas)
	 *
	 * @Beschreibung Der Test muss prüfen, dass die Daten der ConstraintDef im INTERLIS-Datenmodell entsprechen
	 *
	 * @Testvoraussetzung RKo.T08d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung
	 *
	 * @Referenz <a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.12, 2.13 und 2.14
	 */
	@Test
	public void RKo_T08d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T08d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
