package com.example.starcoffee.product



open class Accessories : MD() {
    override var category: String = "Accessories"
}

class SCCoffeeScoop : Accessories() {
    override var name: String = "SCCoffeeScoop"
    override var price: Double = 38.0
}
class SCPress : Accessories() {
    override var name: String = "SCPress"
    override var price: Double = 41.0
}
class SGlassContainer : Accessories() {
    override var name: String = "SGlassContainer"
    override var price: Double = 40.5
}
class SLeverDripper : Accessories() {
    override var name: String = "SLeverDripper"
    override var price: Double = 61.5
}