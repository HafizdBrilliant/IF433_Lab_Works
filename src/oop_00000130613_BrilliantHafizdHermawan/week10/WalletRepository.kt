package oop_00000130613_BrilliantHafizdHermawan.week10

class WalletRepository<T: Any> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(searchName: String): T? {
        for (item in items) {
            if (item is Coin && item.name == searchName) {
                return item
            }
        }
        return null
    }
}