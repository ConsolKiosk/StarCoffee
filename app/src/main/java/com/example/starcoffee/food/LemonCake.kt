package com.example.starcoffee.food

class LemonCake(name: String, price: Double) : Cake(name, price) {
    override val name: String = "LemonCake"
    override val price: Double = 5.0
    override fun order() {
        println("$")
    }
}