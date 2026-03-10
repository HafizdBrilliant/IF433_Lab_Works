package oop_00000130613_BrilliantHafizdHermawan.week06

class KRS(override var nama: String, override val namaSiswa: String) : Mahasiswa, Siswa{
    override fun belajar() {
        println("si $nama sedang belajar")
        println("siswa $namaSiswa sedang belajar")
    }

    override fun mandi() {
        println("Mahasiswa Mandi")
    }


    override fun main_game() {
        super<Mahasiswa>.main_game()
    }

    override fun makan() {
        println("Mahasiswa makan")
    }

    override fun serang() {
        super<Mahasiswa>.serang()
    }


    override fun jajan() {
        super<Siswa>.jajan()
    }

    override fun mati() {
        super<Mahasiswa>.mati()
    }

}