package com.example.starcoffee.Drink

open class Frappuccino: Drink() {
    override var category: String = "프라푸치노"
}

class JavaChipFrappuccino: Frappuccino() {
    override var name: String = "자바 칩 프라푸치노"
    override var price: Double = 6.3
}

class CaramelFrappuccino: Frappuccino() {
    override var name: String = "카라멜 프라푸치노"
    override var price: Double = 5.9
}

class EspressoFrappuccino: Frappuccino() {
    override var name: String = "에스프레소 프라푸치노"
    override var price: Double = 5.5
}

class JejuBlackCreamFrappuccino: Frappuccino() {
    override var name: String = "제주 까망 크림 프라푸치노"
    override var price: Double = 7.5
}