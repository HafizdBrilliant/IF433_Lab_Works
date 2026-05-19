package oop_00000130613_BrilliantHafizdHermawan.week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class siswa(val name: String, val umr: String, val ipk: Double)
fun siswa.toCSV():String = "$name, $umr, $ipk"


fun main() {

    val datasiswa    = listOf(
        siswa("udin", "19", 3.7),
        siswa("makon", "20", 3.5),
        siswa("toyo", "18", 3.9)
    )
    val data = datasiswa.joinToString("\n")
    val saya2 = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/saya2.txt")
    saya2.writeText(data)

    val murid = siswa("Budi", "20", 3.8)
    println(murid.toCSV())
    val filesaya2 = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/file1.csv")
    filesaya2.writeText(murid.toCSV())


    println("Hello World \n")
    val file = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/contohfile.txt")
    val bacafile = file.readText()
    println(bacafile)

    println("Hello World \n")
    val file1 = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/contohfile.txt")
    val bacafile1 = file1.readLines()
    bacafile1.forEach {
        println("key...." + it )
    }

    println("\nbufeered reader")
    val br = BufferedReader(FileReader("src/oop_00000130613_BrilliantHafizdHermawan/week13/contohfile.txt"))
    var baris:String? = br.readLine()
    while(baris != null) {
        println(baris)
        baris = br.readLine()
    }
    br.close()

    val br2 = BufferedReader(FileReader("src/oop_00000130613_BrilliantHafizdHermawan/week13/contohfile.txt"))
    br2.use { baris ->
        baris.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach {
                println(it)
            }


    }

    val filesaya = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/file1.txt")
    filesaya.writeText("Ini adalah baris pertama\nini Keduaa....!")

    filesaya.appendText("\nini baris ketiga bsicbiscicb")
    filesaya.appendText("\nini baris keempat bsicbiscicb")
    filesaya.appendText("\nini baris kelima bsicbiscicb")

    val contohList = listOf("NasiGoreng", "Bakpao", "Siomay")
    filesaya.appendText("\n" + contohList.joinToString("\n"))

    println("isi content2")
    filesaya.printWriter().use{
        out ->
        out.println("Ini contoh baris pertama")
        out.println("Ini contoh baris 32")
        out.println("Ini contoh baris 67")
    }




}