package oop_00000130613_BrilliantHafizdHermawan.week10

fun <T> filterBesar(list: List<T>, threshold: T): List<T>
where T : Number, T : Comparable<T> {
    return list.filter { it > threshold }
}

fun<T: Number> doubleValue(value: T): Double {
    return value.toDouble() * 2
}

class PairBoxi<K, V>(val key: K, val value: V)

class Calculator<T: Number>(val a: T, val b: T) {
    fun add(): Double {
        return a.toDouble() + b.toDouble()
    }
}

class Storage<T> {
    private val data = mutableListOf<T>()
    fun add(item: T) {
        data.add(item)
    }
}

class ClassName<T>(parameter: T)

data class ApiResponse<T>(
    val status: String,
    val data: T
)

class Boxi<T>(val value: T)

fun <T>printValue(value: T) {}

sealed class Result<T>

data class Success<T>(val data: T) : Result<T>()

fun main() {

    val has: Result<String> = Success("Alexander")


    val box = Box(10)
    val result = box.value;
    println(result + 5)

    val daftarAngka = listOf(10, 50, 5, 100, 30)
    val hasil = filterBesar(daftarAngka, 25)
    println("$hasil")

    val satu = doubleValue(50)
    println("Result: " + satu)

    val pair = PairBox("Age", 25)
    println("ukuran: " + pair.value)

    val intStorage = Storage<Int>()
    intStorage.add(10)
    intStorage.add(200)

    val response1 = ApiResponse("success", listOf("Item1"))
    println("Tipe data T adalah: ${response1.data}")




}


