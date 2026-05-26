package oop_00000130613_BrilliantHafizdHermawan.week14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, tugasMingguan: Double): Double {
        return (quiz * 0.3) + (tugasMingguan * 0.7)
    }
    fun hitung_nilai_akhir(utsMhs: Double, uasMhs: Double, tugasMhs: Double, jnsKur: jenis_kurikulum): Double {
        return jnsKur.hitung_nilai_bobot(utsMhs, uasMhs,tugasMhs)
    }
}

interface jenis_kurikulum {
    fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double
}

class kurikulum_2013 : jenis_kurikulum {
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}
class kurikulum_merdeka: jenis_kurikulum {
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.5)
    }
}

class manager_hitung_khs{
    fun mulai_perhitungan(quizTugas: Double, aktivitasTugas: Double, utsKamu: Double, uasKamu: Double,jnsKur: jenis_kurikulum): Double {
        val khsMhs = proses_khs()
        val nilaiTugas:Double = khsMhs.hitung_nilai_tugas(quizTugas, aktivitasTugas)
        val nilaiAkhirMhs: Double =khsMhs.hitung_nilai_akhir(utsKamu, uasKamu, nilaiTugas, jnsKur)
        return nilaiAkhirMhs
    }
}

class manager_db {
    fun mulai_simpan(nimMhs:String, namaMhs: String, naMhs:Double): String {
        val dbMhs = proses_db_khs()
        return dbMhs.simpan_na_db(nimMhs,namaMhs, naMhs)
    }
}

class proses_db_khs {
    fun simpan_na_db(nim: String, nama:String, nilaiAKhir: Double):String {
        return "KHS $nim nama $nama dapat nilai $nilaiAKhir"
    }

    fun load_db(nim: String):String {
        return "Berhasil load data $nim"
    }
}


fun main() {
    val mngKhs = manager_hitung_khs()
    val naMhs1: Double = mngKhs.mulai_perhitungan(85.73, 87.30, 70.36, 93.57, kurikulum_2013())
    val naMhs2: Double = mngKhs.mulai_perhitungan(85.73, 87.30, 70.36, 93.57, kurikulum_merdeka())

    val managerDB = manager_db()
    val x = managerDB.mulai_simpan("123", "Ucok", naMhs1)
    val y = managerDB.mulai_simpan("321", "Intan", naMhs2)
    println(x)
    println(y)
}