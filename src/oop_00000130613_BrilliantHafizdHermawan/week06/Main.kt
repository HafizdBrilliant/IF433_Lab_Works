package oop_00000130613_BrilliantHafizdHermawan.week06


fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 500000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n=== TESTING SMART HOME ===")
// Instansiasi perangkat
    val lampu = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")


    val hub = SmartHomeHub()
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)


    lampu.turnOn()
    cctv.turnOn()

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

}


