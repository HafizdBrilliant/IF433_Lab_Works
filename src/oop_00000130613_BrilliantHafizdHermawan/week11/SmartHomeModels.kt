package oop_00000130613_BrilliantHafizdHermawan.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    return "[DIAGNOSTIK] $name | Kategori: $category | status: ${if (isOnline) "Online" else "Offline"} | Daya: $powerLoad watt"
}