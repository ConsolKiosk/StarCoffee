package com.example.starcoffee.page

import com.example.starcoffee.main

class DrinkPage() {
    fun drinkPage() {
        val turnMainpage = MainPage()
        val turnAdepage = AdePage()
        val turnCoffeePage = CoffeePage()
        val turnFrappuccinoPage = FrappuccinoPage()
        val turnNonCoffeePage = NonCoffeePage()

        println("[ Drink MENU ]")
        for ((index, i) in drinkList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: { main() }

            when (commandNumber) {
                1 -> turnAdepage.adePage()
                2 -> turnCoffeePage.coffeePage()
                3 -> turnFrappuccinoPage.frappuccinoPage()
                4 -> turnNonCoffeePage.nonCoffeePage()
                0 -> turnMainpage.mainPage()

            }
        }
    }
}