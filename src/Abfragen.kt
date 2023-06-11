// TODO schreibe deinen Code hier!
fun main() {
// Aufgaben 3-6
}

fun preisMovie(film: String, preis: MutableMap<String, Double>): Double {
    var moviePreis = preis[film]
    return moviePreis ?: 0.0

}

fun genreSearch(film: String, genre: MutableMap<String, String>): String? {
    return genre[film]
}


fun filmBewertung(film: String): Double {
    var bewertungen = filmRatings[film]
    return bewertungen?.average() ?: 0.0
}


fun günstigsterFilm(preis: Double, filme: MutableMap<String, Double>): Pair<String, Double>? {
    var günstig = filme.toList().sortedBy { (_, preis) -> preis }
    return günstig.firstOrNull()


}

fun besterFilm(bewertung: MutableMap<String, MutableList<Int>>): String {
    var best = bewertung.toList().sortedByDescending { (_, values) -> values.average() }.toMap()
    var bestofbest = best.entries.first()
    var keys = bestofbest.key
    var value = bestofbest.value.average()
    return "$keys hat  %.1f Bewertungen ".format(value)

}

fun alaphabet(): List<String> {
    var alfabetisch = filmListe.sorted()
    return alfabetisch
}

fun preisOrdung(): Map<String, Double> {
    var preisOrdentlich = filmToPrice.toList().sortedBy { it.second }.toMap()
    return preisOrdentlich
}

fun deletefilmSortiement(film: String, film2: String, film3: String): Boolean {
    var wahroFalsch = filmListe.remove(film)
    var wahroFalsch2 = filmListe.remove(film2)
    var wahroFalsch3 = filmListe.remove(film3)
    return wahroFalsch && wahroFalsch2 && wahroFalsch3


}