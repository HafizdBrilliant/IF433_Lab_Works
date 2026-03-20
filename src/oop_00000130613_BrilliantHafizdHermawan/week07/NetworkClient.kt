package oop_00000130613_BrilliantHafizdHermawan.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}