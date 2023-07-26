package com.example.starcoffee.page

class MdPage {
    fun mdPage() {
        val turnMainpage = MainPage()


        println("[ MD MENU ]")
        for ((index, i) in mdList.withIndex()) {
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
                1 -> mdChoicePage(0)
                2 -> mdChoicePage(1)
                3 -> mdChoicePage(2)
                4 -> mdChoicePage(3)
                0 -> turnMainpage.mainPage()

            }
        }
    } // fun drinkPage()
    fun mdChoicePage(k : Int) {
        var choiceList = mutableListOf(accessoriesList, mugList, tumblerList, viaList)

        val mainpage = MainPage()
        val turnMdpage = MdPage()

        println("[ ${choiceList[k][0].category} MENU ]")
        for ((index, i) in choiceList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 0
        if (commandNumber == 0 ) {turnMdpage.mdPage()}
        else if (commandNumber > choiceList[k].size) {turnMdpage.mdPage()}
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