# Zeichencodierung

## Zeichencodierung
|ID|RZe
|:--|:--
|**Bezeichnung**|**Zeichencodierung**
|**Beschreibung**|Für die Codierung von XML-String bzw. XML-NormalizedString gelten die im [[1]] Kap. 3.3.2 und Anhang B definierten Regeln
|**Referenz**|[[1]] Kap. 3.3.2 und Anhang B

### Testfälle
###### Zeichencodierung - RZe.T01
|ID|RZe.T01
|:--|:--
|**Bezeichnung**|**Zeichencodierung**
|**Beschreibung**|Die Tests müssen prüfen, ob die Zeichen den Codierungsregeln gemäss UTF-8 entsprechen
|**Testvoraussetzung**|[RZe.T01a.xtf](../data/RZe.T01a.xtf), [RZe.T01b.xtf](../data/RZe.T01b.xtf), [RZe.T01c.xtf](../data/RZe.T01c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RZe.T01a.xtf: keine Fehlermeldung</li><li>RZe.T01b.xtf: Fehlermeldung. Datei nicht als UTF-8 codiert </li><li>RZe.T01c.xtf: Fehlermeldung. Ungültige UTF-8-Zeichen</li></ul>
|**Referenz**|[[1]] Kap. 3.3.2

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
