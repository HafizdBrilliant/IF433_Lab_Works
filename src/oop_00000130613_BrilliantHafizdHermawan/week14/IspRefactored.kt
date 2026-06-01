package oop_00000130613_BrilliantHafizdHermawan.week14

interface Printable {
    fun print(doc: String)
}

interface Scanable {
    fun scan(doc: String): String
}

interface Faxable {
    fun fax(doc: String)
}
