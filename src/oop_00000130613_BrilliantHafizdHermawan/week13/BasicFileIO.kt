package oop_00000130613_BrilliantHafizdHermawan.week13

import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: menambahkan konfigurasi baru.\n")
    println("Teks berhasil diappend.")

    println("\n=== TEST READ TEXT ====")
    val fullContent = file.readText()
    println("Membaca sekaligus: \n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")

    }

}