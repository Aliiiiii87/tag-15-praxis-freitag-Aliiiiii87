// Aufgabe 7
fun main() {
    println("Herrzlich Willkomen bei Ali Movie Dom")
    println("Unser Film Sortiement beinhaltet\n$filmListe")
    println("Unsere Top 3 Woche mit den 3 Filmen im angebot\n${günstigsten3Filme(filmToPrice)}")
    println(" Unsere Top3 Woche der 3 Best berteten filme sind\n${best3filme(filmRatings)}".format(1))
    println("Suchen sie sich ein Film aus $filmListe ")
    var eingabe = readln()
    println("Sie haben den film $eingabe\ndetails zum Film : ${beleg(eingabe)}")




}

fun günstigsten3Filme(map: MutableMap<String, Double>): List<Pair<String, Double>> {
    var günstig = map.toList().sortedBy { it.second }
    var günnstigerFilme = günstig.take(3)
    return günnstigerFilme


}


fun best3filme(map: MutableMap<String, MutableList<Int>>): List<Pair<String, Double>> {
    var beste3filme = map.toList().sortedByDescending { it.second.average() }.take(3)
    var bestedrei = beste3filme.map { it.first to it.second.average() }.toList()
    return bestedrei
}


fun beleg(film: String): String {
    var preis = filmToPrice[film]
    var bewertung = filmRatings[film]!!.average()
    var genre = filmToGenre[film]
    return "Der Film kostet: $preis€\nHat eine Bewertung von :%.1f ⭐️\nund das Genre ist :$genre".format(bewertung)

}


fun deletefilmSortiement(film: String): Boolean {
    var wahroFalsch = filmListe.remove(film)
    return wahroFalsch
}
