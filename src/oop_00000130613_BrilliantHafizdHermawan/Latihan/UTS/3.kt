package oop_00000130613_BrilliantHafizdHermawan.Latihan.UTS

import kotlin.collections.plusAssign

open class Vehicle(val brand: String) {

    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Keceptan: $speed km/jam.")
    }

    open fun honk() {
        println("Beep beep!")
    }

}

