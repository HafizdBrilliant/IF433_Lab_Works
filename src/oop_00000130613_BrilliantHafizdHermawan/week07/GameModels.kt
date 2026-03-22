package oop_00000130613_BrilliantHafizdHermawan.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(7),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)
