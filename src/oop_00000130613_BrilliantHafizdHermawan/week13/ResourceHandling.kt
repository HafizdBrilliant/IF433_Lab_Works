package oop_00000130613_BrilliantHafizdHermawan.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFED RESOURCE HANDLING ===")
    val unsafeFile = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("Proses Penulisan unsafe selesai.")

    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("src/oop_00000130613_BrilliantHafizdHermawan/week13/safe_logs.txt")
    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")
}