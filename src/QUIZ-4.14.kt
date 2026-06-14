enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

interface Grinder {
    fun grind() = println("Grinding spice...")
}

sealed class Spice(val name: String, val spiciness: String = "mild") : SpiceColor {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 10
            "hot" -> 15
            else -> 0
        }
    abstract fun prepareSpice()
}

class Curry(spiciness: String, val spiceColor: SpiceColor = YellowSpiceColor)
    : Spice("curry", spiciness), Grinder, SpiceColor by spiceColor {
    override fun prepareSpice() = grind()
}