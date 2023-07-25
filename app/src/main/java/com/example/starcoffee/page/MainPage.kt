package com.example.starcoffee.page



class MainPage() {
    fun mainPage(){
        val adepage = AdePage()

        println("[ STARCOFFEE MENU ]")
        println("1. Drink            ｜")
        println("2. Food             ｜")
        println("3. MD               ｜")
        println("4. Non-Coffee       ｜")
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