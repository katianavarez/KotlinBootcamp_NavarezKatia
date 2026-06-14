/*
const val MAX_BOOKS = 10

class Book(val title: String, val author: String, val year: Int) {
    fun TitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun TitleAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(books: Int): Boolean {
        return books < MAX_BOOKS
    }

    companion object {
        const val BASE_URL = "https://medium.com/"
    }

    fun printUrl(){
        println(BASE_URL + title + ".html")
    }
}

fun main() {
    val book = Book("Titulo", "Yo", 1923)
    println(book.canBorrow(3))
    println(book.canBorrow(12))
    book.printUrl()
}

 */