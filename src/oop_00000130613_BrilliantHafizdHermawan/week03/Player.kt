package oop_00000130613_BrilliantHafizdHermawan.week03

class Player(val username: String) {
    var xp: Int = 0

    val level: Int
        get() = (xp /100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = this.level

            xp += amount

            if (this.level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level $level, Total XP: $xp.")
            } else {
                println("$username mendapat $amount XP. Total XP: $xp, Level: $level")
            }
        } else {
            println("Peringatan: XP yang dita,bahkan harus angka positif!")
        }
    }
}