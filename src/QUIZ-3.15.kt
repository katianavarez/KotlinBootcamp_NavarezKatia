fun main (){
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad", "rainy"))
    println(whatShouldIDoToday("idk"))
    println(whatShouldIDoToday("happy", "sunny", -5))
    println(whatShouldIDoToday("happy", "sunny", 40))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isHappy(mood : String) = mood == "happy"
fun isSunny(weather: String) = weather == "sunny"
fun isTooCold(temperature: Int) = temperature < 0
fun isToHot(temperature: Int) = temperature > 35
fun isRainy(weather: String) = weather == "rainy"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappy(mood) && isSunny(weather) -> "Go for a walk"
        isTooCold(temperature) -> "Stay in bed"
        isToHot(temperature) -> "Go swimming"
        isRainy(weather) -> "Drink coffee"
        else -> "Stay home and read."
    }
}