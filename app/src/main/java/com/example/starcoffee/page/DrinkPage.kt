package com.example.starcoffee.page

import com.example.starcoffee.main

class DrinkPage() {

    fun drinkPage() {
        val turnMainpage = MainPage()


        println("[ Drink MENU ]")
        for ((index, i) in drinkList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999

            when (commandNumber) {
                999 -> {
                    println("다시 입력해주세요!")
                    continue}
                1 -> drinkChoicePage(0)
                2 -> drinkChoicePage(1)
                3 -> drinkChoicePage(2)
                4 -> drinkChoicePage(3)
                0 -> turnMainpage.mainPage()

            }
        }
    } // fun drinkPage()
    fun drinkChoicePage(k : Int) {
        var choiceList = mutableListOf(adeList, coffeeList, frappuccinoList, noncoffeeList)

        val mainpage = MainPage()
        val turnDrinkpage = DrinkPage()

        println("[ ${choiceList[k][0].category} MENU ]")
        for ((index, i) in choiceList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 0
        if (commandNumber == 0 ) {turnDrinkpage.drinkPage()}
        else if (commandNumber > choiceList[k].size) {turnDrinkpage.drinkPage()}
        else {
            productList.add(choiceList[k][commandNumber - 1].name)
            productPriceList.add(choiceList[k][commandNumber - 1].price)
            println("${choiceList[k][commandNumber - 1].name}(을/를) W ${choiceList[k][commandNumber - 1].price}에 구매하였습니다!!")
            println("메인 페이지로 돌아갑니다.")
            println("현재 구매 내역 ${productList}")
            mainpage.mainPage()

        }
    }
}