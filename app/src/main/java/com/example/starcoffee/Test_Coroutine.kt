package com.example.starcoffee

import com.example.starcoffee.page.customers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import com.example.starcoffee.page.MainPage
import com.example.starcoffee.page.balanceAmount
import java.io.OutputStream
import java.io.PrintStream
import kotlin.concurrent.thread


class Test_Coroutine {
    fun printOrder(){
        var printingOrder = GlobalScope.launch{
            while(true) {

                delay(5000)
                var customer = customers
                var totalValue = balanceAmount
                print("")
                println("")
                println(ANSI_GREEN_BACKGROUND +ANSI_BLACK+ "현재 주문 대기수 (${customer}개)" + ANSI_RESET)
                println(ANSI_GREEN_BACKGROUND +ANSI_BLACK+ "현재 수중에 남은 금액은"+ ANSI_PURPLE + " ${totalValue} " + ANSI_BLACK + "입니다."+ ANSI_RESET)

            }
        }
    }
    fun orderComplete(){
        val orderCompleting = GlobalScope.launch {
            delay(3000)
            println("")
            println("")
            println("")
            println("")
        }
        runBlocking {orderCompleting.join()}
    }
    fun controlPrint(): Int {
        // 원래의 System.out 객체를 저장해둡니다.
        val originalOut = System.out
        var second:Int = 1 //Thread 수행시간을 측정할 때 사용
        val dummyOut = PrintStream(object : OutputStream() {
            override fun write(b: Int) {
                // 아무 동작도 하지 않음 (출력을 무시)
            }
        })





        var commandNumber:Int =-10
        thread(){
            while (commandNumber<0) {
                Thread.sleep(1000)
                second++

                if (second >= 6) {
                    System.setOut(dummyOut)
                    second = 1
                }

            }
        }

        commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999
        if (commandNumber>=0 || commandNumber <0) {
            System.setOut(originalOut)
        }



        return commandNumber
    }


}