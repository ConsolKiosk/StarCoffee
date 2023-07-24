package com.example.starcoffee.food

open class Bread(override val name: String, override val price: Double) : Food {
    override val category: String = "food"
    override fun order() {
        println("$category")
    }
}