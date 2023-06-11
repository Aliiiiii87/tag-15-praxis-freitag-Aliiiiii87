// Diese Funktion erstellt eine zufällige Bewertung
fun randomRating(): Int{
    return (1..5).random()
}

// Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
fun generateRatings(): MutableList<Int>{
    val ratings = mutableListOf<Int>()
    repeat((1..10).random()){
        ratings.add(randomRating())
    }
    return ratings
}

// Aufgbe 2: Zufällige Preise


fun main (){
   println(pricetoChance(filmToPrice))
    println("${twoFive()} €")

}

fun pricetoChance():Int {
    return(1..10).random()
}
fun pricetoChance(mutableMap: MutableMap<String, Double>):Int {
    return(1..10).random()
}

fun twoFive (): Int{
    return(2..5).random()
}