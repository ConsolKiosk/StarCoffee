package com.example.starcoffee.drink.ade

class GrapeFruitAde: Ade() {
    override val name: String = "자몽 에이드"
    override val price: Double = 5.7

    override fun displayInfo(): String {
        return "자몽 에이드 디스플레이 인포"
    }
}