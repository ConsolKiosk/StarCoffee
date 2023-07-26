package com.example.starcoffee.drink

//11

open class Coffee:Drink() {
    override var category: String = "Coffee"


}


class Americano: Coffee() {
    override var name: String = "Amricano".padEnd(40)
    override var price: Double = 4.5
}
class CoffeeLatte: Coffee() {
    override var name: String = "CaffeLatte".padEnd(40)
    override var price: Double = 5.0
}
class Cappuccino: Coffee() {
    override var name: String = "Cappuccino".padEnd(40)
    override var price: Double = 5.0
}

class Macchiato: Coffee() {
    override var name: String = "Macchiato".padEnd(40)
    override var price: Double = 5.9
}