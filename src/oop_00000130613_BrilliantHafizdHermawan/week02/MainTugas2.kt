package oop_00000130613_BrilliantHafizdHermawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    scanner.nextLine()

    val myHero = Hero(name, baseDamage)

    var enemyHp = 100
    println("\nPertarungan Dimulai! ${myHero.name} VS Enemy (HP Awal: $enemyHp)")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- STATUS PERTARUNGAN ---")
        println("Hero HP: ${myHero.hp} | Enemy HP $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan Anda: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            println("\n${myHero.name} menyerang musuh!")
            myHero.attack("Enemy")

            enemyHp -= myHero.baseDamage

            if (enemyHp < 0) enemyHp = 0
            println("Enemy terkena ${myHero.baseDamage} damage. (Sisa Hp Enemy: $enemyHp)")

            if (enemyHp > 0) {
                val enemyDmg = (10..20).random()
                println("\nEnemy membalas serangan!")
                myHero.takeDamage(enemyDmg)
            }

        } else if (choice == 2) {
            println("\n${myHero.name} lari terbirit-birit dari pertarungan...")
            break
        } else {
            println("Pilihan tidak valid, giliran terbuang!")
            }
        }

    println("\n=== HASIL AKHIR ===")

    if (enemyHp <= 0) {
        println("VICTORY! Musuh telah dikalahkan.")
    } else if (!myHero.isAlive()) {
        println("GAME OVER! ${myHero.name} telah gugur dalam pertarungan.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}