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

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("\nHasil Copy: $data3")

    val (userName, userAge) = data1
    println("\nDestructed: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Tampilkan: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("\n=== TUGAS MANDIRI: RPG CORE ENGINE ===")

    GameManager.startGame()
    GameManager.startGame()

    println("\nPeluang mendapatkan item LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val playerWeapon = Weapon.forgeStarterSword()

    println("\n--- Detail Senjata Pemain ---")
    println("Nama Senjata: ${playerWeapon.item.name}")
    println("Damage: ${playerWeapon.item.damage}")
    println("Kelangkaan: ${playerWeapon.item.rarity}")
    println("Durability: ${playerWeapon.durability}")

    println("\n--- Pergi ke Blacksmith ---")
    val upgradedItem = playerWeapon.item.copy(damage = 25)
    println("Senjata berhasil di-upgrade! Damage sekarang: ${upgradedItem.damage}")

    println("\n--- Memulai Petualangan ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkana jebakan racun"))
}