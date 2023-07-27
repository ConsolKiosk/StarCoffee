package com.example.starcoffee.md

open class Via : MD() {
    override var category: String = "Via"
}

class Colombia : Via() {
    override var name: String = "Colombia"
    override var price: Double = 20.0
}
class House : Via() {
    override var name: String = "House"
    override var price: Double = 18.0
}
class ItalianRoast : Via() {
    override var name: String = "ItalianRoast"
    override var price: Double = 22.0
}
class PikePlaceRoast : Via() {
    override var name: String = "PikePlaceRoast"
    override var price: Double = 23.0
}