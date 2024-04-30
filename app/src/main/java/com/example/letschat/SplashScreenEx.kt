package com.example.letschat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_ex)

        supportActionBar?.hide()


        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this,Login::class.java)
                startActivity(i)
                finish() },3000)
    }
}