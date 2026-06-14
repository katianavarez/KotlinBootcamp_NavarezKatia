import kotlin.text.contains

fun main(){
    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Henry V", "Venus and Adonis", "Twelfth Night")
    val library = mapOf(allBooks to "William Shakespeare")

    println(library.any { it.key.contains("Hamlet") })

    val moreBooks = mutableMapOf<String, String>("Hola" to "Katia")
    println(moreBooks.getOrPut("Hola"){ "Katia" })
    println(moreBooks.getOrPut("Adios"){ "Ximena" })
    println(moreBooks)
}
