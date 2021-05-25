package com.coolcats.coolanimationcats.service

import android.app.IntentService
import android.content.Intent
import android.util.Log

class CountDownService: IntentService("CountDown") {
    override fun onHandleIntent(p0: Intent?) {
        for(i in 1..20){
            Thread.sleep(1000)
            Log.d("TAG_X", "Final Countdown: $i from ${Thread.currentThread().name}")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG_X", "Done..destroyed..")
    }
}