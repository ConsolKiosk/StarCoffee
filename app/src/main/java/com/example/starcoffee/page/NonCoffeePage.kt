package com.example.starcoffee.page

class NonCoffeePage {
    fun nonCoffeePage() {
        val mainpage = MainPage()
        val turnDrinkpage = DrinkPage()

        println("[ Frappuccino MENU ]")
        for ((index, i) in frappuccinoList.withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 0
        if (commandNumber == 0 ) {turnDrinkpage.drinkPage()}
        else if (commandNumber > frappuccinoList.size) {turnDrinkpage.drinkPage()}
        else {
            productList.add(frappuccinoList[commandNumber - 1].name)
            productPriceList.add(frappuccinoList[commandNumber - 1].price)
            println("${frappuccinoList[commandNumber - 1].name}(을/를) W ${frappuccinoList[commandNumber - 1].price}에 구매하였습니다!!")
            println("메인 페이지로 돌아갑니다.")
            println("현재 구매 내역 ${productList}")
            mainpage.mainPage()

        }
    }
}