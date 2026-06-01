package oop_00000130613_BrilliantHafizdHermawan.week14

open class Rectangle(var width: Int, var height: Int) {
    open fun area(): Int = width * height
}

class Square(side: Int) : Rectangle(side, side) {
    override fun area(): Int = width * width
}

