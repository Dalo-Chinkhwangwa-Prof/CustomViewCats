package com.coolcats.coolanimationcats.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.coolcats.coolanimationcats.R
import com.coolcats.coolanimationcats.service.CountDownService
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pongSplashScreen = PongSplashScreen(this)

        setContentView(/*R.layout.activity_main*/pongSplashScreen)


        //val intentS = Intent(this, CountDownService::class.java)
        // startService(intentS)

        val inT = Intent(this, MainActivity2::class.java)
        Handler(mainLooper).postDelayed({
            startActivity(inT.also {
                it.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }, 1000)
    }
}