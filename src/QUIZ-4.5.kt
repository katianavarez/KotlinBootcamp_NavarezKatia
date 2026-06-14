/*
class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 10
            "hot" -> 15
            else -> 0
        }

    init {
        println("$name spiciness is $heat")
    }
}

val spices = listOf(
    Spice("curry", "mild"),
    Spice("ginger", "medium"),
    Spice("pepper", "hot")
)

val spicy = spices.filter { it.heat > 10 }

fun makeSalt() = Spice("salt", "mild")
 */