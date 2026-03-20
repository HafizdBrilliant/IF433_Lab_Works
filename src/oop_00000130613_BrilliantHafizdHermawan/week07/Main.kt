package oop_00000130613_BrilliantHafizdHermawan.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("STatus: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.creationClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1)
    println("Sama? ${reg1 == reg2}")
}