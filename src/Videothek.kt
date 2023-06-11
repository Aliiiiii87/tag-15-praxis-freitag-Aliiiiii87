// Die FilmListe hat alle unsere Filme
val filmListe = mutableListOf<String>(
    "The Dark Knight",  
    "Indiana Jones",  
    "Die Hard",  
    "The Shawshank Redemption",  
    "Schindler's List",  
    "The Godfather",  
    "Star Wars",  
    "The Matrix",
    "The Lord of the Rings",
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to 3.99 ,
    "Indiana Jones" to 2.99,
    "Die Hard" to 1.49,
    "The Shawshank Redemption" to 0.99,
    "Schindler's List" to 4.49,
    "The Godfather" to 3.99,
    "Star Wars" to 4.57,
    "The Matrix" to 6.45,
    "The Lord of the Rings" to 7.99
)

// Diese Map speichert das Genre zu jedem Filmtitel
val filmToGenre = mutableMapOf(
    "The Dark Knight" to "Action/Adventure",
    "Indiana Jones" to "Action/Adventure",
    "Die Hard" to "Action/Adventure",
    "The Shawshank Redemption" to "Drama",
    "Schindler's List" to "Drama",
    "The Godfather" to "Drama",
    "Star Wars" to "Science Fiction/Fantasy",
    "The Matrix" to "Science Fiction/Fantasy",
    "The Lord of the Rings" to "Science Fiction/Fantasy"
)

// Diese Map speichert Bewertungen zu jedem Film
val filmRatings = mutableMapOf<String, MutableList<Int>>(
    "The Dark Knight" to generateRatings(),
    "Indiana Jones" to generateRatings(),
    "Die Hard" to generateRatings(),
    "The Shawshank Redemption" to generateRatings(),
    "Schindler's List" to generateRatings(),
    "The Godfather" to generateRatings(),
    "Star Wars" to generateRatings(),
    "The Matrix" to generateRatings(),
    "The Lord of the Rings" to generateRatings()
)

