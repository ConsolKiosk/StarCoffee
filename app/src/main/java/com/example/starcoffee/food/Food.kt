package com.example.starcoffee.food

interface Food {
    val category: String
    val name: String
    val price: Double
    fun order()
}