package oop_00000130613_BrilliantHafizdHermawan.week10

// Non-Generic Programming
class nonGeneric(var hasil: Any)

// Generic Programming
class generic<T>(var hasil: T)

// generic programming - 2 parameter
class Kota<E, V>(var kodepos: E, var telp: V);

//generic programming - function
fun <T> cobaFungsi(angka: T):T {
    return angka
}

//generic programming - tipe constraint
fun <T: Number> tambah(angka: T): Double {
    return angka.toDouble() + 50;
}

fun <T: Number> kurang(angka: T): Int {
    return angka.toInt() - 50;
}

//generic programming - function in class
class kalkulator<T: Number>(val a: T, val b: T) {
    fun kali(): Double {
        return a.toDouble() * b.toDouble()
    }

    fun bagi(): Int {
        return a.toInt() / b.toInt()
    }
}

//pengaplikasian generic programming -  where clause
fun <T> nilaiKKM(list: List<T>, kkm: T): List<T> where T: Comparable<T> {
    return list.filter {it >= kkm}
}

fun main() {

    //pengaplikasian generic programming - where clause
    println("======= GENERIC WHERE CLAUSE ========")
    val nilaiMhs = listOf(80, 90, 83, 70, 65, 50, 83, 40, 61)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, 70)
    println(nilaiMhs)
    println(nilaiFilterKKM)

    //pengaplikasian generic programming - function in class
    println("======= GENERIC FUNCTION IN CLASS ========")
    val kalk = kalkulator(10.2, 3.5)
    println("Hasil Kali: ${kalk.kali()}");
    println("Hasil bagi: ${kalk.bagi()}");

    //pengaplikasian generic programming - Contraint
    println("======= GENERIC CONSTRAINT  ========")
    println("Hasil Tambah: " + tambah(100.5))
    println("Hasil kurang: " + kurang(100.5))

    //pengaplikasian non-generic programming
    println("======= NON-GENERIC ========")
    val nGen = nonGeneric("Contoh ngn")
    val angkaNGEN = nGen.hasil as String;
    println(angkaNGEN + 50)

    //pengaplikasian generic programming
    println("======= GENERIC ========")
    val Gen = generic(200)
    println(Gen.hasil + 50)

    //pengaplikasian generic programming - 2 parameter
    println("======= GENERIC 2 PARAMETER ========")
    val City = Kota("12345", 880123);
    println("kodepos Kamu " + City.kodepos)
    println("telp Kamu " + City.telp)

    //pengaplikasian generic programming - function
    println("======= GENERIC FUNCTION ========")
    println("hasil : " + cobaFungsi(10))

}