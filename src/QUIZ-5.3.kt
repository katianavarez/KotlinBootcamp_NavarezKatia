/*
class Book(val title: String, val author: String, val year: Int) {
    fun TitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun TitleAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(){
    val book1 = Book("Hola", "Katia", 2026)
    val triple = book1.TitleAuthorAndYear()
    println("Here is your book ${triple.first} written by ${triple.second} in ${triple.third}.")
}
*/