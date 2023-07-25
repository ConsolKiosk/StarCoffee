package com.example.starcoffee.page

class DrinkPage() {
    fun drinkPage() {
        val mainpage = MainPage()
        val adeapge = AdePage()

        println("[ Drink MENU ]")
        for ((index, i) in drinkList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            when (readLine()) {
                "0" -> mainpage.mainPage()
                "1" -> adeapge.adePage()


            }
        }
    }
}