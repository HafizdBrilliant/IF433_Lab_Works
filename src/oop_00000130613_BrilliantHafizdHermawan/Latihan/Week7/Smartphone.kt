package oop_00000130613_BrilliantHafizdHermawan.Latihan.Week7

class Smart(val merk: String, val storage: Int) {
    var warna: String = "Hitam"

    init {
        println("Menyiapkan mesin untuk $merk kapasitas ${storage}GB...")
    }

    constructor(merk: String, storage: Int, warnaPilihan: String) : this(merk, storage) {
        this.warna = warnaPilihan
        println("Mengecat body smartphone dengan warna $warnaPilihan...")
    }
}