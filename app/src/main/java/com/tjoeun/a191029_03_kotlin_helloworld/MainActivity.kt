package com.tjoeun.a191029_03_kotlin_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("코틀린기초", "Hello World!!")
        Log.d("코틀린기초", "제 이름은 김형기입니다")


        var num1 = 10
        Log.d("코틀린기초",String.format("%d", num1))

        val Pi = 3.14
//        Pi = 31.4
        Log.d("코틀린기초", String.format("%f", Pi))

        var num2:Int
        num2 = 20

        Log.d("코틀린기초", String.format("%d", num2))

        num2 = num2.plus(10)
        Log.d("코틀린기초", String.format("%d", num2))

        var num3:Int? = null




    }
}
