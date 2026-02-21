package oop_00000130613_BrilliantHafizdHermawan.week03

class Employee(val name: String) {
    private var performanceRating: Int = 3
    val tax: Double
        get() = salary * 0.1

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Error: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

}

