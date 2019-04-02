class Snack(val id: Int, val name: String, private var quantity: Int, var cost: Double, val vendingMachineID: Int) {

    fun addSnacks(x: Int): Int {
        quantity = quantity + x
        return quantity
    }

    fun quantityAfterBuySnack(x: Int): Int{
        quantity = quantity - x
        return quantity
    }

    fun priceOfSnack(x: Double): Double {

        x = x.times(cost)
    }

    fun restrieveQuantity(): Int = quantity

}