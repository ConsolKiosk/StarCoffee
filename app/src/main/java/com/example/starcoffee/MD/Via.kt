package com.example.starcoffee.MD

abstract class Via : MD {
    override var category: String = "via"
    abstract var name: String
    abstract var price: Double

    //displayInfo() 함수를 StarCoffee 인터페이스 에서 상속 받는다.
}