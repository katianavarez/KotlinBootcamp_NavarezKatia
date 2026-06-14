fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    return this.filter { block(it) == 0 }
}

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisibleBy { it % 3 })
}