package oop_00000130613_BrilliantHafizdHermawan.week11

fun main () {

    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Before: $it")
    }.add(4)

    println("After: $numbers")

    val name: String? = "Alex"
    name?.let {
        println(it)
    }

    fun String?.isNullOrEmpty(): Boolean {
        return this == null || this.isEmpty()
    }
    val text: String? = null
    println(text.isNullOrEmpty())
}