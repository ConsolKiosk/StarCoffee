package com.example.starcoffee

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.starcoffee.page.MainPage


@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val corutine =Test_Coroutine()
    corutine.printOrder()
    val mainpage = MainPage()
    mainpage.mainPage()

}





