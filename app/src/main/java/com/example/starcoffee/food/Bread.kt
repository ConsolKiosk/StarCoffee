package com.example.starcoffee.food

open class  Bread : Food() {
    override var category: String = "Bread"
}

class Bagel : Bread() {
    override var name: String = "Begel".padEnd(40)
    override var price: Double = 3.0
}

class ApplePie : Bread() {
    override var name: String = "ApplePie".padEnd(40)
    override var price: Double = 4.6
}

class Croissant : Bread() {
    override var name: String = "Croissant".padEnd(40)
    override var price: Double = 7.9
}

class Chocolat : Bread() {
    override var name: String = "Chocolat".padEnd(40)
    override var price: Double = 5.1
}

