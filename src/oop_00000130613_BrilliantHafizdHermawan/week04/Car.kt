package oop_00000130613_BrilliantHafizdHermawan.week04

// Car "Is-A" Vehicle. Parameter brand dielmpar ke atas melalui Vehicle(brand)

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}