package com.example.starcoffee.drink

import com.example.starcoffee.StarMenu

open class Drink : StarMenu() {
    override var category: String = "Drink"
    var name1:String = "테스트"

    fun IceOrHot(){
        println("원하시는 메뉴의 숫자를 선택해주세요.")
        println("1. 아이스")
        println("2. 핫")

        while(true) {
            var inputnum1 = readLine()!!.toInt()
            if (inputnum1 == 1) {
                println("아이스 ${name1}를 선택하셨습니다.")
                name1 = "아이스 " + name1
                break
            } else if(inputnum1 == 2) {
                println("뜨거운 ${name1}를 선택하셨습니다.")
                name1 = "뜨거운 " + name1
                break
            }else println("잘못된 번호를 선택하셨습니다. 다시 선택해주세요.")
        }
        println("${name1}")
    }
}