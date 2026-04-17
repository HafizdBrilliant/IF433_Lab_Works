package oop_00000130613_BrilliantHafizdHermawan.week08

fun main() {

    var nama: String? = "Fauzan";

    try {
        println("hai $nama")
        println("panjang huruf ${nama!!.length}")
    } catch (e: NullPointerException) {
        println("ada error exception, ini pesan errornya ${e.message}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi", 10, "Online", null)
    for(item in mixedData) {
        val hasil = item as? String
        if(hasil!= null)
        println("$hasil")
    }
}