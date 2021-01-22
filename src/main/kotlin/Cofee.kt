import java.util.*

fun main() {
    println("Choose coffee(Late or Cappuccino):")
    val requestCoffee = Scanner(System.`in`)
    val nameOfCoffee = requestCoffee.next().toLowerCase().trim()
    if (nameOfCoffee == "late" || nameOfCoffee == "cappuccino") {
        val coffeeMachine = CoffeeMachine(nameOfCoffee)
        val price = coffeeMachine.getPrice()
        println("Total price: $price")
    } else
        println("Please enter correct coffee type: (Late or Cappuccino)")
}
