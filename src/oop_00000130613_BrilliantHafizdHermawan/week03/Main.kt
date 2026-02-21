package oop_00000130613_BrilliantHafizdHermawan.week03

fun main() {
    println("\n--- TUGAS 1: Uji Coba Weapon ---")

    val myWeapon = Weapon("Pedang Naga")

    myWeapon.damage = -50
    println("Damage setelah diset -50: ${myWeapon.damage}")

    myWeapon.damage = 9999
    println("Damage setelah diset 9999: ${myWeapon.damage}")

    println("Senjata ${myWeapon.name} berada di Tier: ${myWeapon.tier}")
}