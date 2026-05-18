package oop_00000130613_BrilliantHafizdHermawan.week12

// Tugas 1
sealed class FeederException(msg: String) : Exception(msg)

// Tugas 2
class FoodEmptyException(requested: Int, available: Int) :
    FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!")