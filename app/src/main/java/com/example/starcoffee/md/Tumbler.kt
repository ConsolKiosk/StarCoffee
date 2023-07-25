package com.example.starcoffee.md

open class Tumbler : MD() {
    override var category: String = "Tumbler"
}

class CCTumbler : Tumbler() {
    override var name: String = "CCTumbler"
    override var price: Double = 19.0
}

class GCTumbler : Tumbler() {
    override var name: String = "GCTumbler"
    override var price: Double = 18.0
}

class MBTumbler : Tumbler() {
    override var name: String = "MBTumbler"
    override var price: Double = 25.0
}

class MSMTumbler : Tumbler() {
    override var name: String = "MSMTumbler"
    override var price: Double = 22.0
}