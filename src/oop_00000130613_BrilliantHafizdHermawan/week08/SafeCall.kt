package oop_00000130613_BrilliantHafizdHermawan.week08

class Alamat(val kota: String?)
class Mahasiswa(val address: Alamat)

fun main() {
    val mhs1 = Mahasiswa(Alamat("Tangerang"))
    val mhs2 = Mahasiswa(Alamat(null))

    println("mahasiswa1: ${mhs1.address.kota}")
    println("mahasiswa2: ${mhs2.address.kota}")

    val tetapAlamat = Alamat("Bogor")
    val defaultAlamat = tetapAlamat.kota?.let {
        adrs->"Alamat adalahhh $adrs"
    }?: "Alamat tetap kosong"
    println("Alamat kamu ${defaultAlamat}")
    }