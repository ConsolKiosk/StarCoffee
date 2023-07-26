package com.example.starcoffee.page

import com.example.starcoffee.main


class MainPage() {
    fun mainPage(){
        var calculate = Calculate()
        val turnDrinkpage= DrinkPage()
        val turnFoodpage = FoodPage()

        println("[ STARCOFFEE MENU ]")
        println("1. Drink            ｜")
        println("2. Food             ｜")
        println("3. MD               ｜")
        println("0. 종료              ｜ 프로그램 종료")

        calculate.currentSum()
        println("메뉴를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999

            when (commandNumber) {
                999 -> {
                    println("다시 입력해주세요!")
                    continue}
                1 -> turnDrinkpage.drinkPage()
                2 -> turnFoodpage.foodPage()
//                3 ->
//                4 ->
                0 -> {println("종료되었습니다!!")
                    break}
            }
        }


    }
}