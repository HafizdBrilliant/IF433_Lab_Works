package oop_00000130613_BrilliantHafizdHermawan.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("ALex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}