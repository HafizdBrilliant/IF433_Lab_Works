package oop_00000130613_BrilliantHafizdHermawan.week09

fun main() {

    println("\n=== LIST OF ===")
    var arMhs = listOf("Budi", "Susi", "Titus");
    println(arMhs)
    println("Panjang array ${arMhs.size}")
    println(arMhs[1])
    for (a in arMhs) {
        println("mahasiswa bernama $a")
    }

    println("\n=== MUTABLE LIST ===")
    var arAngka = mutableListOf(10, 30, 40, 20, 70, 90)
    arAngka.add(777)
    arAngka[2] = 123
    arAngka.removeAt(3)
    println(arAngka)

    println("\n=== SET OF ===")
    var arUrutan = setOf(20, 23, 20,  34, 65, 76)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga? " + arUrutan.contains(20))

    println("\n=== MUTABLE SET OF ===")
    var arMakanan = mutableSetOf("Ayam", "Bakmie", "Ketoprak", "Bakso", "Pop Mie", "Mie Ayam", "Nasi")
    arMakanan.add("Indomie")
    arMakanan.add("Sate")
    arMakanan.remove("Nasi")
    println(arMakanan)

    println("\n=== MAP ===")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("banyak data siswa: " + arSiswa.size)
    println("Nilai si Andi: " + arSiswa["Andi"])
    println("semua keys: " + arSiswa.keys)
    println("semua values: " + arSiswa.values)
    println("semua keys: " + arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("\n=== MUTABLE OF MAP ===")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur Asem" to 1500
    )
    println("banyak Menu: " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2500)
    println(arMenu)

    println("\n=== LAMBDA ===")
    fun tambah(a: Int, b: Int): Int {
    return a+b
    }
    val kurang = {a: Int, b: Int -> a-b}
    println("Kurang-Kurangan: ${kurang(5,3)}")

    println("\n=== IMPLICIT IT ===")
    var pangkat = {x:Int -> x+x}
    var hitungPangkat:(Int) -> Int = {it * it}
    println("Pangkat " + hitungPangkat(5))

    println("\n=== FOR EACH ===")
    arSiswa.forEach {
        siswa -> println(siswa)
    }
    for(sis in arSiswa) {
        println(sis)
    }

    
}