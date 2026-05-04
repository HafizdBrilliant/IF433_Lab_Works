package oop_00000130613_BrilliantHafizdHermawan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 15.0))
    coinRepo.add(Coin("USDT", 250.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    response.data.forEach {
        println("Koin: ${it.name} | Saldo: ${it.balance}")
    }
}