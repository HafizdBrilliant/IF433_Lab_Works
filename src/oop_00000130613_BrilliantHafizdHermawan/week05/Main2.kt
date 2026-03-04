package oop_00000130613_BrilliantHafizdHermawan.week05

fun main() {

    println("\n=== TUGAS MANDIRI 2: SISTEM PEMBAYARAN ===")

    val dompetHafizd = EWallet("E-Wallet Hafizd", 50000.0)
    val kartuHafizd = CreditCard("CC Hafizd", 100000.0)
    val daftarPembayaran: List<PaymentMethod> = listOf(dompetHafizd, kartuHafizd)
    for (metode in daftarPembayaran) {
        println("\nMemproses pembayaran 75000.0 untuk akun: ${metode.accountName}")
        metode.processPayment(75000.0)
        if (metode is EWallet) {
            println("=> [Sistem Penyelamat] Terdeteksi E-Wallet. Saldo kurang? Mari Top Up otomatis!")
            metode.topUp(50000.0)

            println("=> Mengulang transaksi pembayaran...")
            metode.processPayment(75000.0)
        }
    }
}