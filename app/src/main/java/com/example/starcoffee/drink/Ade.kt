package com.example.starcoffee.drink

open class Ade: Drink() {
    override var category: String = "에이드"
}

class GrapeFruitAde: Ade() {
    override var name: String = "자몽에이드"
    override var price: Double = 5.9
}

class LemonAde: Ade() {
    override var name: String = "레몬에이드"
    override var price: Double = 5.9
}

class LimeAde: Ade() {
    override var name: String = "라임에이드"
    override var price: Double = 5.9
}

class YujaAde: Ade() {
    override var name: String = "유자에이드"
    override var price: Double = 5.9
}