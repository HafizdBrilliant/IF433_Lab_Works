package oop_00000130613_BrilliantHafizdHermawan.week02

class Student (
    val name: String,
    val nim: String,
    var major: String
){
    init {
        //validasi Sederhana: cek panjang NIM
        if (nim.length != 5) {
            println("Warning: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

}