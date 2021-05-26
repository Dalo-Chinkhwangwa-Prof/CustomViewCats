package com.coolcats.coolanimationcats.view.custom

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.coolcats.coolanimationcats.R

@SuppressLint("Recycle")
class CoolCatzProgressBar(context: Context, attrs: AttributeSet): CardView(context, attrs) {

    private lateinit var messageTextView: TextView
    var progressBar: ProgressBar

    private val animat = AnimationUtils.loadAnimation(context, R.anim.scale_up)

    var message: String = "Message"
    set(value) {
        field = value
        messageTextView.text = field
        messageTextView.startAnimation(animat)
    }


    fun setProgressOnClick(onClick: View.OnClickListener){
        progressBar.setOnClickListener(onClick)
    }

//    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    private val view = LayoutInflater.from(context).inflate(
        R.layout.custom_spinner_layout,
        this,
        true
    )

    init {
        messageTextView = view.findViewById(R.id.message_textview)
        progressBar = view.findViewById(R.id.custom_progress)

        val typedArray: TypedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.CoolCatzProgressBar
        )

        messageTextView.text = typedArray.getString(R.styleable.CoolCatzProgressBar_exampleText)
    }



}