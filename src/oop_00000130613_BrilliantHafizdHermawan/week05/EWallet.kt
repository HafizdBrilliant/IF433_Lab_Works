package oop_00000130613_BrilliantHafizdHermawan.week05


class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Sukses! Pembayaran sebesar $amount berhasil. Sisa saldo $accountName: $balance")
        } else {
            println("Saldo tidak cukup! Transaksi $accountName ditolak.")
        }
    }


    fun topUp(amount: Double) {
        balance += amount
        println("Top Up berhasil! Saldo $accountName sekarang: $balance")
    }
}