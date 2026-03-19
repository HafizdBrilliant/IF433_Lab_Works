package oop_00000130613_BrilliantHafizdHermawan.week07

class Hitungan private constructor(val tipe: String) {

    init {
        println("Isi param class: ${tipe}")
    }

    companion object {

        const val namaMtk: String = "Matematika"

        fun tambah(a:Int, b:Int) {
            println("Hasil Penjumlahan: " + (a+b));
        }

        fun kali(a:Int, b:Int) {
            println("Hasil Perkalian: " + (a*b));
        }

        fun buat_data(tipeUser: String) {
            Hitungan(tipeUser)

        }
    }

}