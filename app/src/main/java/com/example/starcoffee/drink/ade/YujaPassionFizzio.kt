package com.example.starcoffee.drink.ade

class YujaPassionFizzio: Ade() {
    override val name: String = "유자 패션 피지오"
    override val price: Double = 5.9

    override fun displayInfo(): String {
        return "유자 패션 피지오 디스플레이 인포"
    }
}