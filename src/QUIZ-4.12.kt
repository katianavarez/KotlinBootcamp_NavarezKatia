import spices.Curry
import spices.Spice

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main() {
    val sp1 = SpiceContainer(Curry("mild"))
    val sp2 = SpiceContainer(Curry("medium"))
    val sp3 = SpiceContainer(Curry("hot"))

    println(sp1.label)
    println(sp2.label)
    println(sp3.label)
}
