package com.example.starcoffee.drink.ade
import com.example.starcoffee.drink.Drink

open class Ade: Drink {
    override var category: String = "Ade"
    open val name: String = "에이드"
    open val price: Double = 0.0

    open fun displayInfo ():String {
        return "에이드 디스플레이 인포"
    }
}