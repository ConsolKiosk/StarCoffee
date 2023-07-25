package com.example.starcoffee.Drink

//11

open class Coffee:Drink() {
    override var category: String = "Coffee"
}

class Americano: Coffee() {
    override var name: String = "아메리카노"
    override var price: Double = 4.5
}
class CoffeeLatte: Coffee() {
    override var name: String = "카페라떼"
    override var price: Double = 5.0
}
class Cappuccino: Coffee() {
    override var name: String = "카푸치노"
    override var price: Double = 5.0
}

class Macchiato: Coffee() {
    override var name: String = "마끼야또"
    override var price: Double = 5.9
}