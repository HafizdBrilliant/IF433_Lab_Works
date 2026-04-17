package oop_00000130613_BrilliantHafizdHermawan.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        //sendEmail(user.email)

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("user ${user.name} tidak memiliki email.")
        }
    }
}