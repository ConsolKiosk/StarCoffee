package com.example.starcoffee



class Money() {
    var currentMoney: Int = 100000
    fun translate(money : Double): Int {
       var translatedMoney = (money * 1000).toInt()
       return translatedMoney
    }
}

var productPriceList = mutableListOf<Double>()
var productList = mutableListOf<String>()

//class Calculate() {
//    var productList = mutableListOf<Double>()
//    var productListSum = productList.sum()
//    fun currentSum() {
//        println("총 결제 가격은 ${productListSum}원 입니다.")
//        }
//    }







