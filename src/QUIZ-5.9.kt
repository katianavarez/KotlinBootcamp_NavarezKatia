import kotlin.random.Random

const val MAX_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, var pages: Int) {

    fun canBorrow(books: Int): Boolean {
        return books < MAX_BOOKS
    }

    companion object {
        const val BASE_URL = "https://medium.com/"
    }

    fun printUrl() {
        println(BASE_URL + title + ".html")
    }
}

fun Book.weight() = pages * 1.5

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(1, 10))
    }
}

fun main() {
    val book = Book("Hamlet", "Shakespeare", 1600, 200)
    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Pages left: ${book.pages}, Weight: ${book.weight()}g")
        if (book.pages < 0) book.pages = 0
    }
    println("Sad puppy, no more pages in ${book.title}.")
}