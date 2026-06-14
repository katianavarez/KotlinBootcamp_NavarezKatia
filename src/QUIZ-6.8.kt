enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east =  { path.add(Directions.EAST) }
    val west =  { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over")
        println("Path: $path")
        true
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(input: String?) {
        when (input) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
        if (game.path.contains(Directions.END)) break
    }
}