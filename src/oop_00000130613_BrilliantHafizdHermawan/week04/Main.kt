package oop_00000130613_BrilliantHafizdHermawan.week04

fun main() {
    println("--- Testing vehicle ---");
    val generalVehicle = Vehicle("Sepeda Onthel");
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---");
    val myCar = Car("Toyota", 4)
    myCar.openTrunk();
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEv = ElectricCar("Tesla", 4, 100)

    myEv.accelerate()

    myEv.honk()

    myEv.openTrunk()
}
