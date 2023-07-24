package com.example.starcoffee.MD

abstract class Mug : MD {
    override var category: String = "Mug"
    abstract var name: String
    abstract var price: Double

    //displayInfo() 함수를 StarCoffee 인터페이스 에서 상속 받는다.
}