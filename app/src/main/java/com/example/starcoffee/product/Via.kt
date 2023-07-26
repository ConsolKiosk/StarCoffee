package com.example.starcoffee.product

open class Via : Product() {
    override var category: String = "Via"
}

class Colombia : Via() {
    override var name: String = "Colombia".padEnd(40)
    override var price: Double = 20.0
}

class House : Via() {
    override var name: String = "House".padEnd(40)
    override var price: Double = 18.0
}

class ItalianRoast : Via() {
    override var name: String = "ItalianRoast".padEnd(40)
    override var price: Double = 22.0
}

class PikePlaceRoast : Via() {
    override var name: String = "PikePlaceRoast".padEnd(40)
    override var price: Double = 23.0
}