package com.example.starcoffee.drink

open class NonCoffee:Drink() {
    override var category: String = "NonCoffee"
    fun IceOrHot(){ // 기능구현 이유 : 시원한커피, 따듯한 커피 구분 위해
        println("원하시는 메뉴의 숫자를 선택해주세요.")
        println("1. 아이스")
        println("2. 핫")

        while(true) {
            var inputnum1 = readLine()!!.toInt() //사용자 Input 받음
            if (inputnum1 == 1) { //아이스 선택시
                println("아이스 ${name}를 선택하셨습니다.")
                name = "아이스 " + name // 이름 변수 앞 아이스 추가
                break
            } else if(inputnum1 == 2) { //핫 선택시
                println("뜨거운 ${name}를 선택하셨습니다.")
                name = "뜨거운 " + name // 이름 변수 앞 아이스 추가
                break
            }else println("잘못된 번호를 선택하셨습니다. 다시 선택해주세요.") //잘못된 선택시 출력
        }
        println("${name}")
    }
}

class chocoLatte:NonCoffee () {
    override var name: String = "초코라떼"
    override var price: Double = 5.5
}
class MBBlended: NonCoffee() {
    override var name: String = "망고바나나블렌디드"
    override var price: Double = 6.3
}
class SPLatte: NonCoffee() {
    override var name: String = "고구마라떼"
    override var price: Double = 5.5
}

class SDYBlended: NonCoffee() {
    override var name: String = "딸기딜라이트요거트블렌디드"
    override var price: Double = 6.3
}