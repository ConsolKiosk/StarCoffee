package com.example.starcoffee.food

open class CarrotCake(name: String, price: Double) : Cake(name, price) {
    override val name: String = "CarrotCake"
    override val price: Double = 5.0
    override fun order() {
        println("$")
    }
}