package com.example.dev.androidified

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    val time = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val homeintent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(homeintent)
            finish()
        }, time.toLong())
    }
}
