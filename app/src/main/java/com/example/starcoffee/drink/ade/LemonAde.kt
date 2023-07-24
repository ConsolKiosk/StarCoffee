package com.example.starcoffee.drink.ade

class LemonAde: Ade() {
    override val name: String = "레몬 에이드"
    override val price: Double = 5.7

    override fun displayInfo(): String {
        return "레몬 에이드 디스플레이 인포"
    }
}