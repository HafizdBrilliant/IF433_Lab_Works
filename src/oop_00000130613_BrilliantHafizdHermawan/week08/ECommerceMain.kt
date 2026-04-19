package oop_00000130613_BrilliantHafizdHermawan.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "waranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not an Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("=== MULAI PROSES BATCH E-COMMERCE ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("LOG WARNING: Data korup dilewati -> ${e.message}")
        }
    }

    println("=== PROSES BATCH SELESAI ===")
}