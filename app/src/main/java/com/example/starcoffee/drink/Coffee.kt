package com.example.starcoffee.drink

//11

open class Coffee:Drink() {
    override var category: String = "Coffee"
    fun IceOrHot(){ // 기능구현 이유 : 시원한커피, 따듯한 커피 구분 위해
        println("원하시는 메뉴의 숫자를 선택해주세요.")
        println("1. 아이스")
        println("2. 핫")

        while(true) {
            var inputnum1 = readLine()!!.toInt() //사용자 Input 받음
            if (inputnum1 == 1) { //아이스 선택시
                println("아이스 ${name}를 선택하셨습니다.")
                name = "아이스 " + name1 // 이름 변수 앞 아이스 추가
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


class Americano: Coffee() {
    override var name: String = "아메리카노"
    override var price: Double = 4.5
}
class CoffeeLatte: Coffee() {
    override var name: String = "카페라떼"
    override var price: Double = 5.0
}
class Cappuccino: Coffee() {
    override var name: String = "카푸치노"
    override var price: Double = 5.0
}

class Macchiato: Coffee() {
    override var name: String = "마끼야또"
    override var price: Double = 5.9
}