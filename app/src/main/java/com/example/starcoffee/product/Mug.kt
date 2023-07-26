package com.example.starcoffee.product

open class Mug : MD() {
    override var category: String = "Via"
}

class BDMug : Mug() {
    override var name: String = "BDMug"
    override var price: Double = 20.0
}
class CSMug : Mug() {
    override var name: String = "CSMug"
    override var price: Double = 14.0
}
class GSMug : Mug() {
    override var name: String = "GSMug"
    override var price: Double = 16.0
}
class WMMug : Mug() {
    override var name: String = "WMMug"
    override var price: Double = 21.5
}