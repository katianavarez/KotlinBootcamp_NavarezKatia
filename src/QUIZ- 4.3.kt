class SimpleSpice()  {
    val name = "curry"
    val levelSpiciness = "mild"
    val heat: Int
        get() = 5
}

fun main(){
    val sspice = SimpleSpice()
    println(sspice.name)
    println(sspice.heat)
}
