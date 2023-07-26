package com.example.starcoffee.drink

open class Frappuccino: Drink() {
    override var category: String = "Frappuccino"
}

class JavaChipFrappuccino: Frappuccino() {
    override var name: String = "JavaChipFrappuccino".padEnd(40)
    override var price: Double = 6.3
}

class CaramelFrappuccino: Frappuccino() {
    override var name: String = "CaramelFrappuccino".padEnd(40)
    override var price: Double = 5.9
}

class EspressoFrappuccino: Frappuccino() {
    override var name: String = "EspressoFrappuccino".padEnd(40)
    override var price: Double = 5.5
}

class JejuBlackCreamFrappuccino: Frappuccino() {
    override var name: String = "JejuBlackCreamFrappuccino".padEnd(40)
    override var price: Double = 7.5
}