package com.example.starcoffee.Drink

open class NonCoffee:Drink() {
    override var category: String = "NonCoffee"
}
class chocoLatte:NonCoffee () {
    override var name: String = "초코라떼"
    override var price: Double = 5.5
}
class MBBlended: NonCoffee() {
    override var name: String = "망고바나나블렌디드"
    override var price: Double = 6.3
}
class SPLatte: NonCoffee() {
    override var name: String = "고구마라떼"
    override var price: Double = 5.5
}

class SDYBlended: NonCoffee() {
    override var name: String = "딸기딜라이트요거트블렌디드"
    override var price: Double = 6.3
}