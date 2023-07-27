package com.example.starcoffee.page



class DrinkPage() {
    fun drinkPage() {
1
        println("[ Drink MENU ]")
        for ((index, i) in drinkList.withIndex()) {
            println("${index + 1}. ${i.category}")
        }
        println("0. 뒤로 가기")
        println("아래 카테고리를 골라 입력해주세요")
        while (true) {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 999
            when (commandNumber) {
                in 1..4 -> {
                    drinkChoicePage(commandNumber-1)
                    return
                }
                0 -> return
                else -> println("카테고리를 다시 입력해주세요.")
            }
        }
    } // fun drinkPage()
    fun drinkChoicePage(k : Int) {
        var choiceDrinkList = mutableListOf(coffeeList, noncoffeeList, frappuccinoList, adeList)

        println("[ ${choiceDrinkList[k][0].category} MENU ]")
        for ((index, i) in choiceDrinkList[k].withIndex()) {
            println("${index + 1}. ${i.name} ｜ W ${i.price} ｜ ")
        }
        println("0. 뒤로 가기")
        println("아래 항목을 골라 입력해주세요")
        while(true) {
            val drinkNum = readLine()?.trim()?.toIntOrNull() ?: 999
            when(drinkNum) {
                in 1..4 -> {
                    lateinit var updateSizePrice: Pair<String, Double>
                    if(k==0 || k==1) { //coffee, nonCoffee인 경우 (Ice/Hot 선택 가능)
                        var chooseIceName:String = iceOrHot(choiceDrinkList[k][drinkNum-1].name)
                        updateSizePrice = chooseDrinkSize(chooseIceName,choiceDrinkList[k][drinkNum-1].price)
                    } else { //k==2 || k==3 //frappuccino, ade인 경우 (Only Ice만 선택 가능)
                        updateSizePrice = chooseDrinkSize(choiceDrinkList[k][drinkNum-1].name,choiceDrinkList[k][drinkNum-1].price)
                    }
                    var chooseSize = updateSizePrice.first
                    var sizePrice = updateSizePrice.second
                    println("${chooseSize} | W ${sizePrice}")
                    println("위 메뉴를 장바구니에 추가하시겠습니까?")
                    while(true) {
                        println("1. 확인, 2. 취소")
                        var listAddNum = readLine()?.trim()?.toIntOrNull() ?: 999

                        when(listAddNum) {
                            1 -> {
                                println("${chooseSize} 가 장바구니에 추가되었습니다.")
                                orderLists.put(chooseSize, sizePrice)
                                return
                            }
                            2 -> {
                                return
                            }
                            else -> println("다시 입력해주세요.")
                        }
                    }
                }
                0 -> return drinkPage()
                else -> println("항목을 다시 입력해주세요.")
            }
        }
    }

    fun chooseDrinkSize(name:String, price:Double): Pair<String, Double> { //기능구현이유 : Size 선택 후 가격 재측정
        var sizeName = " "
        var optionPrice:Double = price
        println("${name}을 선택하셨습니다.")
        println("원하시는 커피의 사이즈를 선택해주세요")
        println("1. Tall")
        println("2. Grande")
        println("3. Venti")

        while(true)
        {
            val commandNumber = readLine()?.trim()?.toIntOrNull() ?: 0
            if(commandNumber == 1){
                println("Tall 사이즈를 선택하셨습니다.")
                sizeName = name.trimEnd() + "_Tall_Size" //name 변수 재지정
                break
            }else if(commandNumber == 2){
                println("Grande 사이즈를 선택하셨습니다. 가격이 500원 추가 됩니다.")
                sizeName = name.trimEnd() + "_Grande_Size" //name 재지정
                optionPrice += 0.5
                break
            }else if(commandNumber == 3){
                println("Venti 사이즈를 선택하셨습니다. 가격이 1000원 추가 됩니다.")
                sizeName = name.trimEnd() + "_Venti_Size" //name 재지정
                optionPrice += 1.0
                break
            }else{
                println("잘못된 값을 입력하셨습니다.")

            }
        }
        return Pair(sizeName, optionPrice)
    }

    fun iceOrHot(name:String): String { // 기능구현 이유 : 시원한커피, 따듯한 커피 구분 위해
        var input:String = name
        println("원하시는 옵션을 선택해주세요.")
        println("1. Ice")
        println("2. Hot")

        while (true) {
            var inputnum1 = readLine()?.trim()?.toIntOrNull() ?: 0//사용자 Input 받음
            if (inputnum1 == 1) { //아이스 선택시
                input = "Ice_" + name.trim() // 이름 변수 앞 아이스 추가
                break
            } else if (inputnum1 == 2) { //핫 선택시
                input = "Hot_" + name.trim() // 1이름 변수 앞 아이스 추가
                break
            } else println("잘못된 번호를 선택하셨습니다. 다시 선택해주세요.") //잘못된 선택시 출력
        }
        return input
    }
}
