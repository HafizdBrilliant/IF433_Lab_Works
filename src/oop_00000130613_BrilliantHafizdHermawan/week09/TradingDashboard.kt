package oop_00000130613_BrilliantHafizdHermawan.week09

    fun main() {
        val tradeHistory = listOf(
            TradeLog(pair = "BTDUST", position = "LONG", leverage = 5, roe = -1.5, status = "OPEN"),
            TradeLog(pair = "SOLUSDT", position = "LONG", leverage = 20, roe = 12.0, status = "CLOSED"),
            TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 50, roe = 45.0, status = "CLOSED"),
            TradeLog(pair = "BNBUSDT", position = "LONG", leverage = 5, roe = -1.5, status = "OPEN"),
            TradeLog(pair = "SOLUSDT", position = "LONG", leverage = 20, roe = 12.0, status = "CLOSED"),
            TradeLog(pair = "ETHUSDT", position = "LONG", leverage = 15, roe = -8.0, status = "CLOSED"),
        )

        val closedTrades = tradeHistory.filter { it.status == "CLOSED"}
        val winningTrades = closedTrades.filter { it.roe > 0 }
        val losingTrades = closedTrades.filter { it.roe <= 0 }

        val topPerformersString = winningTrades
            .sortedByDescending { it.roe}
            .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"}

        val worstPerformersString = losingTrades
            .sortedBy { it.roe }
            .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

        val uniquePairs = tradeHistory
            .map { it.pair }
            .toSet()

        println("\n=== CRYPTO TRADING DASHBOARD ===")
        topPerformersString.forEach { println(it)}

        worstPerformersString.forEach { println(it) }
        println("\nUnique Pairs Traded: $uniquePairs")
    }