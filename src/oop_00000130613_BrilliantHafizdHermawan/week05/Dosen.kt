package oop_00000130613_BrilliantHafizdHermawan.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // Wajib di-override karena fungsi bekerja() bersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyapkan materi perkuliahan merevisi RPKPS.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa  di kelas.")
    }
}