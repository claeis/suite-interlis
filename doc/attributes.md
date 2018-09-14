# Datenbereich: Attribute

## Attribute
|ID|RAt
|:--|:--
|**Bezeichnung**|**Attribute**
|**Beschreibung**|Für die Validierung der Attributen gelten die im [[1]] Kap. 3.3.11 definierten Regeln</td>
|**Details**|<ul><li>Der Wert ```%AttributeName%``` muss der ```AttributeDef``` ( [[1]] Kap. 2.6) im INTERLIS-Datenmodell entsprechen</li><li>Der Attributtyp und der Attributwert des Werts ```AttributeValue``` müssen der ```AttrTypeDef``` ( [[1]] Kap. 2.6 und 2.8) im INTERLIS-Datenmodell entsprechen</li><li>Bei Attributen von Typ ```NAME``` kommt die Regel *Namen* ( [[1]] Kap. 2.2.2) zur Anwendung. Namen, die mit reservierten Wörtern der Sprache ( [[1]] Kap. 2.2.7) zusammenfallen, sind unzulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.2.2, 2.2.7, 2.6, 2.8 und 3.3.11

### Testfälle
###### Attribute - RAt.T01
|ID|RAt.T01
|:--|:--
|**Bezeichnung**|```AttributeName```
|**Beschreibung**|Der Test muss prüfen, ob der Wert ```%AttributeName%``` der Definition im INTERLIS-Datenmodell entspricht
|**Testvoraussetzung**|[RAt.T01a.xtf](../data/RAt.T01a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T01a.xtf: Fehlermeldung. Wert ```%AttributeName%``` stimmt nicht</li></ul>
|**Referenz**| [[1]] Kap. 2.6 und 3.3.11

###### Attribute - RAt.T02
|ID|RAt.T02
|:--|:--
|**Bezeichnung**|```TEXT```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```TEXT```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T02a.xtf](../data/RAt.T02a.xtf), [RAt.T02b.xtf](../data/RAt.T02b.xtf), [RAt.T02c.xtf](../data/RAt.T02c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T02a.xtf: keine Fehlermeldung. Leerzeichen sind gültige Zeichen</li><li>RAt.T02b.xtf: Fehlermeldung. Attribut ```Art3``` muss auf drei Zeichen begrenzt werden</li><li>RAt.T02c.xtf: Fehlermeldung. ```TEXT``` muss als einzeiliger Text codiert werden: Steuerzeichen sind nicht zulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.1 und 3.3.11.2<br/>[[2]] Kap. 2.2 (https://www.w3.org/TR/REC-xml/#charsets)

###### Attribute - RAt.T03
|ID|RAt.T03
|:--|:--
|**Bezeichnung**|```MTEXT```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```MTEXT```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T03a.xtf](../data/RAt.T03a.xtf), [RAt.T03b.xtf](../data/RAt.T03b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T03a.xtf: Fehlermeldung. Attribut ```Beschreibung``` muss auf 9 Zeichen begrenzt werden. Jeder Wagenrücklauf zählt als 1 Zeichen</li><li>RAt.T03b.xtf: keine Fehlermeldung. Steuerzeichen, wie Tabulatoren, sind in ```MTEXT``` zulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.1 und 3.3.11.2<br/>[[2]] Kap. 2.11 (https://www.w3.org/TR/REC-xml/#sec-line-ends)<br/>[[2]] Kap. 2.2 (https://www.w3.org/TR/REC-xml/#charsets)

###### Attribute - RAt.T04
|ID|RAt.T04
|:--|:--
|**Bezeichnung**|```NAME```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```NAME```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T04a.xtf](../data/RAt.T04a.xtf), [RAt.T04b.xtf](../data/RAt.T04b.xtf), [RAt.T04c.xtf](../data/RAt.T04c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T04a.xtf: Fehlermeldung. ```NAME``` ist eine Folge von maximal 255 Buchstaben</li><li>RAt.T04b.xtf: Fehlermeldung. Das erste Zeichen muss ein Buchstabe sein</li><li>RAt.T04c.xtf: Fehlermeldung. Bei Namen sind reservierte INTERLIS-Wörter unzulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.2.2, 2.2.7, 2.6, 2.8.1 und 3.3.11.2<br/>[[2]] Kap. 2.3 (https://www.w3.org/TR/REC-xml/#NT-Name)

###### Attribute - RAt.T05
|ID|RAt.T05
|:--|:--
|**Bezeichnung**|```URI```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```URI```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T05a.xtf](../data/RAt.T05a.xtf), [RAt.T05b.xtf](../data/RAt.T05b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T05a.xtf: Fehlermeldung. ```URI``` ist eine Folge von maximal 1023 Buchstaben</li><li>RAt.T05b.xtf: Fehlermeldung. Fehlendes URI-Schema</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.1 und 3.3.11.2<br/>[[3]] Kap. 3

###### Attribute - RAt.T06
|ID|RAt.T06
|:--|:--
|**Bezeichnung**|```EnumerationType```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```EnumerationType```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T06a.xtf](../data/RAt.T06a.xtf), [RAt.T06b.xtf](../data/RAt.T06b.xtf), [RAt.T06c.xtf](../data/RAt.T06c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T06a.xtf: Fehlermeldung. Die Werte einer Aufzählung sind *case-sensitive*</li><li>RAt.T06b.xtf: Fehlermeldung. Die Blätter des Baumes (nicht aber die Knoten) bilden die Menge der zulässigen Werte: ```Gebaeude``` ist ein Knoten</li><li>RAt.T06c.xtf: Fehlermeldung. Leerzeichen sind nicht zulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.2 und 3.3.11.3

###### Attribute - RAt.T07
|ID|RAt.T07
|:--|:--
|**Bezeichnung**|```EnumTreeValueType```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```EnumTreeValueType```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T07a.xtf](../data/RAt.T07a.xtf), [RAt.T07b.xtf](../data/RAt.T07b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T07a.xtf: Fehlermeldung. Unzulässiger Wert (```dunkel```)</li><li>RAt.T07b.xtf: keine Fehlermeldung. Blätter und Knoten sind zulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.2 und 3.3.11.3

###### Attribute - RAt.T08
|ID|RAt.T08
|:--|:--
|**Bezeichnung**|```BooleanType```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```BooleanType```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T08a.xtf](../data/RAt.T08a.xtf), [RAt.T08b.xtf](../data/RAt.T08b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T08a.xtf: keine Fehlermeldung.</li><li>RAt.T08b.xtf: Fehlermeldung. Unzulässiger Wert (```0```)</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.4 und 3.3.11

###### Attribute - RAt.T09
|ID|RAt.T10
|:--|:--
|**Bezeichnung**|```NumericType```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```NumericType```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T09a.xtf](../data/RAt.T09a.xtf), [RAt.T09b.xtf](../data/RAt.T09b.xtf), [RAt.T09c.xtf](../data/RAt.T09c.xtf), [RAt.T09d.xtf](../data/RAt.T09d.xtf), [RAt.T09e.xtf](../data/RAt.T09e.xtf), [RAt.T09f.xtf](../data/RAt.T09f.xtf), [RAt.T09g.xtf](../data/RAt.T09g.xtf),
|**Erwartetes Ergebnis**|<ul><li>RAt.T09a.xtf: keine Fehlermeldung.</li><li>RAt.T09b.xtf: Fehlermeldung. Unzulässiger Wert (``0.9``)</li><li>RAt.T09c.xtf: keine Fehlermeldung</li><li>RAt.T09d.xtf: Fehlermeldung ``00004`` statt ``4``</li><li>RAt.T09e.xtf: keine Fehlermeldung (``10000.1`` wird auf ``10000.0`` gerundet)</li><li>RAt.T09f.xtf: keine Fehlermeldung</li><li>RAt.T09g.xtf: Fehlermeldung (``10000.5`` wird auf ``10000.1`` gerundet)</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.5 und 3.3.11.4

###### Attribute - RAt.T10
|ID|RAt.T10
|:--|:--
|**Bezeichnung**|```FormattedType```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```FormattedType```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T10a.xtf](../data/RAt.T10a.xtf), [RAt.T10b.xtf](../data/RAt.T10b.xtf), [RAt.T10c.xtf](../data/RAt.T10c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T10a.xtf: Fehlermeldung. Unzulässiger Wert (```1```)</li><li>RAt.T10b.xtf: Fehlermeldung. Unzulässiges Jahr (```3000```)</li><li>RAt.T10c.xtf: Fehlermeldung. Unzulässiges Jahr (``2018``)</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.6, 2.8.7 und 3.3.11.5

###### Attribute - RAt.T11
|ID|RAt.T11
|:--|:--
|**Bezeichnung**|```OIDType```
|**Beschreibung**|Die Tests müssen prüfen, ob der Attributwert der Definition im INTERLIS-Datenmodell für ```OIDType```, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RAt.T11a.xtf](../data/RAt.T11a.xtf), [RAt.T11b.xtf](../data/RAt.T11b.xtf), [RAt.T11c.xtf](../data/RAt.T11c.xtf), [RAt.T11d.xtf](../data/RAt.T11d.xtf), [RAt.T11e.xtf](../data/RAt.T11e.xtf), [RAt.T11f.xtf](../data/RAt.T11f.xtf)
|**Erwartetes Ergebnis**|<ul><li>RAt.T11a.xtf: Fehlermeldung. Ungültiger UUID im ```BID```</li><li>RAt.T11b.xtf: Fehlermeldung. Ungültiger UUID im ```TID```</li><li>RAt.T11c.xtf: keine Fehlermeldung</li><li>RAt.T11d.xtf: Fehlermeldung. Ungültige Codierung (muss als XML-Attribut codiert werden)</li><li>RAt.T11e.xtf: Fehlermeldung. Nur Ziffern und Buchstaben erlaubt</li><li>RAt.T11f.xtf: Fehlermeldung. Erstes Zeichen muss Buchstabe oder Unterstrich sein</li></ul>
|**Referenz**|[[1]] Kap. 2.8.9 und 3.3.11.16<br/> [[4]] Kap. D.2 (https://www.w3.org/TR/xml-id/#id-avn)<br/>[Objektidentifikation](identifiers.md)

## Struktur- und Referenzattribute
|ID|RStReA
|:--|:--
|**Bezeichnung**|**Struktur- und Referenzattribute **
|**Beschreibung**|Für die Validierung von Struktur- und Referenzattributen gelten die im [[1]] Kap. 3.3.11.9, bzw. Kap. 3.3.11.14, definierten Regeln
|**Details**|<ul><li>Die Angaben müssen der ```AttrTypeDef``` ( [[1]] Kap. 2.6) im INTERLIS-Datenmodell entsprechen</li></ul>
|**Referenz**|[[1]] Kap. 2.6.3, 2.6.4, 3.3.11.9 und 3.3.11.14

### Testfälle
###### Struktur- und Referenzattribute - RStReA.T01
|ID|RStReA.T01
|:--|:--
|**Bezeichnung**|```StructureValue```
|**Beschreibung**|Die Tests müssen prüfen, ob der Strukturattribut der ```StructureDef``` im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln für den ```StructureValue```, entspricht
|**Testvoraussetzung**|[RStReA.T01a.xtf](../data/RStReA.T01a.xtf), [RStReA.T01b.xtf](../data/RStReA.T01b.xtf), [RStReA.T01c.xtf](../data/RStReA.T01c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RStReA.T01a.xtf: keine Fehlermeldung</li><li>RStReA.T01b.xtf: Fehlermeldung: falsche Codierung der Struktur</li><li>RStReA.T01c.xtf: Fehlermeldung: Attribut ``TestSuite2.Einheiten.KantonRef.KtNummer`` benötigt</li></ul>
|**Referenz**|[[1]] Kap. 2.6.4 und 3.3.11.9


###### Struktur- und Referenzattribute - RStReA.T02
|ID|RStReA.T02
|:--|:--
|**Bezeichnung**|```ReferenceAttribute```
|**Beschreibung**|Die Tests müssen prüfen, ob der Referenzattribut der Definition im INTERLIS-Datenmodell, bzw. den entsprechenden Codierungsregeln, entspricht
|**Testvoraussetzung**|[RStReA.T02a.xtf](../data/RStReA.T02a.xtf), [RStReA.T02b.xtf](../data/RStReA.T02b.xtf), [RStReA.T02c.xtf](../data/RStReA.T02c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RStReA.T02a.xtf: keine Fehlermeldung</li><li>RStReA.T02b.xtf: keine Fehlermeldung</li><li>RStReA.T02c.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.6.3 und 3.3.11.14

## Geometrische Attribute: Koordinaten
|ID|RCO
|:--|:--
|**Bezeichnung**|```COORD```
|**Beschreibung**|Für die Validierung der Attributwerten von Typ ```COORD``` gelten die im [[1]] Kap. 3.3.11.11 definierten Regeln
|**Details**|<ul><li>Angaben in ```CoordValue``` müssen der ```AttrTypeDef``` ( [[1]] Kap. 2.6 und 2.8.8) im INTERLIS-Datenmodell entsprechen</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.8 und 3.3.11.11

### Testfälle
###### Koordinaten - RCO.T01
|ID|RCO.T01
|:--|:--
|**Bezeichnung**|```COORD```
|**Beschreibung**|Der Test muss prüfen, ob die Koordinaten vorhanden sind
|**Testvoraussetzung**|[RCO.T01a.xtf](../data/RCO.T01a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RCO.T01a.xtf: Fehlermeldung. Koordinaten nicht vorhanden</li></ul>
|**Referenz**| [[1]] Kap. 2.8.8 und 3.3.11.11

###### Koordinaten - RCO.T02
|ID|RCO.T02
|:--|:--
|**Bezeichnung**|```COORD```: **Codierung**
|**Beschreibung**|Die Tests müssen prüfen, ob die Koordinaten den Codierungsregeln entsprechen
|**Testvoraussetzung**|[RCO.T02a.xtf](../data/RCO.T02a.xtf), [RCO.T02b.xtf](../data/RCO.T02b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RCO.T02a.xtf: Fehlermeldung. Falsche Codierung (```<C4>```)</li><li>RCO.T02b.xtf: Fehlermeldung. Redundante Koordinaten(```<C2>```)</li></ul>
|**Referenz**|[[1]] Kap. 2.8.8 und 3.3.11.11

###### Koordinaten - RCO.T03
|ID|RCO.T03
|:--|:--
|**Bezeichnung**|```COORD```: **Wertbereich**
|**Beschreibung**|Die Tests müssen prüfen, ob die Koordinaten der Definition im INTERLIS-Datenmodell entsprechen
|**Testvoraussetzung**|[RCO.T03a.xtf](../data/RCO.T03a.xtf), [RCO.T03b.xtf](../data/RCO.T03b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RCO.T03a.xtf: Fehlermeldung. ```<C2>``` nicht im Wertbereich</li><li>RCO.T03b.xtf: Fehlermeldung. ```<C3>``` nicht erlaubt, weil Wertbereich für 2D-Koordinaten ist</li></ul>
|**Referenz**|[[1]] Kap. 2.8.8 und 3.3.11.11

## Geometrische Attribute: Linienzüge
|ID|RPO
|:--|:--
|**Bezeichnung**|```POLYLINE```
|**Beschreibung**|Für die Validierung der Attributwerten von Typ ```POLYLINE``` gelten die im [[1]] Kap. 3.3.11.12 definierten Regeln
|**Details**|<ul><li>Angaben in ```PolylineValue``` müssen der ```AttrTypeDef``` ( [[1]] Kap. 2.6 und 2.8.12.2) im INTERLIS-Datenmodell entsprechen</li><li>Für die Validierung der Geometrie eines Linienzugs gelten zusätzlich die im [[1]] Kap. 2.8.12 definierten Regeln</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.12, 2.8.12.2 und 3.3.11.12

### Testfälle
###### Linienzüge - RPO.T01
|ID|RPO.T01
|:--|:--
|**Bezeichnung**|```POLYLINE```: **Linienzug**
|**Beschreibung**|Der Test muss die Validität eines Linienzugs prüfen
|**Testvoraussetzung**|[RPO.T01a.xtf](../data/RPO.T01a.xtf)
|**Beispiel**|<p align="center"><img src="https://raw.githubusercontent.com/geoadmin/suite-interlis/master/doc/img/rpo.t01.png" height="384" title="RPO.T01"><br/>```POLYLINE WITH (STRAIGHTS, ARCS) VERTEX LKoord;```
|**Erwartetes Ergebnis**|<ul><li>RPO.T01a.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.12 und 3.3.11.12

###### Linienzüge - RPO.T02
|ID|RPO.T02
|:--|:--
|**Bezeichnung**|```POLYLINE```: **einfacher Linienzug**
|**Beschreibung**|Die Tests müssen die Validität eines einfachen Linienzugs prüfen ([[1]] Kap. 2.8.12.2, Regel ```WITHOUT OVERLAPS```)
|**Testvoraussetzung**|[RPO.T02a.xtf](../data/RPO.T02a.xtf), [RPO.T02b.xtf](../data/RPO.T02b.xtf), [RPO.T02c.xtf](../data/RPO.T02c.xtf)
|**Beispiel**|<p align="center"><img src="img/rpo.t02.png" height="384" title="RPO.T02"><br/>```POLYLINE WITH (STRAIGHTS, ARCS) VERTEX LKoord WITHOUT OVERLAPS > 1;```
|**Erwartetes Ergebnis**|<ul><li>RPO.T02a.xtf: Fehlermeldung, weil Selbstüberschneidung und Kurvenstücke mehrmals benutzt</li><li>RPO.T02b.xtf: Fehlermeldung, weil Selbstüberschneidung</li><li>RPO.T02c.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.12.2 und 3.3.11.12

###### Linienzüge - RPO.T03
|ID|RPO.T03
|:--|:--
|**Bezeichnung**|**Toleranz bei ARC**
|**Beschreibung**|Die Tests müssen die Toleranz prüfen ([[1]] Kap. 2.8.12.2, Regel ```WITHOUT OVERLAPS > 1;```)
|**Testvoraussetzung**|[RPO.T03a.xtf](../data/RPO.T03a.xtf), [RPO.T03b.xtf](../data/RPO.T03b.xtf)
|**Beispiel**|<p align="center"><img src="img/rpo.t03.png" title="RPO.T03"><br/>```POLYLINE WITH (STRAIGHTS, ARCS) VERTEX LKoord WITHOUT OVERLAPS > 0.10;```
|**Erwartetes Ergebnis**|<ul><li>RPO.T01a.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.12 und 3.3.11.12

## Geometrische Attribute: Einzelflächen und Gebietseinteilungen
|ID|RSU
|:--|:--
|**Bezeichnung**|```SURFACE```
|**Beschreibung**|Für die Validierung der Attributwerten von Typ ```SURFACE``` gelten die im [[1]] Kap. 3.3.11.13 definierten Regeln
|**Details**|<ul><li>Angaben in ```SurfaceValue``` müssen der ```AttrTypeDef``` ( [[1]] Kap. 2.6 und 2.8.12.2) im INTERLIS-Datenmodell entsprechen</li><li>Für die Validierung der Geometrie gelten zusätzlich die im [[1]] Kap. 2.8.12 und 2.8.13 definierten Regeln</li><li>Geometrische Bedingungen, die mit der Standardfunktion ```areAreas``` durchgesetzt werden ([[1]] Kap. 2.12 und 2.14), müssen zusätzlich geprüft werden</li></ul>
|**Referenz**|[[1]] Kap. 2.6, 2.8.12, 2.8.12.2, 2.8.13, 2.12, 2.14 und 3.3.11.13

### Testfälle
###### Einzelflächen und Gebietseinteilungen - RSU.T01
|ID|RSU.T01
|:--|:--
|**Bezeichnung**|```AREA```
|**Beschreibung**|Der Test muss prüfen, ob zwei Polygone der ```AREA```-Definition entsprechen
|**Testvoraussetzung**|[RSU.T01a.xtf](../data/RSU.T01a.xtf), [RSU.T01b.xtf](../data/RSU.T01b.xtf), [RSU.T01c.xtf](../data/RSU.T01c.xtf)
|**Beispiel**|<p align="center"><img src="img/rsu.t01.png" height="384" title="RSU.T01"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T01a.xtf: Fehlermeldung. die Fläche teilen nicht die gleichen Kurvenstücke (eine Fläche hat einen Stützpunkt mehr)</li><li>RSU.T01b.xtf: keine Fehlermeldung</li><li>RSU.T01c.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T02
|ID|RSU.T02
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T02a.xtf](../data/RSU.T02a.xtf) (```AREA```), [RSU.T02b.xtf](../data/RSU.T02b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t02.png" height="384" title="RSU.T02"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T02a.xtf: keine Fehlermeldung</li><li>RSU.T02b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T03
|ID|RSU.T03
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T03a.xtf](../data/RSU.T03a.xtf) (```AREA```), [RSU.T03b.xtf](../data/RSU.T03b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t03.png" height="384" title="RSU.T03"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T03a.xtf: Fehlermeldung</li><li>RSU.T03b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T04
|ID|RSU.T04
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T04a.xtf](../data/RSU.T04a.xtf) (```AREA```), [RSU.T04b.xtf](../data/RSU.T04b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t04.png" height="384" title="RSU.T04"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T04a.xtf: keine Fehlermeldung</li><li>RSU.T04b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T05
|ID|RSU.T05
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T05a.xtf](../data/RSU.T05a.xtf) (```AREA```), [RSU.T05b.xtf](../data/RSU.T05b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t05.png" height="384" title="RSU.T05"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T05a.xtf: keine Fehlermeldung</li><li>RSU.T05b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T06
|ID|RSU.T06
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T06a.xtf](../data/RSU.T06a.xtf) (```AREA```), [RSU.T06b.xtf](../data/RSU.T06b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t06.png" height="384" title="RSU.T06"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T06a.xtf: Fehlermeldung</li><li>RSU.T06b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T07
|ID|RSU.T07
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T07a.xtf](../data/RSU.T07a.xtf) (```AREA```), [RSU.T07b.xtf](../data/RSU.T07b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t07.png" height="384" title="RSU.T07"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T07a.xtf: Fehlermeldung</li><li>RSU.T07b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T08
|ID|RSU.T08
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T08a.xtf](../data/RSU.T08a.xtf) (```AREA```), [RSU.T08b.xtf](../data/RSU.T08b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t08.png" height="384" title="RSU.T08"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T08a.xtf: Fehlermeldung</li><li>RSU.T08b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T09
|ID|RSU.T09
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T09a.xtf](../data/RSU.T09a.xtf) (```AREA```), [RSU.T09b.xtf](../data/RSU.T09b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t09.png" height="384" title="RSU.T09"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T09a.xtf: Fehlermeldung</li><li>RSU.T09b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T10
|ID|RSU.T10
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T10a.xtf](../data/RSU.T10a.xtf) (```AREA```), [RSU.T10b.xtf](../data/RSU.T10b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t10.png" height="384" title="RSU.T10"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T10a.xtf: Fehlermeldung</li><li>RSU.T10b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T11
|ID|RSU.T11
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T11a.xtf](../data/RSU.T011.xtf) (```AREA```), [RSU.T011.xtf](../data/RSU.T011.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t11.png" height="384" title="RSU.T11"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T11a.xtf: Fehlermeldung</li><li>RSU.T11b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T12
|ID|RSU.T12
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T12a.xtf](../data/RSU.T12a.xtf) (```AREA```), [RSU.T12b.xtf](../data/RSU.T12b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t12.png" height="384" title="RSU.T12"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T12a.xtf: Fehlermeldung</li><li>RSU.T12b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

###### Einzelflächen und Gebietseinteilungen - RSU.T13
|ID|RSU.T13
|:--|:--
|**Bezeichnung**|**Validität einer Geometrie**
|**Beschreibung**|Die Tests müssen die Validität einer Geometrie prüfen
|**Testvoraussetzung**|[RSU.T13a.xtf](../data/RSU.T13a.xtf) (```AREA```), [RSU.T13b.xtf](../data/RSU.T13b.xtf) (```SURFACE```)
|**Beispiel**|<p align="center"><img src="img/rsu.t13.png" height="384" title="RSU.T13"></p>
|**Erwartetes Ergebnis**|<ul><li>RSU.T13a.xtf: Fehlermeldung</li><li>RSU.T13b.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.8.13 und 3.3.11.13

## Kardinalität
|ID|RKA
|:--|:--
|**Bezeichnung**|**Kardinalität der Attributen**
|**Beschreibung**|Für die Validierung der Kardinalität, muss die Anzahl der nötigen/erlaubten Objekte der ```AttrTypeDef``` ([[1]] Kap. 2.6.1) im INTERLIS-Datenmodell entsprechen
|**Details**|<ul><li>Es gelten zusätzlich die im [[1]] Kap. 2.7.3 definierten Regeln</li></ul>
|**Referenz**| [[1]] Kap. 2.6.1 und 2.7.3

### Testfälle
###### Kardinalität - RKA.T01
|ID|RKA.T01
|:--|:--
|**Bezeichnung**|```MANDATORY```
|**Beschreibung**|Die Tests müssen die Regeln für die Kardinalität der Attribute prüfen.
|**Testvoraussetzung**|[RKA.T01a.xtf](../data/RKA.T01a.xtf), [RKA.T01b.xtf](../data/RKA.T01b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKA.T01a.xtf: keine Fehlermeldung</li><li>RKA.T01b.xtf: Fehlermeldung. Fehlendes obligatorisches Attribut</li></ul>
|**Referenz**|[[1]] Kap. 2.6.1 und 2.7.3



###### Kardinalität - RKA.T02
|ID|RKA.T02
|:--|:--
|**Bezeichnung**|```BAG OF```
|**Beschreibung**|Die Tests müssen die Regeln für die Kardinalität der Attribute prüfen.
|**Testvoraussetzung**|[RKA.T02a.xtf](../data/RKA.T02a.xtf), [RKA.T02b.xtf](../data/RKA.T02b.xtf), [RKA.T02c.xtf](../data/RKA.T02c.xtf), [RKA.T02d.xtf](../data/RKA.T02d.xtf) RKA.T02c.xtf
|**Erwartetes Ergebnis**|<ul><li>RKA.T02a.xtf: keine Fehlermeldung</li><li>RKA.T02b.xtf: Fehlermeldung. Fehlendes obligatorisches Attribut</li><li>RKA.T02c.xtf: Fehlermeldung. Die Struktur darf nicht mehr als zweimal vorkommen</li><li>RKA.T02d.xtf: Fehlermeldung: falsche Codierung (mehrere Tags ```Namen```)</li></ul>
|**Referenz**|[[1]] Kap. 2.6.1 und 2.7.3

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
[2]: bib.md#2-w3c-extensible-markup-language-xml-10-fifth-edition-26112008
[3]: bib.md#3-ietf-rfc-uniform-resource-identifiers-uri-generic-syntax-08-1998
[4]: bib.md#4-w3c-xmlid-version-10-09-09-2005-online-available-httpswwww3orgtrxml-id
