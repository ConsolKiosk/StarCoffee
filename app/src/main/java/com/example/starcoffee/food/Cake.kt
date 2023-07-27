package com.example.starcoffee.food

open class  Cake : Food() {
    override var category: String = "Cake"
}

class CarrotCake : Cake() {
    override var name: String = "CarrotCake".padEnd(40)
    override var price: Double = 6.5
}

class LemonCake : Cake() {
    override var name: String = "LemonCake".padEnd(40)
    override var price: Double = 6.8
}

class CheeseCake : Cake() {
    override var name: String = "CheeseCake".padEnd(40)
    override var price: Double = 7.9
}

class ChocoCake : Cake() {
    override var name: String = "ChocoCake".padEnd(40)
    override var price: Double = 5.9
}