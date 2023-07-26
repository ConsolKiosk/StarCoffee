package com.example.starcoffee.page

class MdPage {
    fun mdPage() {
        println("[ MD MENU ]")
        for ((index, i) in mdList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999
            when (commandNumber) {
                in 1..4 -> {
                    mdChoicePage(commandNumber-1)
                    return
                }
                0 -> return
                else -> println("다시 입력해주세요!")
            }
        }
    } // fun mdPage()
    fun mdChoicePage(k : Int) {
        var choiceMdList = mutableListOf(accessoriesList, mugList, tumblerList, viaList)

        println("[ ${choiceMdList[k][0].category} MENU ]")
        for ((index, i) in choiceMdList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기 ｜ 뒤로 가기")
        println("메뉴를 골라 입력해주세요")
        while(true) {
            val mdNum = readLine()?.trim()?.toIntOrNull() ?: 999
            when(mdNum) {
                in 1..4 -> {
                    println("${choiceMdList[k][mdNum - 1].name} | W ${choiceMdList[k][mdNum - 1].price}")
                    println("위 메뉴를 장바구니에 추가하시겠습니까?")
                    while(true) {
                        println("1. 확인, 2. 취소")
                        var listAddNum = readLine()?.trim()?.toIntOrNull() ?: 999
                        when(listAddNum) {
                            1 -> {
                                println("${choiceMdList[k][mdNum - 1].name} 가 장바구니에 추가되었습니다.")
                                orderLists.put(choiceMdList[k][mdNum-1].name, choiceMdList[k][mdNum-1].price)
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