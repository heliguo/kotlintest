package com.example.kotlinmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinmvvm.R

class MainActivity : AppCompatActivity() {
    //?代表bundle 可以为空
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}