package com.example.starcoffee.page

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalTime


class OrderPage {

    @RequiresApi(Build.VERSION_CODES.O)

    fun orderPage(customers: Int) {
        var totalOrder= 0.0

        val currentTime = LocalTime.now()
        val hour = currentTime.hour
        val minute = currentTime.minute

        val startTime = System.currentTimeMillis()
        val endTime = System.currentTimeMillis()
        val settingTimeInMillis = endTime - startTime
        val settingTimeInSeconds = settingTimeInMillis / 5000.0

        var mainPage = MainPage()
        var setCustomer = customers
        if ( settingTimeInSeconds % 5 == 0.0 ){println("아래와 같이 주문하시겠습니꺄? (현재 주문 대기수: ${setCustomer})")}



        println("[ Orders ]")
        for((key, value) in orderLists.entries) {
            println("${key}\t\t | W ${value} |")
            totalOrder += value
        }
        println("[ Total ]\nW ${totalOrder}")

        while(true) {
            println("1. 주문, 2. 메뉴판")
            val orderNum = readLine()?.trim()?.toIntOrNull() ?: 999
            when(orderNum) {
                1 -> {
                    if(balanceAmount >= totalOrder) {
                        if(hour>=12){
                            println("현재 시각은 오후 ${hour-12} 시 ${minute} 분입니다.")
                        }
                        else {
                            println("현재 시각은 오전 ${hour} 시 ${minute} 분입니다.")
                        }

                        if(hour in 9..22){
                            balanceAmount -= totalOrder
                            println("주문이 완료되었습니다. 현재 잔액은 ${balanceAmount} 입니다.")
                            mainPage.changeCustomer(++setCustomer)

                            orderLists.clear()
                        }
                        else {
                            println("카페 운영은 오전 9시부터 오후 6시까지 운영합니다. 현재 운영시간이 아니므로 주문이 불가능합니다.")
                            mainPage.changeCustomer(0)
                            orderLists.clear()
                            break
                        }

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