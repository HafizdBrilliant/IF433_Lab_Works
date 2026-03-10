package oop_00000130613_BrilliantHafizdHermawan.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' menyala.")
        startRecord() // Dipanggil otomatis
    }

    override fun turnOff() {
        stopRecord()
        println("CCTV '$name' dimatikan.")
    }

    override fun startRecord() {
        println("Mulai merekam video dari CCTV '$name'...")
    }
}


