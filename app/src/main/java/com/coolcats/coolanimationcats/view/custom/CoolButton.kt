package com.coolcats.coolanimationcats.view.custom

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.coolcats.coolanimationcats.R

class CoolButton(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    private var typedArray: TypedArray = context.obtainStyledAttributes(
        attributeSet,
        R.styleable.CoolButton
    )

    var buttonText: String = "Text"
        set(value) {
            field = value
            invalidate()
        }

    init {
        buttonText = typedArray.getString(R.styleable.CoolButton_buttonText) ?: ""
    }
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(MeasureSpec.EXACTLY, MeasureSpec.EXACTLY)
//    }

    private var radius = 150f
    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.RED
        val x: Float  = width / 2.toFloat()
        val y: Float = height / 2.toFloat()
        canvas?.drawCircle(x, y, radius, paint)

        paint.color = Color.WHITE
        paint.textSize = radius/3

        paint.textAlign = Paint.Align.CENTER

        val perc = radius * 0.15f
        canvas?.drawText(buttonText, x, (y+perc), paint)
    }
}