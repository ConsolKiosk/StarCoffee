package com.example.starcoffee.food

open class  Cake : Food() {
    override var category: String = "케이크"
}

class CarrotCake : Cake() {
    override var name: String = "당근케이크"
    override var price: Double = 6.5
}

class LemonCake : Cake() {
    override var name: String = "레몬케이크"
    override var price: Double = 6.8
}

class CheeseCake : Cake() {
    override var name: String = "치즈케이크"
    override var price: Double = 7.9
}

class ChocoCake : Cake() {
    override var name: String = "초코케이크"
    override var price: Double = 5.9
}