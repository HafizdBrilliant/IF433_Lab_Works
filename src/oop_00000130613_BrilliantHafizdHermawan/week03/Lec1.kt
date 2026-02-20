package oop_00000130613_BrilliantHafizdHermawan.week03

open class Lec1 {
    private var nama: String = "belum ada";
    private var gaji: Int = 0;
    protected var namaPacar: String = "Jomblo";

    public var umur: Int = 0
        set(value) {
            if(value<0) {
                println("Masa umur minus");
            } else {
                field = value;
            }

        }
        get() {
            return field;
        }

    public fun set_gaji(gajikamu: Int) {
        if (gajikamu <= 0) {
            println("Eh gaji ga boleh 0 atau minus bang")
        } else {
            this.gaji = gajikamu
        }
    }

    public fun set_nama(namakamu: String) {
        if(namakamu.length == 0) {
            println("Eh nama ga boleh kosong bang");
        } else {
            this.nama = namakamu;
        }
    }

    public fun get_nama():String {
        return this.nama + " ok";
    }

    public fun get_gaji(): Int  {
        return this.gaji
    }
}

class DataPribadi: Lec1() {
    fun ambil_data_pacar(): String {
        return this.namaPacar;
    }

    fun set_pacar(namaBaru: String) {
        this.namaPacar = namaBaru;
    }
}

fun main() {
    var dp = DataPribadi();

    println("--- Sebelum Diubah ---")
    println("Nama pacar: " + dp.ambil_data_pacar());
    println("Nama Karyawan: " + dp.get_nama());

    dp.set_nama("Budi Santoso")
    dp.set_pacar("Dua Lipa")

    println("\n--- Setelah Diubah ---")
    println("Nama Karyawan: " + dp.get_nama())
    println("Status pacar: " + dp.ambil_data_pacar())

    dp.umur = -2;
    println("Nama Karyawan: " + dp.get_nama() + " umur kamu " + dp.umur)

    var kry = Lec1();
    kry.set_nama("Ucok Sitorus");
    kry.set_gaji(5000000)

    println("Hai " + kry.get_nama() + ", gaji kamu Rp" + kry.get_gaji());
}

