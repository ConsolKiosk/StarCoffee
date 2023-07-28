package com.example.starcoffee.page


import android.os.Build
import androidx.annotation.RequiresApi
import com.example.starcoffee.ANSI_BLACK
import com.example.starcoffee.ANSI_GREEN_BACKGROUND
import com.example.starcoffee.ANSI_Light_GREEN_BACKGROUND
import com.example.starcoffee.ANSI_RESET
import com.example.starcoffee.Test_Coroutine
import java.io.OutputStream
import java.io.PrintStream

class MainPage() {
    val controlPrint = Test_Coroutine()



    fun changeCustomer(newCustomer: Int) {
        customers = newCustomer
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun mainPage(){
        val turnDrinkpage= DrinkPage()
        val turnFoodpage = FoodPage()
        val turnProductpage = ProductPage()
        val turnOrderpage = OrderPage()



        while (true) {

            println(ANSI_GREEN_BACKGROUND+"★★★★★★★★★★★★★★★★★ " + ANSI_RESET)
            println(ANSI_GREEN_BACKGROUND +ANSI_BLACK+"STARCOFFEE 에 오신걸 환영합니다."+ANSI_RESET)
            println(ANSI_GREEN_BACKGROUND+"★★★★★★★★★★★★★★★★★ " + ANSI_RESET)
            println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
            println("[ STARCOFFEE MENU ]")
            println("1. Drink            ｜")
            println("2. Food             ｜")
            println("3. MD               ｜")
            if(!orderLists.isEmpty()) { //장바구니에 물건이 있을때만 출력
                println("0. Order            | 장바구니 확인 후 주문")
            }
            println("아래 메뉴를 골라 입력해주세요")


            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999

            when (commandNumber) {
                1 -> turnDrinkpage.drinkPage()
                2 -> turnFoodpage.foodPage()
                3 -> turnProductpage.productPage()
                0 -> turnOrderpage.orderPage(customers)
                else -> println("메뉴를 다시 입력해주세요.")
            }
        }
    }
}