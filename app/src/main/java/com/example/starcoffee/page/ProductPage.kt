package com.example.starcoffee.page

import com.example.starcoffee.Test_Coroutine

class ProductPage {
    val controlPrint = Test_Coroutine()
    fun productPage() {
        println("[ MD MENU ]")
        for ((index, i) in mdList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기")
        println("아래 카테고리를 골라 입력해주세요")
        while (true) {
            val commandNumber = controlPrint.controlPrint()
            when (commandNumber) {
                in 1..4 -> {
                    mdChoicePage(commandNumber-1)
                    return
                }
                0 -> return
                else -> println("카테고리를 다시 입력해주세요!")
            }
        }
    } // fun mdPage()
    fun mdChoicePage(k : Int) {
        var choiceMdList = mutableListOf(mugList, tumblerList, viaList, accessoriesList)

        println("[ ${choiceMdList[k][0].category} MENU ]")
        for ((index, i) in choiceMdList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기")
        println("아래 항목을 골라 입력해주세요")
        while(true) {
            val mdNum = controlPrint.controlPrint()
            when(mdNum) {
                in 1..4 -> {
                    println("${choiceMdList[k][mdNum - 1].name} | W ${choiceMdList[k][mdNum - 1].price}")
                    println("위 메뉴를 장바구니에 추가하시겠습니까?")
                    while(true) {
                        println("1. 확인, 2. 취소")
                        var listAddNum = controlPrint.controlPrint()
                        when(listAddNum) {
                            1 -> {
                                println("${choiceMdList[k][mdNum - 1].name} 가 장바구니에 추가되었습니다.")
                                orderLists.put(choiceMdList[k][mdNum-1].name, choiceMdList[k][mdNum-1].price)
                                return
                            }
                            2 -> {
                                return
                            }
                            else -> println("다시 입력해주세요.")
                        }
                    }
                }
                0 -> return productPage()
                else -> println("다시 입력해주세요.")
            }
        }
    }
}