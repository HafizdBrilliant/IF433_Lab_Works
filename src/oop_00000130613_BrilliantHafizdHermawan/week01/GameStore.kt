package oop_00000130613_BrilliantHafizdHermawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 60000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.8).toInt()
    } else {
        (price * 0.9).toInt()
    }