package com.example.starcoffee

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.starcoffee.page.MainPage
import kotlinx.coroutines.runBlocking


@RequiresApi(Build.VERSION_CODES.O)
fun main(){


    val printOrder = Test_Coroutine()
    printOrder.printOrder()

    val mainpage = MainPage()
    mainpage.mainPage()


}





