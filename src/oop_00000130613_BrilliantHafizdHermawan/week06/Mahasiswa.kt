package oop_00000130613_BrilliantHafizdHermawan.week06

interface Mahasiswa {
    var nama: String;
    fun belajar()
    fun serang() {
        println("$nama  telah diserang.")
    }

    fun mati() {
    println("Semua makhluk akan mati.")
}
    fun mandi()
    fun makan()
    fun main_game() {
        println("mahasiswa main Game di kelas");
    }

}