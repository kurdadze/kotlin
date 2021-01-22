class CoffeeMachine(
    private val coffeeType: String,
) {

    fun getPrice(): Double {
        val ingredients = Ingredients(coffeeType)
        ingredients.setIngredients()
        ingredients.calculate()
        return ingredients.calculate()
    }
}