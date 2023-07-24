package com.example.starcoffee.drink

interface Drink {
    var category: String

    open fun sizeFunction(): String {
        println("사이즈를 선택해주세요. (T:톨, G:그란데, V:벤티)")
        while(true) {
            var selectSize: String = readLine()!!
            when(selectSize) {
                "T" -> {
                    println("톨 사이즈를 선택하셨습니다.")
                    return "tall"
                }
                "G" -> {
                    println("그란데 사이즈를 선택하셨습니다.")
                    return "grande"
                    break
                }
                "V" -> {
                    println("벤티 사이즈를 선택하셨습니다.")
                    return "venti"
                    break
                }
                else -> {
                    println("사이즈를 다시 선택해주세요.")
                }
            }
        }
        return "tall"
    }

//    override fun displayInfo() { } //StarCoffee 상속
}