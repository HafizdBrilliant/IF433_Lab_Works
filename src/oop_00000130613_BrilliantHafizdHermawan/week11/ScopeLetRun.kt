package oop_00000130613_BrilliantHafizdHermawan.week11

fun main () {
    println("=== TEST LET FUNCTION ===")
    val name: String?= "Alexander"

    val length = name?.let {
        println("Nama Terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}