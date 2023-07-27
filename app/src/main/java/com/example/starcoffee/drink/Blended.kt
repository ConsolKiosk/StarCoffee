package com.example.starcoffee.drink

open class Blended:Drink() {
    override var category: String = "Blended"
}

class MintChocoChipBlended:Blended () {
    override var name: String = "MintChocoChipBlended".padEnd(40)
    override var price: Double = 6.3
}
class MBBlended: Blended() {
    override var name: String = "MangoBananaBlended".padEnd(40)
    override var price: Double = 6.3
}
class RedPowerSmashBlended: Blended() {
    override var name: String = "RedPowerSmashBlended".padEnd(40)
    override var price: Double = 6.5
}

class SDYBlended: Blended() {
    override var name: String = "StrawberryDeilghtYogurtBlended".padEnd(40)
    override var price: Double = 6.3
}