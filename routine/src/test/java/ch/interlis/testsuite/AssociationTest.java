package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Datenbereich: Beziehungen
 */
public class AssociationTest {
	private final Logger logger = LoggerFactory.getLogger(AssociationTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RBe.T01a
	 *
	 * @Bezeichnung Referenzen
	 *
	 * @Beschreibung
	 * <p>Der Test muss prüfen, dass bei externen Rollen die Referenzen zusätzlich mit einem XML-Attribut BID codiert werden.</p>
	 * <p><i>Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), wird die Referenz zusätzlich mit BID codiert. In BID wird dabei die Behälteridentifikation des referenzierten Objekts eingetragen.</i></p>
	 *
	 * @Testvoraussetzung RBe.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9.2</p>
	 */
	@Test
	public void RBe_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBe.T01b
	 *
	 * @Bezeichnung Referenzen
	 *
	 * @Beschreibung
	 * <p>Der Test muss prüfen, dass bei externen Rollen die Referenzen zusätzlich mit einem XML-Attribut BID codiert werden.</p>
	 * <p><i>Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), wird die Referenz zusätzlich mit BID codiert. In BID wird dabei die Behälteridentifikation des referenzierten Objekts eingetragen.</i></p>
	 *
	 * @Testvoraussetzung RBe.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. BID nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9.2</p>
	 */
	@Test
	public void RBe_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RBe.T01c
	 *
	 * @Bezeichnung Referenzen
	 *
	 * @Beschreibung
	 * <p>Der Test muss prüfen, dass bei externen Rollen die Referenzen zusätzlich mit einem XML-Attribut BID codiert werden.</p>
	 * <p><i>Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), wird die Referenz zusätzlich mit BID codiert. In BID wird dabei die Behälteridentifikation des referenzierten Objekts eingetragen.</i></p>
	 *
	 * @Testvoraussetzung RBe.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9.2</p>
	 */
	@Test
	public void RBe_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	
	/**
	 * @ID RBe.T01d
	 *
	 * @Bezeichnung Referenzen
	 *
	 * @Beschreibung
	 * <p>Der Test muss prüfen, dass bei externen Rollen die Referenzen zusätzlich mit einem XML-Attribut BID codiert werden.</p>
	 * <p><i>Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), wird die Referenz zusätzlich mit BID codiert. In BID wird dabei die Behälteridentifikation des referenzierten Objekts eingetragen.</i></p>
	 *
	 * @Testvoraussetzung RBe.T01d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. BID nicht vorhanden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9.2</p>
	 */
	@Test
	public void RBe_T01d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID REB.T01a
	 *
	 * @Bezeichnung Kardinalität 0..1 bei beiden Rollen
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei beiden (Basis-)Rollen die maximale Kardinalität kleiner gleich 1 ist, wird bei der Ziel-Klasse der zweiten Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation und die Ziel-Klasse der ersten Rolle im selben Topic definiert ist wie die (Basis-)Assoziation, wird bei der Ziel-Klasse der ersten Rolle eingebettet.</i></p>
	 *
	 * @Testvoraussetzung REB.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void REB_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID REB.T01b
	 *
	 * @Bezeichnung Kardinalität 0..1 bei beiden Rollen
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei beiden (Basis-)Rollen die maximale Kardinalität kleiner gleich 1 ist, wird bei der Ziel-Klasse der zweiten Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation und die Ziel-Klasse der ersten Rolle im selben Topic definiert ist wie die (Basis-)Assoziation, wird bei der Ziel-Klasse der ersten Rolle eingebettet.</i></p>
	 *
	 * @Testvoraussetzung REB.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Flasche Codierung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void REB_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID REB.T01c
	 *
	 * @Bezeichnung Kardinalität 0..1 bei beiden Rollen
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei beiden (Basis-)Rollen die maximale Kardinalität kleiner gleich 1 ist, wird bei der Ziel-Klasse der zweiten Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation und die Ziel-Klasse der ersten Rolle im selben Topic definiert ist wie die (Basis-)Assoziation, wird bei der Ziel-Klasse der ersten Rolle eingebettet.</i></p>
	 *
	 * @Testvoraussetzung REB.T01c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void REB_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID REB.T02a
	 *
	 * @Bezeichnung Kardinalität 0..* bei einer der Rollen
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet.</i></p>
	 *
	 * @Testvoraussetzung REB.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void REB_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID REB.T02b
	 *
	 * @Bezeichnung Kardinalität 0..* bei einer der Rollen
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet.</i></p>
	 *
	 * @Testvoraussetzung REB.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void REB_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID REB.T02c
	 *
	 * @Bezeichnung Kardinalität 0..* bei einer der Rollen
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet.</i></p>
	 *
	 * @Testvoraussetzung REB.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Attribut «Status» ist obligatorisch
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void REB_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	

	/**
	 * @ID RBk.T01a
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..* bei der Rolle EXTERNAL</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation, kann nicht eingebettet werden.</i></p>
	 *
	 * @Testvoraussetzung RBk.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBk.T01b
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..* bei der Rolle EXTERNAL</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation, kann nicht eingebettet werden.</i></p>
	 *
	 * @Testvoraussetzung RBk.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T02a
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..1 bei beiden Rollen EXTERNAL</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>wenn die Ziel-Klassen der beiden Rollen in einem anderen Topic definiert sind als die (Basis-)Assoziation, kann nicht eingebettet werden.</i></p>
	 *
	 * @Testvoraussetzung RBk.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T02b
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..1 bei beiden Rollen EXTERNAL</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>wenn die Ziel-Klassen der beiden Rollen in einem anderen Topic definiert sind als die (Basis-)Assoziation, kann nicht eingebettet werden.</i></p>
	 *
	 * @Testvoraussetzung RBk.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBk.T03a
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..* bei beiden Rollen</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Beziehungen werden immer eingebettet, ausser wenn bei bei beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist ...</i></p>
	 *
	 * @Testvoraussetzung RBk.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T03b
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..* bei beiden Rollen</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Beziehungen werden immer eingebettet, ausser wenn bei bei beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist ...</i></p>
	 *
	 * @Testvoraussetzung RBk.T03b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Falsche Codierung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RBk.T03c
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..* bei beiden Rollen</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Beziehungen werden immer eingebettet, ausser wenn bei bei beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist ...</i></p>
	 *
	 * @Testvoraussetzung RBk.T03c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Die Rollen der ASSOCIATION sind obligatorisch
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T03c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RBk.T03d
	 *
	 * @Bezeichnung
	 * <p>Kardinalität 0..* bei beiden Rollen</p>
	 * <p>Nicht eigebettete Beziehungen</p>
	 *
	 * @Beschreibung
	 * <p>Der Test muss die Regeln fürs Einbetten der Beziehungen prüfen.</p>
	 * <p><i>Beziehungen werden immer eingebettet, ausser wenn bei bei beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist ...</i></p>
	 *
	 * @Testvoraussetzung RBk.T03d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppelte Beziehung mit gleichen Referenzen
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.9</p>
	 */
	@Test
	public void RBk_T03d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
