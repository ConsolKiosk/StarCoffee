package com.example.starcoffee

import com.example.starcoffee.page.customers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import com.example.starcoffee.page.MainPage

class Test_Coroutine {
    fun printOrder(){
        var printingOrder = GlobalScope.launch{
            while(true) {

                delay(5000)
                var customer = customers
                println("")
                println(ANSI_GREEN_BACKGROUND +ANSI_BLACK+ "현재 주문 대기수 (${customer}개)" + ANSI_RESET)
                println("")

            }
        }

    }
}