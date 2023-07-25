package com.example.starcoffee.page

class DrinkPage() {
    fun drinkPage() {
        val turnMainpage = MainPage()
        val turnAdepage = AdePage()

        println("[ Drink MENU ]")
        for ((index, i) in drinkList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            when (readLine()) {
                "0" -> turnMainpage.mainPage()
                "1" -> turnAdepage.adePage()


            }
        }
    }
}