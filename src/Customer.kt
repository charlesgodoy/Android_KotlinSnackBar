class Customer(val id: Int, val name: String, var currentCash: Double) {

    fun retrieveCurrentCash() = "Current cash = $currentCash"

    fun customerAddsCash(cash: Double) {
        currentCash = currentCash + cash
    }

    fun customerBuysSnack(x: Int) {
        currentCash = x.times()

        if (x > currentCash) {
            println("Sorry, not enough cash for purchase")
        } else {
            currentCash = currentCash - x
        }
    }

    fun isBroke(): Boolean {
        if (currentCash <= 0) {
            currentCash = 0.0
            println("No more money")
            return true
        } else return false
    }

}