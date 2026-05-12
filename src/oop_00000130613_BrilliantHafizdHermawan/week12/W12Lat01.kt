package oop_00000130613_BrilliantHafizdHermawan.week12

fun pembagian() {
    try {
        val a = 10;
        val b = 5;
        val hasil = a/b;
        println("Hasil Bagi $hasil")
    } catch (e: Exception) {
        println("Ada error " + e.message)
    } finally {
        println("Selesai try catch")
    }
}

fun cek_tipe_variabel() {
    val angka: Int = try {
        Integer.parseInt("234")
    } catch (e: Exception) {
        println("ada error ${e.message}")
        777
    }
    println(angka)
}

fun main() {
    println("testing dulu")
    pembagian()
    cek_tipe_variabel()

}