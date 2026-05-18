package oop_00000130613_BrilliantHafizdHermawan.week12

// Tugas 3, 4, 5
fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

// Tugas 6 sampai 11
fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1 (PAGI) ===")
    // Tugas 7 & 8
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Error Hardware: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error Logistik: ${e.message}")
    } catch (e: Exception) {
        println("Error Sistem: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== JADWAL MAKAN 2 (SORE) ===")
    // Tugas 9, 10, 11
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000, // Pemilik baru isi ulang
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}