package oop_00000130613_BrilliantHafizdHermawan.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFED RESOURCE HANDLING ===")
    val unsafeFile = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna")

    writer.close()
    println("Proses Penulisan unsafe selesai.")
}