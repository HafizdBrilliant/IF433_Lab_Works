package oop_00000130613_BrilliantHafizdHermawan.week04

class Knd_mobil: Kendaraan() {
    private var jmlBan: Int = 0;

    init {
        jmlBan = 4;
        println("Mobil punya $jmlBan ban");
        super.jalan_maju();
    }

    final override fun jalan_maju() {
        println("Mobil Majuuu!!!");
    }
}