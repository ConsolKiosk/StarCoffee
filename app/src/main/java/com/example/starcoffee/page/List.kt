package com.example.starcoffee.page

import com.example.starcoffee.drink.Ade
import com.example.starcoffee.drink.Americano
import com.example.starcoffee.drink.Cappuccino
import com.example.starcoffee.drink.CaramelFrappuccino
import com.example.starcoffee.drink.Coffee
import com.example.starcoffee.drink.CoffeeLatte
import com.example.starcoffee.drink.Drink
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

var productPriceList = mutableListOf<Double>() // 구매한 물건 가격 리스트
var productList = mutableListOf<String>() // 구매한 물건 이름 리스트

class Calculate() {
    var productPriceListSum = productPriceList.sum()
    fun currentSum() {
        println("현재까지 총 결제 가격은 W ${productPriceListSum} 입니다.")
    }
}

val ade0 = Ade() // 드링크 리스트 시작
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

var drinkList = mutableListOf(ade0, coffee0, frappuccino0, noncoffee0) // 드링크 리스트 완료







