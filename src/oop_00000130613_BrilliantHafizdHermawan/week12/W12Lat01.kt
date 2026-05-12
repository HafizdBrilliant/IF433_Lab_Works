package oop_00000130613_BrilliantHafizdHermawan.week12

fun pembagian() {
    try {
        val a = 10;
        val b = 5;
        val hasil = a/b;
        println("Hasil Bagi $hasil")
    } catch (e: Exception) {
        println("Ada error " + e.message)
    } finally {
        println("Selesai try catch")
    }
}

fun cek_tipe_variabel() {
    val angka: Int = try {
        Integer.parseInt("234")
    } catch (e: Exception) {
        println("ada error ${e.message}")
        777
    }
    println(angka)
}

fun cek_nilai(nilai:Int) {
    if(nilai<0) {
        throw IllegalArgumentException("Masa nilai minus")
    } else if (nilai >100) {
        println("Nilai tidak boleh lebih dari 100")
    } else {
        println("Nilai kamu adalah " + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran: Int, val saldo: Int):
        Exception("Saldo kamu sisa $saldo, saldo $pengeluaran")

class transaksi_keuangan() {
    fun narik_uang(totalBelanja: Int, balance: Int) {
        if(totalBelanja > balance) {
            try {
                throw cek_saldo_rekening(totalBelanja, balance)
            } catch (e: Exception) {
                println(e.message)
            }
        } else {
            println("Transaksi Berhasil, sisa Saldo ${balance - totalBelanja}")
        }
    }
}

fun multiple_catch(input:String) {
    try {
        val angka: Int = input.toInt()
        val hitungBagi: Int = angka/0
        println("Hasil bagi $hitungBagi")
    } catch (e: NumberFormatException) {
        println("Gabisa Membagi bilangan huruf ${e.message}")
    } catch (e: ArithmeticException) {
        println("Masa Pembagian pake 0: ${e.message}")
    } catch (e: Exception) {
        println("Ada error di multiple catch ${e.message}")
    }
}

sealed class BANKException(pesan: String): Exception("error di Bank Exception $pesan")

class cek_saldo(val pengeluaran: Int): BANKException("Belanja $pengeluaran lebih besar dari saldo")
class cek_input(val transaksi: Int): BANKException("Transaksi masa minus $transaksi")

fun transaksi_belanja(saldoKamu: Int, jajanKamu: Int): Int {
    if (jajanKamu < 0) {
        throw cek_input (jajanKamu)
    } else if (saldoKamu < jajanKamu) {
        throw cek_saldo(jajanKamu)
    }
    return saldoKamu - jajanKamu
}



fun main() {

    runCatching { transaksi_belanja(1000, 800)}
        .onSuccess{println("Belanja Berhasil, sisa Saldo $it")}
        .onFailure {println(it)}

    println("testing dulu")
    pembagian()
    cek_tipe_variabel()

    try {
        cek_nilai(-10)
    } catch(e:Exception) {
        println("Ada error di nilai: " + e.message)
    }


    val trx = transaksi_keuangan()
    trx.narik_uang(1900, 1500)

    val tes = multiple_catch("10")
}