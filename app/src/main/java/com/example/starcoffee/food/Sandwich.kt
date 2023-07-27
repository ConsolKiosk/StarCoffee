package com.example.starcoffee.food

open class  Sandwich : Food() {
    override var category: String = "Sandwich"
}

class ESSandwich : Sandwich() {
    override var name: String = "EggSaladSandwich".padEnd(40)
    override var price: Double = 5.5
}

class PotatoSandwich : Sandwich() {
    override var name: String = "PotatoSandwich".padEnd(40)
    override var price: Double = 5.7
}

class BELTSandwich : Sandwich() {
    override var name: String = "BELTSandwich".padEnd(40)
    override var price: Double = 5.9
}

class CCSSandwich : Sandwich() {
    override var name: String = "ChickenClassicSandwich".padEnd(40)
    override var price: Double = 6.9
}