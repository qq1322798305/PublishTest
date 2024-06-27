package com.example.publishtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.Test
import com.example.mylibrary2.Test2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Test().run()
        Test2().run()
    }
}