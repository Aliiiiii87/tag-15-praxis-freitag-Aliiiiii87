[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/2cxJlLeb)
# Grundlagen Woche 3, Tag 5: Videothek

<p align="center">
  <img width="600" height="340" src="img/best-star-wars-meme.webp" />
</p>

#### Beschreibung:

Willkommen zurück zu eurer 3. Praxisaufgabe!
In der heutigen Aufgabe seid ihr die Inhaber*In einer digitalen Videothek und sollt passend zu dieser ein Programm entwickeln,
welches euch beim Verwalten der Filme und beim Abwickeln eures Geschäfts unterstützt.

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Bevor ihr zur nächsten Aufgabe weiter geht, testet euren Code! Er sollte nicht nur kompilieren und ausführen, sondern auch das richtige, gewünschte Ergebnis ergeben.
- Bitte push am Ende des Tages unbedingt dein Projekt zu Github.

---

<details>
<summary> <b> Aufgabe 1 - Das Angebot ansehen. </b> </summary>

In der Datei _Videothek.kt_ findest du bereits ein angelegtes Sortiment. 
Mache dich damit vertraut wie dieses Sortiment aussieht, und wie es abgespeichert ist.
Um zu testen, ob du die Datenstrukturen verstanden hast, füge noch einen Film deiner Wahl zum Sortiment hinzu.
Vergiss nicht, dem Film auch einen Preis, Genre und Bewertungen hinzuzufügen.


Wir haben euch außerdem eine Datei _Test.kt_ erstellt, in welcher ihr beliebigen Code austesten könnt.
Benutzt diese, wofür ihr möchtet. 

**Dateien für die Aufgabe:** 
*Videothek.kt*
*Test.kt*
</details>

---

<details>
<summary> <b> Aufgabe 2 - Preise für Filme festlegen </b> </summary>

Aktuell haben alle unsere Filme den gleichen Preis: alle kosten genau 1.0 €. 
Wir möchten eine Funktion schreiben, die uns einen zufälligen Preis vorschlagen kann.

Schreibe eine neue Funktion in der Datei _Random.kt_: 
Diese Funktion sollte als Ergebnis einen zufälligen Preis zwischen 2.0 € und 5.0 € generieren.

Passe nun unser Sortiment in _Videothek.kt_ an: 
Die Preisliste soll nun jedem Film einen zufälligen Preis zuweisen.

**Dateien für die Aufgabe:**
*Random.kt*
*Videothek.kt*

</details>

---

<details>
<summary> <b> Aufgabe 3a - Preisabfrage für einen Film </b> </summary>

Als Nächstes möchten wir eine Funktion implementieren,
die uns für einen beliebigen Film den aktuellen Preis zurückgibt.

**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 3b - Genre-Abfrage für einen Film </b> </summary>

Da es mit Preisen so super geklappt hat, möchten wir eine Funktion implementieren,
die uns für einen beliebigen Film das Genre zurückgibt.

**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 3c - Bewertung eines Film </b> </summary>

Wir möchten nun eine Funktion implementieren, die wieder einen Film erwartet, 
und uns für diesen Film die **durchschnittliche** Bewertung zurückgibt. 

**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 4a - Günstigster Film </b> </summary>

Schreibe eine Funktion, die den günstigsten Film zurückgibt.
**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 4b - Am besten bewertet </b> </summary> 

Schreibe eine Funktion, die den Film, mit der höchsten Bewertung zurückgibt.
**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 5a - Sortiment alphabetisch sortieren </b> </summary>

Schreibe eine Funktion, die das Sortiment nach dem Alphabet sortiert zurückgibt.
**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 5b - Sortiment nach Preis sortieren </b> </summary>

Schreibe eine Funktion, die das Sortiment nach dem Preis sortiert zurückgibt.
**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 6 - Einen Film verkaufen </b> </summary>

Unser nächster Schritt ist es, eine Kunden-Interaktion zu programmieren.
Schreibe eine Funktion, die das Sortiment ausdruckt und den Kunden einen Film auswählen lässt (via readln()).
Der Film soll aus dem Sortiment genommen werden.
Rückgabewert: hat das geklappt oder nicht
**Dateien für die Aufgabe:**
*Abfragen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 7 - Probelauf </b> </summary>

Als letzten Schritt möchten wir einen Probelauf für unsere Videothek durchführen.
In der Datei **main.kt** wollen wir: 
- Den Kunden begrüßen
- Dem Kunden das gesamte Sortiment anzeigen
- Dem Kunden die 3 billigsten Filme als angebot anbieten
- Dem Kunden die 3 am besten bewerteten Filme anzeigen
- Den Kunden einen Film auswählen lassen, 
- Dem Kunden den Preis, das Genre und die Bewertung dieses Filmes ausdrucken
- den Film aus dem Sortiment nehmen
</details>

---

<details>
<summary> <b> Bonus </b> </summary>

Schreibe eine Funktion, die ein Genre als Parameter erwartet, 
und uns das gefilterte Sortiment zurückgibt.

<details>
<summary> <b> Lösung </b> </summary>
sortiment.filter {(film, preis) -> genreAuflistung[film]!! == genre)}
</details>
</details>

---
