package com.example.starcoffee.product

open class Mug : MD() {
    override var category: String = "Mug"
}

class BDMug : Mug() {
    override var name: String = "BlackDebbieMug".padEnd(40)
    override var price: Double = 20.0
}
class CSMug : Mug() {
    override var name: String = "CreamSirenMug".padEnd(40)
    override var price: Double = 14.0
}
class GSMug : Mug() {
    override var name: String = "GreenSirenMug".padEnd(40)
    override var price: Double = 16.0
}
class WMMug : Mug() {
    override var name: String = "WordMarkMug".padEnd(40)
    override var price: Double = 21.5
}