package com.example.starcoffee.product

open class Accessories : Product() {
    override var category: String = "Accessories"
}

class SCCoffeeScoop : Accessories() {
    override var name: String = "SirenCoffeeClipScoop".padEnd(40)
    override var price: Double = 38.0
}

class SCPress : Accessories() {
    override var name: String = "SirenCoffeePress".padEnd(40)
    override var price: Double = 41.0
}

class SGlassContainer : Accessories() {
    override var name: String = "SirenGlassContainer".padEnd(40)
    override var price: Double = 40.5
}

class SLeverDripper : Accessories() {
    override var name: String = "SirenLeverDripper".padEnd(40)
    override var price: Double = 61.5
}