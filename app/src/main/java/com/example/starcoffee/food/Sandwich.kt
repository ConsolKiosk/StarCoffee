package com.example.starcoffee.food

open class  Sandwich : Food() {
    override var category: String = "샌드위치"
}

class ESSandwich : Sandwich() {
    override var name: String = "에그샐러드샌드위치"
    override var price: Double = 5.5
}

class PotatoSandwich : Sandwich() {
    override var name: String = "포테이토샌드위치"
    override var price: Double = 5.7
}

class BELTSandwich : Sandwich() {
    override var name: String = "B.E.L.T샌드위치"
    override var price: Double = 5.9
}

class CCSSandwich : Sandwich() {
    override var name: String = "치킨클래식샌드위치"
    override var price: Double = 6.9
}