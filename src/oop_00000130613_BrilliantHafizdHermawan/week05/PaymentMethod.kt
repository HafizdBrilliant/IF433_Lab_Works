package oop_00000130613_BrilliantHafizdHermawan.week05


abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}