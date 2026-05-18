package oop_00000130613_BrilliantHafizdHermawan.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    // LANGKAH 1
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // LANGKAH 2
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    // LANGKAH 3
    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}