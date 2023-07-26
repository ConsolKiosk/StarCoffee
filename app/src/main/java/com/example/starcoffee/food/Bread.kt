package com.example.starcoffee.food

open class  Bread : Food() {
    override var category: String = "빵"
}

class Bagel : Bread() {
    override var name: String = "베이글"
    override var price: Double = 3.0
}

class ApplePie : Bread() {
    override var name: String = "애플파이"
    override var price: Double = 4.6
}

class Croissant : Bread() {
    override var name: String = "크루아상"
    override var price: Double = 7.9
}

class Chocolat : Bread() {
    override var name: String = "쇼콜라빵"
    override var price: Double = 5.1
}

