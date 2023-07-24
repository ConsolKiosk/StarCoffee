package com.example.starcoffee

import com.example.starcoffee.drink.ade.Ade
import com.example.starcoffee.drink.ade.CoolLimeFizzio
import com.example.starcoffee.drink.ade.GrapeFruitAde
import com.example.starcoffee.drink.ade.LemonAde
import com.example.starcoffee.drink.ade.YujaPassionFizzio
import com.example.starcoffee.drink.coffee.Americano
import com.example.starcoffee.drink.coffee.cappuccino
import com.example.starcoffee.drink.coffee.coffee
import com.example.starcoffee.drink.coffee.coffeeLatte
import com.example.starcoffee.drink.coffee.macchiato

val ade0 = Ade()
val ade1 = CoolLimeFizzio()
val ade2 = GrapeFruitAde()
val ade3 = LemonAde()
val ade4 = YujaPassionFizzio()

var adeList = mutableListOf(ade1, ade2, ade3, ade4 )

val coffee0 = coffee()
val coffee1 = Americano()
val coffee2 = cappuccino()
val coffee3 = coffeeLatte()
val coffee4 = macchiato()

var coffeeList = mutableListOf(coffee1, coffee2,coffee3, coffee4 )






