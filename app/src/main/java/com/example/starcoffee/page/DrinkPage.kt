package com.example.starcoffee.page

class DrinkPage() {
    fun drinkPage() {
        println("[ Drink MENU ]")
        for ((index, i) in drinkList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999
            when (commandNumber) {
                in 1..4 -> {
                    drinkChoicePage(commandNumber-1)
                    return
                }
                0 -> return
                else -> println("drinkPage 다시 입력해주세요!")
            }
            println("!!!")
        }
    } // fun drinkPage()
    fun drinkChoicePage(k : Int) {
        var choiceDrinkList = mutableListOf(coffeeList, noncoffeeList, frappuccinoList, adeList)

        println("[ ${choiceDrinkList[k][0].category} MENU ]")
        for ((index, i) in choiceDrinkList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while(true) {
            val drinkNum = readLine()?.trim()?.toIntOrNull() ?: 999
            when(drinkNum) {
                in 1..4 -> {
                    println("${choiceDrinkList[k][drinkNum - 1].name} | W ${choiceDrinkList[k][drinkNum - 1].price}")
                    println("위 메뉴를 장바구니에 추가하시겠습니까?")
                    while(true) {
                        println("1. 확인, 2. 취소")
                        var listAddNum = readLine()?.trim()?.toIntOrNull() ?: 999
                        when(listAddNum) {
                            1 -> {
                                println("${choiceDrinkList[k][drinkNum - 1].name} 가 장바구니에 추가되었습니다.")
                                orderLists.put(choiceDrinkList[k][drinkNum-1].name, choiceDrinkList[k][drinkNum-1].price)
                                println("메인 페이지로 돌아갑니다.")
                                return
                            }
                            2 -> {
                                println("취소하셨습니다. 메인 페이지로 돌아갑니다.")
                                return
                            }
                            else -> println("drinkCoicePage 다시 입력해주세요.")
                        }
                    }
                }
                0 -> return
                else -> println("drinkCoicePage else 다시 입력해주세요.")
            }
        }
    }
}