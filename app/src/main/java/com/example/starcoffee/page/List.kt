package com.example.starcoffee.page

import com.example.starcoffee.drink.Ade
import com.example.starcoffee.drink.Americano
import com.example.starcoffee.drink.Cappuccino
import com.example.starcoffee.drink.CaramelFrappuccino
import com.example.starcoffee.drink.Coffee
import com.example.starcoffee.drink.CoffeeLatte
import com.example.starcoffee.drink.EspressoFrappuccino
import com.example.starcoffee.drink.Frappuccino
import com.example.starcoffee.drink.GrapeFruitAde
import com.example.starcoffee.drink.JavaChipFrappuccino
import com.example.starcoffee.drink.JejuBlackCreamFrappuccino
import com.example.starcoffee.drink.LemonAde
import com.example.starcoffee.drink.LimeAde
import com.example.starcoffee.drink.MBBlended
import com.example.starcoffee.drink.Macchiato
import com.example.starcoffee.drink.NonCoffee
import com.example.starcoffee.drink.SDYBlended
import com.example.starcoffee.drink.SPLatte
import com.example.starcoffee.drink.YujaAde
import com.example.starcoffee.drink.chocoLatte

var productPriceList = mutableListOf<Double>()
var productList = mutableListOf<String>()

val ade0 = Ade()
val ade1= GrapeFruitAde()
val ade2 = LemonAde()
val ade3 = LimeAde()
val ade4 = YujaAde()
var adeList = mutableListOf(ade1, ade2, ade3, ade4 )

val coffee0 = Coffee()
val coffee1 = Americano()
val coffee2 = CoffeeLatte()
val coffee3 = Cappuccino()
val coffee4 = Macchiato()
var coffeeList = mutableListOf(coffee1, coffee2,coffee3, coffee4)

val frappuccino0 = Frappuccino()
val frappuccino1 = JavaChipFrappuccino()
val frappuccino2 = CaramelFrappuccino()
val frappuccino3 = EspressoFrappuccino()
val frappuccino4 = JejuBlackCreamFrappuccino()
var frappuccinoList = mutableListOf(frappuccino1,frappuccino2,frappuccino3,frappuccino4)

val noncoffee0 = NonCoffee()
val noncoffee1 = chocoLatte()
val noncoffee2 = MBBlended()
val noncoffee3 = SPLatte()
val noncoffee4 = SDYBlended()
var noncoffeeList = mutableListOf(noncoffee1,noncoffee2,noncoffee3,noncoffee4)






