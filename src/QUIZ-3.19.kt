import kotlin.random.Random

val rollDice = { Random.nextInt(1, 13) }

val rollDicee = { sides: Int ->
    Random.nextInt(1, sides + 1)
}

val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random.nextInt(1, sides + 1)
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random.nextInt(1, sides + 1)
}

fun gamePlay(rollDice: (Int) -> Int) {
    val result = rollDice(6)
    println("You rolled: $result")
}

fun main(){
    gamePlay(rollDice2)
}
