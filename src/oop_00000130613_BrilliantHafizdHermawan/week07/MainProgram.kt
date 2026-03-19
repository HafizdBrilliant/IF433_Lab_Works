package oop_00000130613_BrilliantHafizdHermawan.week07

fun main() {
    Koneksi.kon = "localhost:1313"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10, 20)
    Hitungan.kali(10,50)
    println("Nama Matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("Admin");

    val dt = SaveData("Mario", 18, 106, 6)
    println("Nama CHar ${dt.namaChar}");

    println(dt);

    val dtCopy = dt.copy(namaChar="Luigi");
    println("Nama ${dtCopy.namaChar}");
    println(dtCopy)

    println("=== class ENUM ===");
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("=== SEALED CLASS ===")

    val hsl: Hasil = Hasil.Sukses("Berhasil")
    hsl.handle_response(hsl)




   /* val hit = Hitungan("Admin")
    hit.show_data()*/

}

// object for class  itu adalah singleton satu bisa diakses semua yang butuh mirip sattic variabel yang bisa diakses oleh yang membutuhkan
/*
*
*
*
*
*
* */