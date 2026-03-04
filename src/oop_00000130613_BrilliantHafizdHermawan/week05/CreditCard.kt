package oop_00000130613_BrilliantHafizdHermawan.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Sukses! Pembayaran sebesar $amount berhasil. Limit terpakai $accountName: $usedAmount dari $limit")
        } else {
            println("Transaksi ditolak! Limit Kartu Kredit $accountName tidak mencukupi.")
        }
    }
}
