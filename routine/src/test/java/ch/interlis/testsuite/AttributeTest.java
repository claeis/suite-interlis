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
 * Tests Datenbereich: Attribute
 *
 * <p>BID und TID werden als XML-ID codiert (INTERLIS 2 - Referenzhandbuch Kap. 3.3.6, 3.3.7). Die EBNF-Regel für XML-ID ist ( INTERLIS 2 - Referenzhandbuch Kap. 3.3.1):</p>
 * <code>XML-ID = XML-ValueDelimiter [ XML-NcName ':' ] ( Letter | Digit | '_' ) { Letter | Digit | '_' | '-' | '.' } XML-ValueDelimiter</code>
 * <p>Gemäss dieser Regel, könnte eine BID/TID eine Ziffer, einen Buchstabe oder einen Unterstrich als erstes Zeichen haben (also, nicht echte XML-ID gemäss <a href="https://www.w3.org/TR/xml-id/#id-avn">https://www.w3.org/TR/xml-id/#id-avn</a>).</p>
 * <p>OID-Werte von textlichen OID-Wertebereichen müssen die Regeln des XML-ID-Typs erfüllen: sie müssen echte XML-ID sein.</p>
 * <p>STANDARDOID und UUIDOID haben ihre eigene Definition.</p>
 * <p>Als Zusammenfassung:</p>
 * <ul>
 * <li>TIDs und BIDs werden als XML-ID «à la INTERLIS» (gemäss INTERLIS 2 - Referenzhandbuch Kap. 3.3.1 und nicht als echte XML-ID) kodiert</li>
 * <li>STANDARDOID: nur Ziffern und Buchstaben erlaubt ( INTERLIS 2 - Referenzhandbuch Kap. 2.8.9)</li>
 * <li>UUIDOID: muss eine valide UUID gemäss ISO 11578 sein ( INTERLIS 2 - Referenzhandbuch Kap. 2.8.9)</li>
 * <li>Numerische OID: nur Ziffern erlaubt</li>
 * <li>Textliche OID: echte XML-ID (gemäss INTERLIS 2 - Referenzhandbuch Kap. 2.8.9)</li>
 *</ul>
*/
public class AttributeTest {
	private final Logger logger = LoggerFactory.getLogger(AttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RAt.T01a
	 *
	 * @Bezeichnung AttributeName
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Wert %AttributeName% der Definition im INTERLIS-Datenmodell entspricht
	 *
	 * @Testvoraussetzung RAt.T01a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Wert %AttributeName% stimmt nicht
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6 und 3.3.11</p>
	 */
	@Test
	public void RAt_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T02a
	 *
	 * @Bezeichnung TEXT
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für TEXT, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T02a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung. Leerzeichen sind gültige Zeichen
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Kap. 2.2</a></p>
	 */
	@Test
	public void RAt_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T02b
	 *
	 * @Bezeichnung TEXT
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für TEXT, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T02b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Attribut Art3 muss auf drei Zeichen begrenzt werden
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Kap. 2.2</a></p>
	 */
	@Test
	public void RAt_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T02c
	 *
	 * @Bezeichnung TEXT
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für TEXT, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T02c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. TEXT muss als einzeiliger Text codiert werden: Steuerzeichen sind nicht zulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6 und 3.3.11.2</p>
 	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Kap. 2.2</a></p>
	 */
	@Test
	public void RAt_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T03a
	 *
	 * @Bezeichnung MTEXT
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für MTEXT, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T03a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Attribut Beschreibung muss auf 9 Zeichen begrenzt werden. Jeder Wagenrücklauf zählt als 1 Zeichen
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Kap. 2.2</a></p>
	 * <p><a href="http://www.w3.org/TR/xml/#sec-line-ends">Extensible Markup Language (XML) 1.0 Kap. 2.11</a></p>
	 */
	@Test
	public void RAt_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T03b
	 *
	 * @Bezeichnung MTEXT
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für MTEXT, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T03b.xtf
	 *
	 * @Erwartetes.Ergebnis keine Fehlermeldung. Steuerzeichen, wie Tabulatoren, sind in MTEXT zulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Kap. 2.2</a></p>
	 * <p><a href="http://www.w3.org/TR/xml/#sec-line-ends">Extensible Markup Language (XML) 1.0 Kap. 2.11</a></p>
	 */
	@Test
	public void RAt_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T04a
	 *
	 * @Bezeichnung NAME
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NAME, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T04a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. NAME ist eine Folge von maximal 255 Buchstaben
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.2.2, 2.2.7, 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#NT-Name">Extensible Markup Language (XML) 1.0 Kap. 2.3</a></p>
	 */
	@Test
	public void RAt_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T04b
	 *
	 * @Bezeichnung NAME
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NAME, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T04b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Das erste Zeichen muss ein Buchstabe sein
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.2.2, 2.2.7, 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#NT-Name">Extensible Markup Language (XML) 1.0 Kap. 2.3</a></p>
	 */
	@Test
	public void RAt_T04b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T04b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T04c
	 *
	 * @Bezeichnung NAME
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NAME, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T04c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Bei Namen sind reservierte INTERLIS-Wörter unzulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.2.2, 2.2.7, 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#NT-Name">Extensible Markup Language (XML) 1.0 Kap. 2.3</a></p>
	 */
	@Test
	public void RAt_T04c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T04c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T05a
	 *
	 * @Bezeichnung URI
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für URI, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T05a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. URI ist eine Folge von maximal 1023 Buchstaben
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.ietf.org/rfc/rfc2396.txt">RFC Uniform Resource Identifiers (URI): Generic Syntax Kap. 3</a></p>
	 */
	@Test
	public void RAt_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T05b
	 *
	 * @Bezeichnung URI
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für URI, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T05b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Fehlendes URI-Schema
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.1 und 3.3.11.2</p>
	 * <p><a href="https://www.ietf.org/rfc/rfc2396.txt">RFC Uniform Resource Identifiers (URI): Generic Syntax Kap. 3</a></p>
	 */
	@Test
	public void RAt_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T06a
	 *
	 * @Bezeichnung EnumerationType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für EnumerationType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T06a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Die Werte einer Aufzählung sind case-sensitive
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.2 und 3.3.11.3</p>
	 */
	@Test
	public void RAt_T06a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T06a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T06b
	 *
	 * @Bezeichnung EnumerationType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für EnumerationType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T06b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Die Blätter des Baumes (nicht aber die Knoten) bilden die Menge der zulässigen Werte: 'Gebaeude' ist ein Knoten
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.2 und 3.3.11.3</p>
	 */
	@Test
	public void RAt_T06b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T06b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T06c
	 *
	 * @Bezeichnung EnumerationType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für EnumerationType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T06c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Leerzeichen sind nicht zulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.2 und 3.3.11.3</p>
	 */
	@Test
	public void RAt_T06c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T06c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T07a
	 *
	 * @Bezeichnung EnumTreeValueType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für EnumTreeValueType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T07a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Unzulässiger Wert (dunkel)
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.2 und 3.3.11.3</p>
	 */
	@Test
	public void RAt_T07a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T07a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T07b
	 *
	 * @Bezeichnung EnumTreeValueType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für EnumTreeValueType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T07b.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung. Blätter und Knoten sind zulässig
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.2 und 3.3.11.3</p>
	 */
	@Test
	public void RAt_T07b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T07b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T08a
	 *
	 * @Bezeichnung BooleanType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für BooleanType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T08a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.4 und 3.3.11</p>
	 */
	@Test
	public void RAt_T08a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T08a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T08b
	 *
	 * @Bezeichnung BooleanType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für BooleanType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T08b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Unzulässiger Wert '0'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.4 und 3.3.11</p>
	 */
	@Test
	public void RAt_T08b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T08b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T09a
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09a.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T09b
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Unzulässiger Wert '0.9'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T09c
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T09d
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. '00004' statt '4'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RAt.T09e
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09e.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung (10000.01 wird auf 10000.0 gerundet)
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09e() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	
	/**
	 * @ID RAt.T09f
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09f.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09f() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	
	/**
	 * @ID RAt.T09g
	 *
	 * @Bezeichnung NumericType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für NumericType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T09g.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung (10000.05 wird auf 10000.1 gerundet)
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.5 und 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09g() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09g.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RAt.T10a
	 *
	 * @Bezeichnung FormattedType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für FormattedType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T10a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Unzulässiger Wert '1'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.6, 2.8.7 und 3.3.11.5</p>
	 */
	@Test
	public void RAt_T10a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T10a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T10b
	 *
	 * @Bezeichnung FormattedType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für FormattedType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T10b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Unzulässiges Jahr '3000'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.6, 2.8.7 und 3.3.11.5</p>
	 */
	@Test
	public void RAt_T10b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T10b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T10c
	 *
	 * @Bezeichnung FormattedType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für FormattedType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T10c.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Unzulässiges Jahr '2018'
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.6, 2.8.6, 2.8.7 und 3.3.11.5</p>
	 */
	@Test
	public void RAt_T10c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T10c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RAt.T11a
	 *
	 * @Bezeichnung OIDType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für OIDType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T11a.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Ungültiger UUID im BID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Kap. D.2</a></p>
	 */
	@Test
	public void RAt_T11a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11b
	 *
	 * @Bezeichnung OIDType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für OIDType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T11b.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Ungültiger UUID im TID
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Kap. D.2</a></p>
	 */
	@Test
	public void RAt_T11b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11c
	 *
	 * @Bezeichnung OIDType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für OIDType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T11c.xtf
	 *
	 * @Erwartetes.Ergebnis Keine Fehlermeldung
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Kap. D.2</a></p>
	 */
	@Test
	public void RAt_T11c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T11d
	 *
	 * @Bezeichnung OIDType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für OIDType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T11d.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Ungültige Codierung (muss als XML-Attribut codiert werden)
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Kap. D.2</a></p>
	 */
	@Test
	public void RAt_T11d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11e
	 *
	 * @Bezeichnung OIDType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für OIDType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T11e.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Nur Ziffern und Buchstaben erlaubt
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Kap. D.2</a></p>
	 */
	@Test
	public void RAt_T11e() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check")); 
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	/**
	 * @ID RAt.T11f
	 *
	 * @Bezeichnung OIDType
	 *
	 * @Beschreibung
	 * Der Test muss prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für OIDType, bzw. den entsprechenden Codierungsregeln, entspricht
	 *
	 * @Testvoraussetzung RAt.T11f.xtf
	 *
	 * @Erwartetes.Ergebnis Fehlermeldung. Erstes Zeichen muss Buchstabe oder Unterstrich sein
	 *
	 * @Referenz <p><a href="https://www.interlis.ch/interlis2/docs23/ili2-refman_2006-04-13_d.pdf">INTERLIS 2 - Referenzhandbuch</a> Kap. 2.8.9 und 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Kap. D.2</a></p>
	 */
	@Test
	public void RAt_T11f() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
