package oop_00000130613_BrilliantHafizdHermawan.Latihan.Week6

class Mahasiswa(val nama: String) {

    // Ini adalah area Singleton yang nempel di KELAS Mahasiswa
    companion object {
        const val NAMA_KAMPUS = "Universitas Multimedia Nusantara"

        fun infoKampus() {
            println("Ini adalah kampus $NAMA_KAMPUS")
        }
    }
}

fun main() {
    // 1. Membuat objek kelas biasa (bisa banyak)
    val mhs1 = Mahasiswa("Budi")
    val mhs2 = Mahasiswa("Siti")

    // 2. Memanggil anggota companion object
    // DIPANGGIL LEWAT NAMA KELASNYA (Mahasiswa), BUKAN LEWAT OBJEKNYA (mhs1/mhs2)
    println(Mahasiswa.NAMA_KAMPUS)
    Mahasiswa.infoKampus()
}