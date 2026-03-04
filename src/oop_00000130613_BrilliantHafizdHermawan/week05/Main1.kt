package oop_00000130613_BrilliantHafizdHermawan.week05

fun main() {

    println("\n=== TUGAS MANDIRI 1: OVERLOADING ===")


    val math = MathHelper()


    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5) = $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(5, 10)
    println("Luas Persegi Panjang (5 x 10) = $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0) = $luasLingkaran")
}