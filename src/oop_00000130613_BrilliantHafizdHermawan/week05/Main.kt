package oop_00000130613_BrilliantHafizdHermawan.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "123456")
    val admin1 = Admin("Bu Siti")

    // plymorphic Collection: list yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR tipe referensinya adalah Pegawai
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()

            }
    }
        println("-----------------------")
    }



}