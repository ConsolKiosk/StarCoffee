package com.example.starcoffee.food

open class Cake(override val name: String, override val price: Double) : Food {
    override val category: String = "food"
    override fun order() {
        TODO("Not yet implemented")
    }
}