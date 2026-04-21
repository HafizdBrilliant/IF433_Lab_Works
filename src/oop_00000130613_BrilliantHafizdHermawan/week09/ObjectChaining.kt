package oop_00000130613_BrilliantHafizdHermawan.week09

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citras", 2.8),
        Student("Dewi", 3.7)
    )
}