package oop_00000130613_BrilliantHafizdHermawan.week07

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: Int) : ApiResponse()
    object Loading : ApiResponse()
}