# Test Suite - Routine
Die Routine wurde als gradle-Projekt entwickelt.

## Voraussetzungen
- JAVA Development Kit
- [iG/Check](https://www.interlis.ch/downloads/igcheck) (lokal installiert)

## Getting Started
Das Repository clonen/herunterladen und das Arbeitsverzeichnis wechseln:

```
cd suite-interlis/routine
```

### Die Test Suite ausführen
```
gradlew -Pvendor=<vendor> test
```
Wo ``<vendor>`` kann ``ilivalidator`` oder ``ig/check`` sein.

Die Ergebnisse stehen in ``/build/reports/tests/test/index.html`` zur Verfügung.

### Die JavaDoc kompilieren
```
gradlew -Pvendor=<vendor> javadoc
```
Die JavaDoc steht in ``/build/docs/javadoc/index.html`` zur Verfügung.

### Muss ein Proxyserver verwendet werden?
```
gradlew -Dhttp.proxyHost=theProxyServer -Dhttp.proxyPort=theProxyPort -Pvendor=<vendor> test
```
### Ist JAVA-JDK nicht in PATH?
```
gradlew -Dorg.gradle.java.home=/pathToJavaJDK -Pvendor=<vendor> test
```
### Ist ics.exe (iG/Check) nicht in PATH?
- Variante 1
```
SET PATH=%PATH%;'pathToics.exe'
gradlew -Pvendor=ig/check test
```
- Variante 2
```
gradlew -Pvendor=ig/check -Pics=pathToics.exe test
```
Der Parameter ``-Pics`` kann zusätzlich benutzt werden, um verschiedene Versionen des iG/Checks zu testen.

### Andere Versionen des ilivalidators testen
Die Routine ist prekonfiguriert um den ilivalidator Version 1.9.2 zu testen.
Um andere Versionen des ilivalidators zu testen, muss die Information ``compile 'ch.interlis:ilivalidator:1.9.2-SNAPSHOT'`` in der Datei ``build.gradle`` (unter ``dependencies``) entsprechend angepasst werden.

### Spezifische Tests ausschalten
Alle Test-Typen der Routine sind in der Datei ``build.gradle`` (unter ``test``) gelistet. Um einen Test-Typ auszuschalten, muss die entsprechende Linie auskommentiert werden.

### Datei interlis2.cfg
Spezifische iG/Check-Einstellungen können zusätzlich in der Datei ``interlis2.cfg`` im Verzeichnis ``ichcheck2`` gesetzt werden.
