# Transfer-Struktur

## Transfer
|ID|RTR
|:--|:--
|**Bezeichnung**|**TRANSFER**
|**Beschreibung**|Für die Validierung der Transfer-Struktur gelten die im [[1]] Kap. 3.3.3 definierten Regeln
|**Details**|<ul><li>Die Angabe ```<?xml version="1.0" encoding="UTF-8">``` ist verbindlich</li><li>Die Angabe ```xmlns="http://www.interlis.ch/INTERLIS2.3"``` im Tag ```TRANSFER``` ist verbindlich</li><li>Die XML-Tags müssen in der richtigen Reihenfolge (```TRANSFER```, ```HEADERSECTION```, ```DATASECTION```) sein</li>
|**Referenz**|[[1]] Kap. 3.3.3

### Testfälle
###### Transfer - RTR.T01
|ID|RTR.T01
|:--|:--
|**Bezeichnung**|**TRANSFER: XML-Deklaration**
|**Beschreibung**|Der Test muss prüfen, ob die XML-Deklaration vorhanden ist
|**Testvoraussetzung**|[RTR.T01a.xtf](../data/RTR.T01a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTR.T01a.xtf: Fehlermeldung. XML-Deklaration nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.3<br/>[[2]] Kap. 2.8 (https://www.w3.org/TR/xml/#sec-prolog-dtd)



###### Transfer - RTR.T02
|ID|RTR.T02
|:--|:--
|**Bezeichnung**|**TRANSFER: Aufbau der Transferdatei**
|**Beschreibung**|Die Tests müssen prüfen, ob die XML-Tags ```TRANSFER```, ```HEADERSECTION```, ```DATASECTION``` vorhanden sind
|**Testvoraussetzung**|[RTR.T02a.xtf](../data/RTR.T02a.xtf), [RTR.T02b.xtf](../data/RTR.T02b.xtf), [RTR.T02c.xtf](../data/RTR.T02c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTR.T02a.xtf: Fehlermeldung. ```TRANSFER``` nicht vorhanden</li><li>RTR.T02b.xtf: Fehlermeldung. ```HEADERSECTION``` nicht vorhanden</li><li>RTR.T02c.xtf: Fehlermeldung. ```DATASECTION``` nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.3

###### Transfer - RTR.T03
|ID|RTR.T03
|:--|:--
|**Bezeichnung**|**TRANSFER: Reihenfolge der Elemente**
|**Beschreibung**|Der Test muss prüfen, ob die XML-Tags ```TRANSFER```, ```HEADERSECTION```, ```DATASECTION``` in der richtigen Reihenfolge sind
|**Testvoraussetzung**|[RTR.T03a.xtf](../data/RTR.T03a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTR.T03a.xtf: Fehlermeldung. ```HEADERSECTION``` und ```DATASECTION``` erfolgen in umgekehrter Reihenfolge</li></ul>
|**Referenz**|[[1]] Kap. 3.3.3

###### Transfer - RTR.T04
|ID|RTR.T04
|:--|:--
|**Bezeichnung**|**TRANSFER: xmlns-Attribut**
|**Beschreibung**|Der Test muss prüfen, ob das xmlns-Attribut im Tag ```TRANSFER``` vorhanden ist
|**Testvoraussetzung**|[RTR.T04a.xtf](../data/RTR.T04a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTR.T04a.xtf: Fehlermeldung. xmlns-Attribut nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.3

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
[2]: bib.md#2-w3c-extensible-markup-language-xml-10-fifth-edition-26112008
