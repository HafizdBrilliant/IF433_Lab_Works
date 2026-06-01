package oop_00000130613_BrilliantHafizdHermawan.week14

class UserValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18

    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

git add .
git commit -m "week14: extract EmailService to fix SRP"