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

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}


