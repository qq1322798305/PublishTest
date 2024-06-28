package com.example.publishtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.Test
import com.example.mylibrary2.Test2
import com.xiaocydx.insets.insets
import com.xiaocydx.insets.systembar.SystemBar

class MainActivity : AppCompatActivity(), SystemBar {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Test().run()
        Test2().run()
        window.decorView.insets()
    }
}