package com.example.starcoffee.page

class AdePage() {
    fun adePage() {
        val mainpage = MainPage()

        println("[ Ade MENU ]")
        for ((index, i) in adeList.withIndex()) {
            println("${index + 1}. ${i.name} \t｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            when (readLine()) {
                "0" -> mainpage.mainPage()
                "1" -> {productPriceList.add(ade1.price)
                    productList.add(ade1.name)
                    println("${ade1.name}(을/를) ${ade1.price}에 구매하였습니다!!")
                    mainpage.mainPage()}


            }
        }
    }
}