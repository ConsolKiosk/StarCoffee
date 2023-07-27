package com.example.starcoffee.drink

open class Ade: Drink() {
    override var category: String = "Ade"
}

class GrapeFruitAde: Ade() {
    override var name: String = "GrapeFruitAde".padEnd(40)
    override var price: Double = 5.9
}

class LemonAde: Ade() {
    override var name: String = "LemonAde".padEnd(40)
    override var price: Double = 5.9
}

class LimeAde: Ade() {
    override var name: String = "LimeAde".padEnd(40)
    override var price: Double = 5.9
}

class YujaAde: Ade() {
    override var name: String = "YujaAde".padEnd(40)
    override var price: Double = 5.9
}