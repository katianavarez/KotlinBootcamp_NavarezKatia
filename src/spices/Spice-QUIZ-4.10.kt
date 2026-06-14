package spices

// ABSTRACT AND INTERFACE

fun main() {
    val curry = Curry("hot")
    println(curry.color)
    curry.prepareSpice()
}

abstract class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 10
            "hot" -> 15
            else -> 0
        }
    abstract fun prepareSpice()
}

class Curry(spiciness: String, val spiceColor: SpiceColor = YellowSpiceColor): Spice("curry", spiciness), Grinder,
SpiceColor by spiceColor{
    override fun prepareSpice() = grind()
}

interface Grinder {
    fun grind() = println("Grinding spice...")
}



// DELEGATION

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}


