package oop_00000130613_BrilliantHafizdHermawan.week01

// BAGIAN 1: Tulis DI LUAR main()
// Fungsi ini tugasnya mengecek apakah lulus atau tidak
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    // Kita set nilai score (atau bisa dari input user)
    val score = 85

    // Kode Grade (A/B/C/D) yang tadi
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade Kamu: $grade")

    // BAGIAN 2: Panggil DI DALAM main()
    // Ini akan mencetak "Status: Lulus" atau "Status: Tidak Lulus"
    println("Status: ${calculateStatus(score)}")
}