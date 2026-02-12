package oop_00000130613_BrilliantHafizdHermawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- SISTEMM PERPUSTAKAAN (Library Fine System ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjaman: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var days = scanner.nextInt()
    scanner.nextLine()

    if (days < 0) {
        println("Warning: Lama pinjam tidak boleh minus. Otomatis diubah menjadi 1 hari.")
        days = 1
    }

    val loanData = Loan(title, borrower, days)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul          : ${loanData.bookTitle}")
    println("Peminjaman     : ${loanData.borrower}")
    println("Durasi         : ${loanData.loanDuration} hari")
    println("Total Denda    : RP ${loanData.calculateFine()}")
}
