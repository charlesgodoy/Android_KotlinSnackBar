fun main(args: Array<String>) {

    val jane = Customer(1, "Jane", 45.25)

    val bob = Customer(2, "Bob", 33.14)

    val food = VendingMachine(1, "food")

    val drink = VendingMachine(2, "drink")

    val office = VendingMachine(3, "office")

    val chips = Snack(1, "Chips", 36, 1.75, 1)

    val chocolateBar = Snack(2, "Chocolate Bar", 36, 1.00, 1)

    val pretzel = Snack(3, "Pretzel", 30, 2.00, 1)

    val soda = Snack(1, "Soda", 24, 2.50, 2)

    val water = Snack(2, "Water", 20, 2.75, 2)

    println("quantity of soda = ${soda.restrieveQuantity()}")

    println("Jane buys 3 sodas")

    jane.customerBuysSnack()



    soda.quantityAfterBuySnack(3)

    println("Soda now = ${soda.restrieveQuantity()}")


    jane.currentCash



}