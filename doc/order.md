# Datenbereich: Reihenfolge

## Reihenfolge der Objekte im Datenbereich
|ID|RRO
|:--|:--
|**Bezeichnung**|**Reihenfolge - Datenbereich**
|**Beschreibung**|Für die Validierung der Reihenfolge der Objektinstanzen im Datenbereich gelten die im [[1]] Kap. 3.2.5 definierten Regeln
|**Details**|<ul><li>Die Reihenfolge der Objekte im Transfer ist beliebig, insbesondere müssen die Objekte innerhalb eines Behälters nicht unbedingt nach Beziehungen geordnet oder nach Klassen gruppiert sein</li></ul>
|**Referenz**|[[1]] Kap. 3.2.5

### Testfälle
###### Reihenfolge der Objekte im Datenbereich - RRO.T01
|ID|RRO.T01
|:--|:--
|**Bezeichnung**|**Reihenfolge - Datenbereich**
|**Beschreibung**|Die Tests müssen die Regeln für die Reihenfolge der Objekte im Datenbereich prüfen
|**Testvoraussetzung**|[RRO.T01a.xtf](../data/RRO.T01a.xtf), [RRO.T01b.xtf](../data/RRO.T01b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RRO.T01a.xtf: keine Fehlermeldung</li><li>RRO.T01b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 3.2.5

## Reihenfolge innerhalb der Klasseinstanzen
|ID|RRiO
|:--|:--
|**Bezeichnung**|**Reihenfolge – innerhalb der Klasseinstanzen**
|**Beschreibung**|Für die Validierung der Reihenfolge innerhalb einer Objektinstanz gelten die im [[1]] Kap. 3.3.7 definierten Regeln
|**Details**|<ul><li>Für die Reihenfolge der Attribute, Rollen, ```EmbeddedLink```, Referenzattribute innerhalb einer (erweiterten) Klasse gilt:</li></ul><ol><li>Rollen der Basisklasse</li><li>Attribute / Referenzattribute der Basisklasse</li><li>```EmbeddedLink``` der Basisklasse</li><li>Attribute/Referenzattribute der Erweiterung</li><li>```EmbeddedLink``` der Erweiterung</li></ol><ul><li>Innerhalb der gleichen Stufe müssen die Attribute / Referenzattribute und Rollen der Definitionsreihenfolge im INTERLIS-Datenmodell entsprechen</li><li>Innerhalb der gleichen Stufe müssen die ```EmbeddedLink``` alphabetisch aufsteigend sortiert werden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.7

###### Reihenfolge innerhalb der Klasseinstanzen - RRiO.T01
|ID|RRiO.T01
|:--|:--
|**Bezeichnung**|**Reihenfolge – Klasseinstanzen**
|**Beschreibung**|Die Tests müssen die Regeln für die Reihenfolge der Objektinstanzen einer Klasse prüfen
|**Testvoraussetzung**|[RRiO.T01a.xtf](../data/RRiO.T01a.xtf), [RRiO.T01b.xtf](../data/RRiO.T01b.xtf), [RRiO.T01c.xtf](../data/RRiO.T01c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RRiO.T01a.xtf: keine Fehlermeldung</li><li>RRiO.T01b.xtf: Fehlermeldung. Falsche Reihenfolge der Attribute</li><li>RRiO.T01c.xtf:Fehlermeldung. Falsche Reihenfolge der ```EmbeddedLink```</li></ul>
|**Referenz**|[[1]] Kap. 3.3.7

###### Reihenfolge innerhalb der Klasseinstanzen - RRiO.T02
|ID|RRiO.T02
|:--|:--
|**Bezeichnung**|**Reihenfolge – Instanzen einer erweiterten Klasse**
|**Beschreibung**|Die Tests müssen die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Klasse prüfen
|**Testvoraussetzung**|[RRiO.T02a.xtf](../data/RRiO.T02a.xtf), [RRiO.T02b.xtf](../data/RRiO.T02b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RRiO.T02a.xtf: keine Fehlermeldung</li><li>RRiO.T02b.xtf: Fehlermeldung. Falsche Reihenfolge der Attribute (zuerst müssen die Attribute der Basisklasse codiert werden)</li></ul>
|**Referenz**|[[1]] Kap. 3.3.7

###### Reihenfolge innerhalb der Klasseinstanzen - RRiO.T03
|ID|RRiO.T03
|:--|:--
|**Bezeichnung**|**Reihenfolge – Instanzen einer erweiterten Beziehungsklasse**
|**Beschreibung**|Die Tests müssen die Regeln für die Reihenfolge der Objektinstanzen einer erweiterten Beziehungsklasse prüfen
|**Testvoraussetzung**|[RRiO.T03a.xtf](../data/RRiO.T03a.xtf), [RRiO.T03b.xtf](../data/RRiO.T023.xtf), [RRiO.T03c.xtf](../data/RRiO.T03c.xtf), [RRiO.T03d.xtf](../data/RRiO.T03d.xtf)
|**Erwartetes Ergebnis**|<ul><li>RRiO.T03a.xtf: keine Fehlermeldung</li><li>RRiO.T03b.xtf: Fehlermeldung. Zuerst müssen die Rollen der Basisklasse codiert werden</li><li>RRiO.T03c.xtf: Fehlermeldung. Zuerst müssen die Attribute der Basisklasse codiert werden</li><li>RRiO.T03d.xtf: Fehlermeldung. Die Rollen der Basisklasse sind obligatorisch</li></ul>
|**Referenz**|[[1]] Kap. 3.3.7

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
