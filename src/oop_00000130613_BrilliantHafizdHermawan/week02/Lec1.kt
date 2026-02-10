package oop_00000130613_BrilliantHafizdHermawan.week02

class Mycar {
    public var warna:String = "abu";
    public var kecepatan:Int = 50;

    init {
        if(kecepatan>=70) {
            println("cepet banget")
        } else {
            println("kurang cepat")
        }
    }

    constructor(speed:Int=0, brake:Double=1.3) {
        kecepatan = speed;
        println("kecepatan: $kecepatan")
    }


    fun mulai_jalan() {
        println("kecepatan $warna Luar biasa")
    }
}

fun main() {
    val myCar = Mycar( speed= 100, brake= 5.4);
    myCar.mulai_jalan();
    myCar.warna = "merah";
    val x = 5
    val y = 6
    val o = "Sum $x + $y = ${x + y}"


    println(o)
    println("warna mobil ${myCar.warna}")
}
