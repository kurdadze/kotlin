import java.util.*

class Ingredients(
    private val coffeeType: String,
) {
    var sugar: Int = 0
    var milk: Int = 0

    private var sugarPrice: Double = 0.1
    private var milkPrice: Double = 1.5
    private var hasCinnamonPrice: Double = 0.5

    private var _val: Int = 0

    fun setIngredients() {
        sugar = Ingredients(coffeeType).setProperties("sugar").toInt()
        milk = Ingredients(coffeeType).setProperties("milk").toInt()
        if (coffeeType == "cappuccino")
            if (Ingredients(coffeeType).setProperties("hasCinnamon").toInt() <= 0)
                hasCinnamonPrice = 0.0
    }

    private fun setProperties(property: String): String {
        print("Please enter $property quantity: ")
        val inputVal = inputValue()
        if (inputVal.hasNextInt() === false) {
            println("Enter correct value...")
            setProperties(property)
        } else {
            _val = inputVal.nextInt()
            if (_val < 0) {
                println("Enter correct value...")
                setProperties(property)
            }
        }
        return _val.toString()
    }

    fun calculate(): Double {
        return sugar * sugarPrice + milk * milkPrice + hasCinnamonPrice
    }

    private fun inputValue(): Scanner {
        return Scanner(System.`in`)
    }
}