package com.example.starcoffee.food

abstract class Sandwich: Food {
    override val category: String = "food"
    override fun order() {
        println("$category")
    }
}