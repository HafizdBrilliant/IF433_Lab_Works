package oop_00000130613_BrilliantHafizdHermawan.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    //Fungsi unik/spesifik yang hanay dimiliki Admin
    fun doAdminWork() {
        println("[$nama] sedsng merekap data absensi mahasiswa.")
    }
}