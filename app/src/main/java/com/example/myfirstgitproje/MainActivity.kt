package com.example.myfirstgitproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Deneme")

        for(i in 1..5){
            println(i)
        }

        for(i in 1..10){
            println(i)
        }
    }
}