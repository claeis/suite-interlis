# Datenbereich: Klassen

## Klassen
|ID|RKl
|:--|:--
|**Bezeichnung**|**Klassen**
|**Beschreibung**|Für die Validierung der Instanzen einer Klasse gelten die im [[1]] Kap. 3.3.7 fürs Element ```Object``` definierten Regeln
|**Details**|<ul><li>Der Wert ```%Model.Topic.Class%``` muss der ```ClassDef``` ([[1]] Kap. 2.5.3) im INTERLIS-Datenmodell entsprechen</li><li>Jede Objectinstanz erhält implizit eine Transferidentifikation (XML-Attribut ```TID```). Wo nötig, muss die ```TID``` Angabe der ```TopicDef``` ([[1]] Kap. 2.5.2) bzw. der ```ClassDef``` ([1] Kap. 2.5.3) im INTERLIS-Datenmodell entsprechen. Es gelten zusätzlich die im [[1]] Kap. 2.8.9 definierten Regeln</li><li>Alle ```TID``` inkl. alle ```BID``` ([Regel Topic](topic.md#regel-topic)) innerhalb eines Transfers müssen eindeutig sein ([[1]] Kap. 3.3.7 und 3.2.6)</li></ul>
|**Referenz**|[[1]] Kap. 2.5.2, 2.5.3, 2.7.1, 2.8.9, 3.2.6, 3.3.7 und 3.3.9.2

### Testfälle
###### Klassen - RKl.T01
|ID|RKl.T01
|:--|:--
|**Bezeichnung**|```ClassDef```
|**Beschreibung**|Der Test muss prüfen, ob der Wert ```%Model.Topic.Class%``` der ```ClassDef``` entspricht
|**Testvoraussetzung**|[RKl.T01a.xtf](../data/RKl.T01a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKl.T01a.xtf: Fehlermeldung. Wert ```%Class%``` stimmt nicht</li></ul>
|**Referenz**| [[1]] Kap. 3.3.7

###### Klassen - RKl.T02
|ID|RKl.T02
|:--|:--
|**Bezeichnung**|```TID```
|**Beschreibung**|Die Tests müssen prüfen, ob die ```TID``` vorhanden und eindeutig sind
|**Testvoraussetzung**|[RKl.T02a.xtf](../data/RKl.T02a.xtf), [RKl.T02b.xtf](../data/RKl.T02b.xtf), [RKl.T02c.xtf](../data/RKl.T02c.xtf), [RKl.T02d.xtf](../data/RKl.T02d.xtf), [RKl.T02e.xtf](../data/RKl.T02e.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKl.T02a.xtf: Fehlermeldung. ```TID``` leer</li><li>RKl.T02b.xtf: Fehlermeldung. ```TID``` nicht vorhanden</li><li>RKl.T02c.xtf: Fehlermeldung. Doppelte ```TID```</li><li>RKl.T02d.xtf: Fehlermeldung. ```TID``` werden als XML-ID *à la INTERLIS* codiert. Erstes Zeichen muss Buchstabe, Ziffer oder Unterstrich sein</li><li>RKl.T02e.xtf: Fehlermeldung. Zeichen mit Umlaut sind nicht zulässig</li></ul>
|**Referenz**|[[1]] Kap. 2.8.9, 3.3.1 und 3.3.7<br/>[Objektidentifikation](identifiers.md)

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
