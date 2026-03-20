package oop_00000130613_BrilliantHafizdHermawan.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("STatus: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.creationClient()
    client.connect()
}