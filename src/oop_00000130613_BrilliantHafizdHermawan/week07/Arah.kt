package oop_00000130613_BrilliantHafizdHermawan.week07

enum class Arah(val Petunjuk : String) {
    Atas("naik"),
    Bawah("Turun"),
    kanan("Belok"),
    Kiri("Mengsong");

    fun tampilkan_isi_param() {
        println("arah ke ${Petunjuk}")
    }

}