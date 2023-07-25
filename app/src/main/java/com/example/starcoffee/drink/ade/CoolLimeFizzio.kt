package com.example.starcoffee.drink.ade

class CoolLimeFizzio: Ade() {
    override val name: String = "쿨 라임 피지오"
    override val price: Double = 5.9

    override fun displayInfo(): String {
        return "쿨 라임 피지오 디스플레이 인포"
    }
}