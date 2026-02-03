package oop_00000130613_BrilliantHafizdHermawan.week01

// [DARI GAMBAR 1] Tulis DI LUAR main()
// Fungsi expression body untuk mengecek status lulus/tidak
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    // 1. Bagian Score & Grade (Kode Sebelumnya)
    val score = 85

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade Kamu: $grade")

    // [DARI GAMBAR 1] Panggil DI DALAM main()
    println("Status: ${calculateStatus(score)}")

    // [DARI GAMBAR 2] Tambahkan di akhir main() - Null Safety
    val studentId: String? = null

    // Jika null, gunakan nilai default 0 (menggunakan Elvis Operator ?:)
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}