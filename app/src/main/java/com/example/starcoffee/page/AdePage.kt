package com.example.starcoffee.page

class AdePage() {
    fun adePage() {
        val mainpage = MainPage()
        val turnDrinkpage = DrinkPage()

        println("[ Ade MENU ]")
        for ((index, i) in adeList.withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
//        while (true) {
//            when (readLine()) {
//                "0" -> turnDrinkpage.drinkPage()
//                "1" -> {productPriceList.add(ade1.price)
//                    productList.add(ade1.name)
//                    println("${ade1.name}(을/를) W ${ade1.price}에 구매하였습니다!!")
//                    println("메인 페이지로 돌아갑니다.")
//                    mainpage.mainPage()}
//                "2" ->
//                "3" ->
//                "4" ->
//    //            }  이 라인 밑으로 잘 동작되면 when문은 나중에 지우기
//        }

        val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 0
        if (commandNumber == 0 ) {turnDrinkpage.drinkPage()}
        else if (commandNumber > adeList.size) {turnDrinkpage.drinkPage()}
        else {
            productList.add(adeList[commandNumber - 1].name)
            productPriceList.add(adeList[commandNumber - 1].price)
            println("${adeList[commandNumber - 1].name}(을/를) W ${adeList[commandNumber - 1].price}에 구매하였습니다!!")
            println("메인 페이지로 돌아갑니다.")
            println("현재 구매 내역 ${productList}")
            mainpage.mainPage()

        }
    }
}