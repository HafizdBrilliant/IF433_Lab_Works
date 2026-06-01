package oop_00000130613_BrilliantHafizdHermawan.week14

class UserValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18

    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}