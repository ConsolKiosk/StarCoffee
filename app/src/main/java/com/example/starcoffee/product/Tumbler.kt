package com.example.starcoffee.product

open class Tumbler : MD() {
    override var category: String = "Tumbler"
}

class CQTumbler : Tumbler() {
    override var name: String = "CreamQuencherTumbler".padEnd(40)
    override var price: Double = 19.0
}

class GQTumbler : Tumbler() {
    override var name: String = "GreenQuencherTumbler".padEnd(40)
    override var price: Double = 18.0
}

class EBTumbler : Tumbler() {
    override var name: String = "ElmaBlackTumbler".padEnd(40)
    override var price: Double = 25.0
}

class MSMTumbler : Tumbler() {
    override var name: String = "MiirSirenMintTumbler".padEnd(40)
    override var price: Double = 22.0
}