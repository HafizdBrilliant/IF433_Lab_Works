package oop_00000130613_BrilliantHafizdHermawan.week14

import java.io.File

// ========== CHECKPOINT 18: BAD CODE (Violation of SRP, OCP, DIP) ==========
class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName,$finalPrice,$customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// ========== CHECKPOINT 19: REFACTOR SRP & DIP ==========
// SRP + DIP: Repository untuk menyimpan data
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(private val file: File = File("orders_refactored.csv")) : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}

// SRP + DIP: Service untuk notifikasi
interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// OrderProcessor setelah SRP dan DIP (masih melanggar OCP karena masih pakai when)
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

// ========== CHECKPOINT 20: REFACTOR OCP dengan STRATEGY PATTERN ==========
// OCP: Pricing Strategy
interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}

// Final OrderProcessor yang mematuhi SRP, OCP, DIP
class SafeOrderProcessorOCP(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, strategy: PricingStrategy) {
        val finalPrice = strategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, strategy::class.simpleName ?: "Unknown")
        notifier.sendNotification(itemName)
    }
}
