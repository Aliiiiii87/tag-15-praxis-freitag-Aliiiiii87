fun main (){
    var filmListe = filmListe.joinToString("\n")
    println(filmListe)
    println("Suchen sie sich ein Filmtietel aus den sie ausleihen möchten !")
    var eingabe1 = readln()
    var film = eingabe1
    var preis = preisMovie(film, filmToPrice)
    println("Der Preis von $film ist : $preis€ für 1 Woche ")
    println("\nMöchten Sie den Film ausleihen? mit enter bestätigen")
    var bestätigen = readln()
    println("----------------------------------------------------------------------")
    println("Herrzlichen Glückwunsch Geben Sie bitte den Film ein um das Genre zu erfahren😍")
    var eingabe = readln()
    var film2 = eingabe
    var genre = genreSearch(film, filmToGenre)
    println("Das Genre von $film2 ist: $genre")
    println("----------------------------------------------------------------------")
    println("Bitte geben Sie den Filmtitel um die Bewertung zu sehen:")
    val ausgewählterFilm = readln()
    val durchschnittRating = filmBewertung(ausgewählterFilm)
    println("Durchschnittliche Bewertung von '$ausgewählterFilm': $durchschnittRating")
    println("----------------------------------------------------------------------")
    var günstigerPreis = günstigsterFilm(0.0, filmToPrice)
    println("Der günstigste Film in unserem Sortiemnt ist $günstigerPreis")
    println("------------------------------------------------------------------------")
    var bestofbestEnd = besterFilm(filmRatings)
    println("$bestofbestEnd")
    println("------------------------------------------------------------------------")
    println("${alaphabet()}")
    println("-------------------------------------------------------------------------")
    println(preisOrdung())
    println("------------------------------------------------------------------------")
    println(deletefilmSortiement(film, film2, ausgewählterFilm))
    println("$filmListe")
}


/* Ich habe mich bei diesen Aufgaben mehr auf den Code Konzentriert als uf das UI !
  das ist mein akzueller Wissensstand ! ich habe die Aufgaben selber bearbeitet es gibt 1 punkt den ich nicht lösen konnte


 */