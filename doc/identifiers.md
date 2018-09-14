# Objektidentifikation

```BID``` und ```TID``` werden als XML-ID codiert ([[1]] Kap. 3.3.6 und 3.3.7). Die EBNF-Regel für XML-ID ist ([[1]] Kap. 3.3.1):

``
XML-ID = XML-ValueDelimiter [ XML-NcName ':' ] ( Letter | Digit | '_' ) { Letter | Digit | '_' | '-' | '.' } XML-ValueDelimiter
``

Gemäss dieser Regel, könnte ein BID/TID eine Ziffer, einen Buchstabe oder einen Unterstrich als erstes Zeichen haben (also, nicht echte XML-ID gemäss https://www.w3.org/TR/xml-id/#id-avn).

```OID```-Werte von textlichen ```OID```-Wertebereichen müssen die Regeln des XML-ID-Typs erfüllen: sie müssen echte XML-ID sein.

```STANDARDOID``` und ```UUIDOID``` haben ihre eigene Definition.

Als Zusammenfassung:

* ```TID``` und ```BID``` werden als XML-ID «à la INTERLIS» (gemäss [[1]] Kap. 3.3.1) und nicht als echter XML-ID kodiert
* ```STANDARDOID```: nur Ziffern und Buchstaben erlaubt ([[1]] Kap. 2.8.9)
* ```UUIDOID```: muss eine valide UUID gemäss ISO 11578 sein ([[1]] Kap. 2.8.9)
*	Numerische ```OID```: nur Ziffern erlaubt
*	Textliche ```OID```: echter XML-ID (gemäss [[1]]  Kap. 2.8.9)

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
