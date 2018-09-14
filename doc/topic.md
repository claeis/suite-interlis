# Datenbereich: Themen

## TOPIC
|ID|RTO
|:--|:--
|**Bezeichnung**|**TOPIC**
|**Beschreibung**|Für die Validierung eines **Topic** gelten die im [[1]] Kap. 3.3.6 definierten Regeln
|**Details**|<ul><li>Der Wert ```%Model.Topic%``` muss den ```ModelDef``` ([[1]] Kap. 2.5.1) und ```TopicDef``` ([[1]] Kap. 2.5.2) im INTERLIS-Datenmodell entsprechen</li><li>Jeder Datenbehälter (```Basket```) erhält eine Behälteridentifikation (XML-Attribut ```BID```). Wo nötig, muss die BID-Angabe der ```TopicDef``` ([[1]] Kap. 2.5.2) im INTERLIS-Datenmodell entsprechen. Es gelten zusätzlich die im [[1]] Kap. 2.8.9 definierten Regeln</li><li>Alle ```BID``` inkl. alle ```TID``` ([Regel Klassen](classes.md#regel-klassen)) innerhalb eines Transfers müssen eindeutig sein ([[1]] Kap. 3.3.7 und 3.2.6)</li>
|**Referenz**|[[1]] Kap. 2.5.1, 2.5.2, 2.8.9, 3.2.5, 3.2.6 und 3.3.6</td>

### Testfälle
###### Themen - RTO.T01
|ID|RTO.T01
|:--|:--
|**Bezeichnung**|**Themen:** ```TopicDef```
|**Beschreibung**|Die Tests müssen prüfen, ob der Wert ```%Model.Topic%``` den Definitionen im INTERLIS-Datenmodell
|**Testvoraussetzung**|[RTO.T01a.xtf](../data/RTO.T01a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTO.T01a.xtf: Fehlermeldung. Wert ```%Topic%``` stimmt nicht</li></ul>
|**Referenz**|[[1]] Kap. 2.5.1, 3.3.4 und 3.3.6</td>

###### Themen - RTO.T02
|ID|RTO.T02
|:--|:--
|**Bezeichnung**|**Themen:** ```BID```
|**Beschreibung**|Die Tests müssen prüfen, ob der ```BID``` vorhanden ist und der richtigen Codierung entspricht
|**Testvoraussetzung**|[RTO.T02a.xtf](../data/RTO.T02a.xtf), [RTO.T02b.xtf](../data/RTO.T02b.xtf), [RTO.T02c.xtf](../data/RTO.T02c.xtf), [RTO.T02d.xtf](../data/RTO.T02d.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTO.T02a.xtf: Fehlermeldung. ```BID``` nicht vorhanden</li><li>RTO.T02b.xtf: Fehlermeldung. ```BID``` leer</li><li>RTO.T02c.xtf: Fehlermeldung. Die ```BID``` werden als XML-ID *à la INTERLIS* codiert. Erstes Zeichen muss Buchstabe, Ziffer oder Unterstrich sein</li><li>RTO.T02d.xtf: Fehlermeldung. Zeichen mit Umlaut sind nicht zulässig)</li></ul>
|**Referenz**|[[1]] Kap. 2.8.9 und 3.3.1<br/>[Objektidentifikation](identifiers.md)

###### Themen - RTO.T03
|ID|RTO.T03
|:--|:--
|**Bezeichnung**|**Themen:** ```BID``` *und* ```TID```
|**Beschreibung**|Die Tests müssen prüfen, ob alle ```BID``` inkl. alle ```TID``` innerhalb des Transfers eindeutig sind
|**Testvoraussetzung**|[RTO.T03a.xtf](../data/RTO.T03a.xtf), [RTO.T03b.xtf](../data/RTO.T03b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTO.T03a.xtf: Fehlermeldung. Doppelte ```BID```</li><li>RTO.T03b.xtf: Fehlermeldung. Gleicher Wert in ```BID``` und in ```TID```</li></ul>
|**Referenz**|[[1]] Kap. 3.3.7 und 3.2.6

###### Themen - RTO.T04
|ID|RTO.T04
|:--|:--
|**Bezeichnung**|**Themen: Behälter und Modelle**
|**Beschreibung**|Der Test muss prüfen Behälter, die unterschiedlichen Modellen entsprechen
|**Testvoraussetzung**|[RTO.T04a.xtf](../data/RTO.T04a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTO.T04a.xtf: keine Fehlermeldung</li></ul>

###### Themen - RTO.T05
|ID|RTO.T05
|:--|:--
|**Bezeichnung**|**Themen: leere Behälter**
|**Beschreibung**|Die Tests müssen die Regeln für leere Behälter prüfen
|**Testvoraussetzung**|[RTO.T05a.xtf](../data/RTO.T05a.xtf), [RTO.T05b.xtf](../data/RTO.T05b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTO.T05a.xtf: keine Fehlermeldung</li><li>RTO.T05b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 3.3.3, 3.3.5 und 3.3.6

###### Themen - RTO.T06
|ID|RTO.T06
|:--|:--
|**Bezeichnung**|**Themen: : Behälter und importierte Modelle**
|**Beschreibung**|Die Tests müssen Behälter prüfen, die auf Basis von importierten Modellen definiert werden
|**Testvoraussetzung**|[RTO.T06a.xtf](../data/RTO.T06a.xtf), [RTO.T06b.xtf](../data/RTO.T06b.xtf), [RTO.T06c.xtf](../data/RTO.T06c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RTO.T06a.xtf: keine Fehlermeldung</li><li>RTO.T06b.xtf: keine Fehlermeldung</li><li>RTO.T06c.xtf: Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.5.1 und Appendix C

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
[2]: bib.md#2-w3c-extensible-markup-language-xml-10-fifth-edition-26112008
