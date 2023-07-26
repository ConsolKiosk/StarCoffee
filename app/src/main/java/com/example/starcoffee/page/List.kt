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
import com.example.starcoffee.food.ApplePie
import com.example.starcoffee.food.BELTSandwich
import com.example.starcoffee.food.Bagel
import com.example.starcoffee.food.Bread
import com.example.starcoffee.food.CCSSandwich
import com.example.starcoffee.food.Cake
import com.example.starcoffee.food.CarrotCake
import com.example.starcoffee.food.CheeseCake
import com.example.starcoffee.food.ChocoCake
import com.example.starcoffee.food.Chocolat
import com.example.starcoffee.food.Croissant
import com.example.starcoffee.food.ESSandwich
import com.example.starcoffee.food.LemonCake
import com.example.starcoffee.food.PotatoSandwich
import com.example.starcoffee.food.Sandwich
import com.example.starcoffee.product.Accessories
import com.example.starcoffee.product.BDMug
import com.example.starcoffee.product.CQTumbler
import com.example.starcoffee.product.CSMug
import com.example.starcoffee.product.Colombia
import com.example.starcoffee.product.GQTumbler
import com.example.starcoffee.product.GSMug
import com.example.starcoffee.product.House
import com.example.starcoffee.product.ItalianRoast
import com.example.starcoffee.product.EBTumbler
import com.example.starcoffee.product.MSMTumbler
import com.example.starcoffee.product.Mug
import com.example.starcoffee.product.PikePlaceRoast
import com.example.starcoffee.product.SCCoffeeScoop
import com.example.starcoffee.product.SCPress
import com.example.starcoffee.product.SGlassContainer
import com.example.starcoffee.product.SLeverDripper
import com.example.starcoffee.product.Tumbler
import com.example.starcoffee.product.Via
import com.example.starcoffee.product.WMMug

//var orderLists: MutableList<LinkedHashMap<String, Double>> = ArrayList()
//var productPriceList = mutableListOf<Double>() // 구매한 물건 가격 리스트
//var productList = mutableListOf<String>() // 구매한 물건 이름 리스트
var orderLists: MutableMap<String, Double> = mutableMapOf()

//class Calculate() {
//    var productPriceListSum = productPriceList.sum()
//    fun currentSum() {
//        println("현재까지 총 결제 가격은 W ${productPriceListSum} 입니다.")
//    }
//}

var initAmount = 10.0 //초기 금액
var balanceAmount: Double = initAmount //잔액

//Drink
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

var drinkList = mutableListOf(coffee0, noncoffee0, frappuccino0, ade0) // 드링크 리스트 완료

//Food
val bread0 = Bread() // food list start
val bread1 = Bagel()
val bread2 = ApplePie()
val bread3 = Croissant()
val bread4 = Chocolat()
var breadList = mutableListOf(bread1,bread2,bread3,bread4)

val cake0 = Cake()
val cake1 = CarrotCake()
val cake2 = LemonCake()
val cake3 = CheeseCake()
val cake4 = ChocoCake()
var cakeList = mutableListOf(cake1,cake2,cake3,cake4)

val sandwich0 = Sandwich()
val sandwich1 = ESSandwich()
val sandwich2 = PotatoSandwich()
val sandwich3 = BELTSandwich()
val sandwich4 = CCSSandwich()
var sandwichList = mutableListOf(sandwich1, sandwich2, sandwich3, sandwich4)

var foodList = mutableListOf(bread0, cake0, sandwich0) // food list end

//Product
val accessories0 = Accessories() // accessories list start
val accessories1 = SCCoffeeScoop()
val accessories2 = SCPress()
val accessories3 = SGlassContainer()
val accessories4 = SLeverDripper()
var accessoriesList = mutableListOf(accessories1, accessories2, accessories3, accessories4)

val mug0 = Mug()
val mug1 = BDMug()
val mug2 = CSMug()
val mug3 = GSMug()
val mug4 = WMMug()
var mugList = mutableListOf(mug1, mug2, mug3, mug4)

val tumbler0 = Tumbler()
val tumbler1 = CQTumbler()
val tumbler2 = GQTumbler()
val tumbler3 = EBTumbler()
val tumbler4 = MSMTumbler()
var tumblerList = mutableListOf(tumbler1, tumbler2, tumbler3, tumbler4)

val via0 = Via()
val via1 = Colombia()
val via2 = House()
val via3 = ItalianRoast()
val via4 = PikePlaceRoast()
var viaList = mutableListOf(via1, via2, via3, via4)

var mdList = mutableListOf(mug0, tumbler0, via0, accessories0) // accessories list end












