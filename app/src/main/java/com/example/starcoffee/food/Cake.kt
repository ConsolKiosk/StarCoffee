package com.example.starcoffee.food

open class  Cake : Food() {
    override var category: String = "케이크"
}

class CarrotCake : Cake() {
    override var name: String = "당근케이크"
    override var price: Double = 5.0
}