package com.example.starcoffee

import com.example.starcoffee.drink.Drink
import com.example.starcoffee.food.CarrotCake

fun main() {
    // var food = CarrotCake()
    // println( food.category)
//    var drink = Drink()
//    drink.IceOrHot() <--IceOrHot 구현
}

abstract class StarMenu {
    open var category: String = ""
    open var name: String = ""
    open var price: Double = 0.0
}


