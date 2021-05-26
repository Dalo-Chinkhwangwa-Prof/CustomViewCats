package com.coolcats.coolanimationcats.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageSwitcher
import android.widget.Toast
import com.coolcats.coolanimationcats.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_spinner_layout.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var animation: Animation
    private lateinit var slide: Animation
    var count = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animation = AnimationUtils.loadAnimation(this, R.anim.scale_up)
        slide = AnimationUtils.loadAnimation(this, R.anim.slide_in_fade)
        custom_pb.startAnimation(slide)

        cool_button.setOnClickListener {
            it.startAnimation(animation)
            custom_pb.message = "Count is now at ${++count}"
        }

        custom_pb.setProgressOnClick {
            Toast.makeText(this, "Hello there..", Toast.LENGTH_SHORT).show()
        }

        //(slide_show as ImageSwitcher).start

    }
}