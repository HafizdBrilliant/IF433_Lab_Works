// Kelas yang tidak menggunakan Generics (Masalah)
class Box(value: Any) {
    var value: Any = value
}

fun main() {
    // 1. Kotak diisi dengan angka 10 (Int)
    val box = Box(10)

    // 2. Kita mencoba memaksa angka tersebut menjadi String
    // Baris ini akan menyebabkan CRASH saat dijalankan

    val numbers:List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers)
}