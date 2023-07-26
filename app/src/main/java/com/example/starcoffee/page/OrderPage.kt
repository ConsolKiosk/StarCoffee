package com.example.starcoffee.page

class OrderPage {
    fun orderPage() {
        var totalOrder= 0.0

        println("아래와 같이 주문하시겠습니꺄?")
        println("[ Orders ]")
        for((key, value) in orderLists.entries) {
            println("${key}\t\t | W ${value} |")
            totalOrder += value
        }
        println("\n[ Total ]\nW ${totalOrder}")

        while(true) {
            println("1. 주문, 2. 메뉴판")
            val orderNum = readLine()?.trim()?.toIntOrNull() ?: 999
            when(orderNum) {
                1 -> {
                    if(balanceAmount >= totalOrder) {
                        balanceAmount -= totalOrder
                        println("주문이 완료되었습니다. 현재 잔액은 ${balanceAmount} 입니다.")
                        orderLists.clear()
                    } else { //잔액 부족
                        println("현재 잔액은 ${balanceAmount}W 으로 ${totalOrder-balanceAmount}W이 부족해서 주문할 수 없습니다.")
                    }
                    return
                }
                2 -> {
                    return
                }
                else -> {
                    println("다시 입력해주세요.")
                }
            }
        }
    }
}