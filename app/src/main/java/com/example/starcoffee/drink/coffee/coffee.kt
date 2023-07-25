package com.example.starcoffee.drink.coffee

//fun main(){
//    var test = americano()
//
//    test.displayInfo()
//
//}
open class coffee {
    var size:String =""
    var IceOrHot:String = ""

    open fun displayInfo ():String {
        return "커피 디스플레이 인포"
    }



    fun iceFunction() {
        println("아이스를 선택하시면 1번, 핫을 선택하시면 2를 입력해주세요.")
        var num1 = readLine()!!.toInt()
        if (num1 == 1) {
            println("아이스를 선택하셨습니다.")
            IceOrHot = "아이스"

        } else {
            println("핫을 선택하셨습니다.")
            IceOrHot = "뜨거운"
        }
    }






}