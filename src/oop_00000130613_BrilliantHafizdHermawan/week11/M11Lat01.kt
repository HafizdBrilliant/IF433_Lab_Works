package oop_00000130613_BrilliantHafizdHermawan.week11

fun String.DasarExtention(): String {
    return "Hallo $this"
}

//ekstensi function dasar
fun String.RubahHurufBesarDepan() : String {
    var hasil =""
    hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}

//extention function pake parameter
fun String.TentukanKelulusan(nilai: Int): String {
    var hasil = ""
    if(nilai>70) {
        hasil = "lulus"
    } else {
        hasil = "Remedial"
    }
    return this + " " + hasil
}

fun String?.CekNullEmpty():String {
    var hasil = " "
    if(this == null || this.isEmpty()) {
        hasil = "gaboleh null atau kosong"
    }
    return hasil
}

//scope data class apply
data class Manusia(var nama: String, var umur: Int)


fun main() {

    //scope also
    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also {
        println("Sebelum Deret: $deretAngka")
    }.add(5)
    println("setelah Deret: $deretAngka")

    //scope apply
    val orang = Manusia("Budi", 25).apply{
    umur = 27
    }
    println("nama kamu ${orang.nama}, umur kamu ${orang.umur}")


    //scope with
    val pekerjaan = with("Mahasiswa") {
        if(this=="Mahasiswa") {
            println("Pelajar")
        } else {
            println("Pekerja")
        }
    }

    //scope let function
    val huruf: String = "UMN"
    val hasilKampus = huruf.let {
        if (it == "UMN") {
            "Kampus saya"
        } else {
            "Bukan Kampus Saya"
        }
    }
    println(hasilKampus)

    //scope run
    var nilaikamu = 70.run {
        if(this>70) {
            println("Lulus")
        } else {
            println("Gagal")
        }
    }

    //extention function - cek null atau empty
    var passwordKamu: String? = null
    println(passwordKamu.CekNullEmpty())

    //call extention function + parameter
    println("Kelulusan Kamu".TentukanKelulusan(71))

    //basic function
    println("Wirawan".DasarExtention())

    //tanpa Extention function
    val nama1 = "budi sihombing"
    println(nama1.uppercase())
    println("Ya".repeat(10))

    //extention function
    println("budi udin skdnd ksdbskd kas dddd".RubahHurufBesarDepan())


}