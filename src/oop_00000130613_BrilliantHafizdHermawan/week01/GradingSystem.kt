package oop_00000130613_BrilliantHafizdHermawan.week01

fun main () {
    val score = 85
val grade = when (score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    else -> "D"
}

    println("Grade Kamu: $grade")
}


