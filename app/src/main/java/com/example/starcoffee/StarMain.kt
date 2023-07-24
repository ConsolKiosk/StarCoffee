package com.example.starcoffee

import com.example.starcoffee.drink.ade.Ade


fun main() {
    var mainpage = MainPage()
    mainpage.mainPage()


//    val money = Money()
//    println(money.translate(3.5))
//    println(money.currentMoney)


}
class MainPage() {

    fun mainPage(){
        var adepage = AdePage()

        println("[ STARCOFFEE MENU ]")
        println("1. Ade            ｜ ${ade0.displayInfo()}")
        println("2. Coffee         ｜ ${coffee0.displayInfo()}")
//        println("3. Frappuccino    ｜ ${.displayInfo()}")
//        println("4. Non-Coffee     ｜ ${.displayInfo()}")
        println("0. 종료 ｜ 프로그램 종료")

        println("메뉴를 골라 입력해주세요")
        while (true) {
            when (readLine()) {
                "1" -> adepage.adePage()
                "0" -> {println("종료되었습니다!!")
                    break}

            }
        }

        }
}





class AdePage() {


    fun adePage() {
        var mainpage = MainPage()

        println("[ Ade MENU ]")
        for ((index, i) in adeList.withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ${i.displayInfo()}")
        }
            println("0. 뒤로 가기 ｜ 뒤로 가기")
            println("메뉴를 골라 입력해주세요")
            var adePageButton = readLine()
            when (adePageButton) {
                "0" -> mainpage.mainPage()
            }


    }
}






