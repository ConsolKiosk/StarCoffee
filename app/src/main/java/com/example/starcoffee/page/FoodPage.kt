package com.example.starcoffee.page

class FoodPage {
    fun foodPage() {
        println("[ Food MENU ]")
        for ((index, i) in foodList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999
            when (commandNumber) {
                in 1..3 -> {
                    foodChoicePage(commandNumber-1)
                    return
                }
                0 -> return
                else -> println("다시 입력해주세요!")
            }
        }
    } //fun foodPage()
    fun foodChoicePage(k : Int) {
        var choiceFoodList = mutableListOf(breadList, cakeList, sandwichList)

        println("[ ${choiceFoodList[k][0].category} MENU ]")
        for ((index, i) in choiceFoodList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while(true) {
            val foodNum = readLine()?.trim()?.toIntOrNull() ?: 999
            when(foodNum) {
                in 1..4 -> {
                    println("${choiceFoodList[k][foodNum - 1].name} | W ${choiceFoodList[k][foodNum - 1].price}")
                    println("위 메뉴를 장바구니에 추가하시겠습니까?")
                    while(true) {
                        println("1. 확인, 2. 취소")
                        var listAddNum = readLine()?.trim()?.toIntOrNull() ?: 999
                        when(listAddNum) {
                            1 -> {
                                println("${choiceFoodList[k][foodNum - 1].name} 가 장바구니에 추가되었습니다.")
                                orderLists.put(choiceFoodList[k][foodNum-1].name, choiceFoodList[k][foodNum-1].price)
                                println("메인 페이지로 돌아갑니다.")
                                return
                            }
                            2 -> {
                                println("취소하셨습니다. 메인 페이지로 돌아갑니다.")
                                return
                            }
                            else -> println("다시 입력해주세요.")
                        }
                    }
                }
                0 -> return
                else -> println("다시 입력해주세요.")
            }
        }
    }
}