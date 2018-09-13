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
 * Tests XML-Wohlgeformtheit
 */
public class XmlTest {
	private final Logger logger = LoggerFactory.getLogger(XmlTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RXW.T01a
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: Tags
	 *
	 * @Beschreibung Der Test muss die Wohlgeformtheit der Tags prüfen
	 *
	 * @Testvoraussetzung RXW.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Es gibt ein Leerzeichen im Tag 'DATASECTION'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1 und 3.3.3</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Kap. 2.1</a></p>
	 */
	@Test
	public void RXW_T01a() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RXW.T01b
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: Tags
	 *
	 * @Beschreibung Der Test muss die Wohlgeformtheit der Tags prüfen
	 *
	 * @Testvoraussetzung RXW.T01b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Der Name des End-Tags 'TRANSFERs' stimmt nicht mit dem Namen des Start-Tags 'TRANSFER' überein
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1 und 3.3.3</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Kap. 2.1</a></p>
	 */
	@Test
	public void RXW_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	/**
	 * @ID RXW.T02a
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute in Anführungszeichen geschrieben sind (einfaches oder doppeltes Anführungszeichen).
	 * Es ist zusätzlich zu prüfen, dass ein Attributname nicht mehr als einmal im selben Tag vorkommt.
	 *
	 * @Testvoraussetzung RXW.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Attributwert (xmlns) nicht in Anführungszeichen geschrieben
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#uniqattspec">Extensible Markup Language (XML) 1.0 Kap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02a() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	/**
	 * @ID RXW.T02b
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute in Anführungszeichen geschrieben sind (einfaches oder doppeltes Anführungszeichen).
	 * Es ist zusätzlich zu prüfen, dass ein Attributname nicht mehr als einmal im selben Tag vorkommt.
	 *
	 * @Testvoraussetzung RXW.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung. Einfaches und doppeltes Anführungszeichen sind beide gültig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#uniqattspec">Extensible Markup Language (XML) 1.0 Kap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	/**
	 * @ID RXW.T02c
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute in Anführungszeichen geschrieben sind (einfaches oder doppeltes Anführungszeichen).
	 * Es ist zusätzlich zu prüfen, dass ein Attributname nicht mehr als einmal im selben Tag vorkommt.
	 *
	 * @Testvoraussetzung RXW.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppeltes Attribut BID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#uniqattspec">Extensible Markup Language (XML) 1.0 Kap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RXW.T02d
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute in Anführungszeichen geschrieben sind (einfaches oder doppeltes Anführungszeichen).
	 * Es ist zusätzlich zu prüfen, dass ein Attributname nicht mehr als einmal im selben Tag vorkommt.
	 *
	 * @Testvoraussetzung RXW.T02d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppeltes Attribut TID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#uniqattspec">Extensible Markup Language (XML) 1.0 Kap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RXW.T02e
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute in Anführungszeichen geschrieben sind (einfaches oder doppeltes Anführungszeichen).
	 * Es ist zusätzlich zu prüfen, dass ein Attributname nicht mehr als einmal im selben Tag vorkommt.
	 *
	 * @Testvoraussetzung RXW.T02e.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppeltes Attribut VERSION in HEADERSECTION
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#uniqattspec">Extensible Markup Language (XML) 1.0 Kap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02e() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RXW.T02f
	 *
	 * @Bezeichnung XML-Wohlgeformtheit: XML-Attribute
	 *
	 * @Beschreibung Der Test muss prüfen, ob die XML-Attribute in Anführungszeichen geschrieben sind (einfaches oder doppeltes Anführungszeichen).
	 * Es ist zusätzlich zu prüfen, dass ein Attributname nicht mehr als einmal im selben Tag vorkommt.
	 *
	 * @Testvoraussetzung RXW.T02f.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Doppeltes Attribut VERSION in MODEL
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#uniqattspec">Extensible Markup Language (XML) 1.0 Kap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02f() {
		// Ausgesetzt falls vendor="ilivalidator" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
}
