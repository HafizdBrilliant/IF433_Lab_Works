package oop_00000130613_BrilliantHafizdHermawan.week08

class profile_pages(val idprofile: String?, val statusOnline: String?) {

    fun ganti_foto(filePhoto: String?) {
        println("Foto Kamu ${filePhoto}")
    }
}


fun main() {
    var nama: String? = "Fauzan";
    nama = null;
    println("nama kamu $nama");

    val profile = profile_pages("1234", null)
    println("id ${profile.idprofile}, statusnya: ${profile.statusOnline}")

    profile.ganti_foto("Fototerbaik.jpg")

}