package com.example.starcoffee.drink

open class NonCoffee:Drink() {
    override var category: String = "NonCoffee"
}

class chocoLatte:NonCoffee () {
    override var name: String = "chocoLatte".padEnd(40)
    override var price: Double = 5.5
}
class MBBlended: NonCoffee() {
    override var name: String = "MangoBananaBlended".padEnd(40)
    override var price: Double = 6.3
}
class SPLatte: NonCoffee() {
    override var name: String = "SweetPotatoLatte".padEnd(40)
    override var price: Double = 5.5
}

class SDYBlended: NonCoffee() {
    override var name: String = "StrawberryDeilghtYogurtBlended".padEnd(40)
    override var price: Double = 6.3
}