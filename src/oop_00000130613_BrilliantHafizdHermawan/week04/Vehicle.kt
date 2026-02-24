package oop_00000130613_BrilliantHafizdHermawan.week04

// Guanakan keyword 'open' agar class bisa diwariskan

open class Vehicle(val brand: String) {
    var speed: Int = 0

    //method juga bersifat final secara default. gunakan 'open' agar bisa di-override.

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}