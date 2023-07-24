package com.example.starcoffee

class Calculate() {
    var currentMoney: Int = 100000
    var productList = mutableListOf<Double>()
    var productListSum = productList.sum()
    var afterPayMoney = currentMoney - productListSum

    fun currentSum() {
        println("총 결제가격은 ${productListSum}원 입니다.")
        }
    }


open class Burger (val name: String, val price: Double){
    open fun displayInfo(){
        print("앵거스 비프 통살을 다져만든 버거")
    }

}


class ShackBurger(name: String, price: Double) : Burger(name, price){
    override fun displayInfo(){
        print("토마토, 양상추, 쉑소스가 토핑된 치즈버거")
    }
}


