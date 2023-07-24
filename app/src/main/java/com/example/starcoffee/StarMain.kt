package com.example.starcoffee

fun main() {
    val shackBurger = ShackBurger("shackburger", 10.0)
    shackBurger.displayInfo()
    println(shackBurger.name)
    println(shackBurger.price)

    val calculate = Calculate()

    calculate.productList.add(shackBurger.price)

    println(calculate.currentMoney)
    println(calculate.productList)
    calculate.currentSum()
    println(calculate.afterPayMoney)






}

