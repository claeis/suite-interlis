# Datenbereich: Beziehungen

## Beziehungen
|ID|RBe
|:--|:--
|**Bezeichnung**|**Beziehungen**
|**Beschreibung**|Für die Validierung der Beziehungen gelten allgemein die im [[1]] Kap. 3.3.9 definierten Regeln
|**Referenz**|[[1]] Kap. 3.3.9

### Testfälle
###### Beziehungen - RBe.T01
|ID|RBe.T01
|:--|:--
|**Bezeichnung**|```Referenzen```
|**Beschreibung**|Die Tests müssen prüfen, dass bei externen Rollen die Referenzen zusätzlich mit einem XML-Attribut ```BID``` codiert werden. *«Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), wird die Referenz zusätzlich mit BID codiert. In BID wird dabei die Behälteridentifikation des referenzierten Objekts eingetragen.»*
|**Testvoraussetzung**|[RBe.T01a.xtf](../data/RBe.T01a.xtf), [RBe.T01b.xtf](../data/RBe.T01b.xtf), [RBe.T01c.xtf](../data/RBe.T01c.xtf), [RBe.T01d.xtf](../data/RBe.T01d.xtf)
|**Erwartetes Ergebnis**|<ul><li>RBe.T01a.xtf: keine Fehlermeldung</li><li>RBe.T01b.xtf: Fehlermeldung. ```BID``` nicht vorhanden</li><li>RBe.T01c.xtf: keine Fehlermeldung.</li><li>RBe.T01d.xtf: Fehlermeldung. ```BID``` nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.9.2

## Eingebettete Beziehungen
|ID|REB
|:--|:--
|**Bezeichnung**|**Eingebettete Beziehungen**
|**Beschreibung**|Für die Validierung einer eingebetteten Beziehung gelten die im [[1]] Kap. 3.3.9.1 definierten Regeln
|**Details**|<ul><li>Der Wert ```%RoleName%``` muss der ```RolDef``` ([[1]] Kap. 2.7.1) im INTERLIS-Datenmodell entsprechen</li><li>Zeigt die Referenz auf ein Objekt im gleichen Behälter, wird die Referenz mit ```REF``` codiert. Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), muss zusätzlich ein ```BID``` zur Verfügung stehen</li><li>Es muss geprüft werden, ob die referenzierte Objektinstanz existiert und der ```RolDef``` ([[1]] Kap. 2.7.1) im INTERLIS-Datenmodell entspricht</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 3.3.9.1

### Testfälle
###### Eingebettete Beziehungen - REB.T01
|ID|REB.T01
|:--|:--
|**Bezeichnung**|**Kardinalität {0..1} bei beiden Rollen**
|**Beschreibung**|Die Tests müssen die Regeln fürs Einbetten der Beziehungen prüfen. *«Falls bei beiden (Basis-)Rollen die maximale Kardinalität kleiner gleich 1 ist, wird bei der Ziel-Klasse der zweiten Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation und die Ziel-Klasse der ersten Rolle im selben Topic definiert ist wie die (Basis-)Assoziation, wird bei der Ziel-Klasse der ersten Rolle eingebettet…»*
|**Testvoraussetzung**|[REB.T01a.xtf](../data/REB.T01a.xtf), [REB.T01b.xtf](../data/REB.T01b.xtf), [REB.T01c.xtf](../data/REB.T01c.xtf)
|**Erwartetes Ergebnis**|<ul><li>REB.T01a.xtf: keine Fehlermeldung</li><li>REB.T01b.xtf: Fehlermeldung. Falsche Codierung</li><li>REB.T01c.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 3.3.9

###### Eingebettete Beziehungen - REB.T02
|ID|REB.T02
|:--|:--
|**Bezeichnung**|**Kardinalität {0..} bei einer der Rolle**
|**Beschreibung**|Die Tests müssen die Regeln fürs Einbetten der Beziehungen prüfen. *«Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet…»*
|**Testvoraussetzung**|[REB.T02a.xtf](../data/REB.T02a.xtf), [REB.T02b.xtf](../data/REB.T02b.xtf), [REB.T02c.xtf](../data/REB.T02c.xtf)
|**Erwartetes Ergebnis**|<ul><li>REB.T02a.xtf: keine Fehlermeldung</li><li>REB.T02b.xtf: Fehlermeldung. Falsche Codierung</li><li>REB.T02c.xtf: Fehlermeldung. Attribut ```Status``` ist obligatorisch</li></ul>
|**Referenz**|[[1]] Kap. 3.3.9

## Nicht eingebettete Beziehungen
|ID|RBk
|:--|:--
|**Bezeichnung**|**Beziehungsklassen**
|**Beschreibung**|Für die Validierung der Instanzen einer Beziehungsklasse gelten die im [[1]] Kap. 3.3.7 fürs Element ```Link``` und im [[1]] Kap. 3.3.9.2 definierten Regeln
|**Details**|<ul><li>Der Wert ```%Model.Topic.Association%``` muss der ```AssociationDef``` ([[1]] Kap. 2.7.1) im INTERLIS-Datenmodell entsprechen. Für Beziehungen ohne expliziten Namen wird der Name durch zusammenhängen der einzelnen Rollennamen gebildet (```%RoleName1RoleName2%```) ([[1]] Kap. 3.3.9.2)</li><li>Instanzen von ```Link``` haben nur eine Transferidentifikation, wenn diese im Rahmen der ```AssociationDef``` mit dem Property ```OID``` gefordert wurde ([[1]] Kap. 2.7.1)</li><li>Der Wert ```%RoleName%``` muss der ```RolDef``` ([[1]] Kap. 2.7.1) im INTERLIS-Datenmodell entsprechen</li><li>Zeigt die Referenz auf ein Objekt im gleichen Behälter, wird die Referenz mit ```REF``` codiert. Zeigt die Referenz auf ein Objekt in einem anderen Behälter (im gleichen Transfer oder sogar ausserhalb), muss zusätzlich ein ```BID``` zur Verfügung stehen</li><li>Es muss geprüft werden, ob die referenzierten Objektinstanzen existieren und der ```RolDef``` ([[1]] Kap. 2.7.1) im INTERLIS-Datenmodell entsprechen</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1, 3.3.7 und 3.3.9.2

### Testfälle
###### Nicht eingebettete Beziehungen - RBk.T01
|ID|RBk.T01
|:--|:--
|**Bezeichnung**|**Kardinalität {0..} bei der Rolle EXTERNAL**
|**Beschreibung**|Die Tests müssen die Regeln fürs Einbetten der Beziehungen prüfen. *«Falls bei einer der beiden (Basis-)Rollen die maximale Kardinalität grösser 1 ist, wird bei der Ziel-Klasse dieser Rolle eingebettet. Wenn diese Ziel-Klasse in einem anderen Topic definiert ist als die (Basis-)Assoziation, kann nicht eingebettet werden…»*
|**Testvoraussetzung**|[RBk.T01a.xtf](../data/RBk.T01a.xtf), [RBk.T01b.xtf](../data/RBk.T01b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RBk.T01a.xtf: Fehlermeldung: falsche Codierung</li><li>RBk.T01b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 3.3.9

###### Nicht eingebettete Beziehungen - RBk.T02
|ID|RBk.T02
|:--|:--
|**Bezeichnung**|**Kardinalität {0..1} bei beiden Rollen EXTERNAL**
|**Beschreibung**|Die Tests müssen die Regeln fürs Einbetten der Beziehungen prüfen. *«…(d.h., wenn die Ziel-Klassen der beiden Rollen in einem anderen Topic definiert sind als die (Basis-)Assoziation, kann nicht eingebettet werden).»*
|**Testvoraussetzung**|[RBk.T02a.xtf](../data/RBk.T02a.xtf), [RBk.T02b.xtf](../data/RBk.T02b.xtf),
|**Erwartetes Ergebnis**|<ul><li>RBk.T02a.xtf: keine Fehlermeldung</li><li>RBk.T02b.xtf: Fehlermeldung: falsche Codierung</li></ul>
|**Referenz**|[[1]] Kap. 3.3.9

###### Nicht eingebettete Beziehungen - RBk.T03
|ID|RBk.T03
|:--|:--
|**Bezeichnung**|**Beziehungsklasse mit zusätzlichen Attributen**
|**Beschreibung**|Die Tests müssen die Regeln fürs Einbetten der Beziehungen prüfen. Bei Beziehungen mit zusätzlichen Attributen (Beziehungsklassen) kann nicht eingebettet werden.
|**Testvoraussetzung**|[RBk.T03a.xtf](../data/RBk.T03a.xtf), [RBk.T03b.xtf](../data/RBk.T03b.xtf), [RBk.T03c.xtf](../data/RBk.T03c.xtf), [RBk.T03d.xtf](../data/RBk.T03d.xtf)
|**Erwartetes Ergebnis**|<ul><li>RBk.T03a.xtf: keine Fehlermeldung</li><li>RBk.T03b.xtf: Fehlermeldung: falsche Codierung</li><li>RBk.T03c.xtf: Fehlermeldung. Die Rollen der ``ASSOCIATION`` sind obligatorisch</li><li>RBk.T03d.xtf: Fehlermeldung. Doppeltes Beziehung mit gleichen Referenzen</li></ul>

## Kardinalität
|ID|RKB
|:--|:--
|**Bezeichnung**|**Kardinalität in Beziehungen**
|**Beschreibung**|Für die Validierung der Kardinalität, muss die Anzahl der nötigen/erlaubten in Beziehung stehenden Objekte der ```RolDef``` ([[1]] Kap. 2.7.1) im INTERLIS-Datenmodell entsprechen
|**Details**|<ul><li>Es gelten zusätzlich die im [[1]] Kap. 2.7.3 definierten Regeln</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 2.7.3

###### Kardinalität - RKB.T01
|ID|RKB.T01
|:--|:--
|**Bezeichnung**|**{1} bei beiden Rollen**
|**Beschreibung**|Die Tests müssen die Regeln für die Kardinalität der Beziehungen prüfen
|**Testvoraussetzung**|[RKB.T01a.xtf](../data/RKB.T01a.xtf), [RKB.T01b.xtf](../data/RKB.T01b.xtf), [RKB.T01c.xtf](../data/RKB.T01c.xtf), [RKB.T01d.xtf](../data/RKB.T01d.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKB.T01a.xtf: keine Fehlermeldung</li><li>RKB.T01b.xtf: Fehlermeldung. Fehlende Rolle (```RolleA``` in ```Klasse B```)</li><li>RKB.T01c.xtf: Fehlermeldung. Zwei Instanzen von ```B``` verweisen auf die gleiche Instanz von ```A```</li><li>RKB.T01d.xtf: Fehlermeldung. Alle Instanzen von ```A``` müssen referenziert werden.</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 2.7.3

###### Kardinalität - RKB.T02
|ID|RKB.T02
|:--|:--
|**Bezeichnung**|**{0..1} {1}**
|**Beschreibung**|Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
|**Testvoraussetzung**|[RKB.T02a.xtf](../data/RKB.T02a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKB.T02a.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 2.7.3

###### Kardinalität - RKB.T03
|ID|RKB.T03
|:--|:--
|**Bezeichnung**|**{0..1} {0..1}**
|**Beschreibung**|Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
|**Testvoraussetzung**|[RKB.T03a.xtf](../data/RKB.T03a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKB.T03a.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 2.7.3

###### Kardinalität - RKB.T04
|ID|RKB.T04
|:--|:--
|**Bezeichnung**|**{1} {0..*}**
|**Beschreibung**|Der Test muss die Regeln für die Kardinalität der Beziehungen prüfen
|**Testvoraussetzung**|[RKB.T04a.xtf](../data/RKB.T04a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKB.T04a.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 2.7.3

###### Kardinalität - RKB.T05
|ID|RKB.T05
|:--|:--
|**Bezeichnung**|**{0..1} {1}**
|**Beschreibung**|Die Tests müssen die Regeln für die Kardinalität der Beziehungen prüfen
|**Testvoraussetzung**|[RKB.T05a.xtf](../data/RKB.T05a.xtf), [RKB.T05b.xtf](../data/RKB.T05b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RKB.T05a.xtf: Fehlermeldung. Falsches Einbetten</li><li>RKB.T05b.xtf: keine Fehlermeldung</li></ul>
|**Referenz**|[[1]] Kap. 2.7.1 und 2.7.3

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
