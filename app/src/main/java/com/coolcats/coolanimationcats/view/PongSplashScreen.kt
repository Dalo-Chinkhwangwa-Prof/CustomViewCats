package com.coolcats.coolanimationcats.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class PongSplashScreen(context: Context): View(context) {


    private var speedX = 150f
    private var speedY = 150f

    private val radius = 77f

    private var positionX = radius

    private var positionY = radius

    private val paint = Paint()
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.RED)
        paint.color = Color.WHITE

        canvas.drawCircle(positionX, positionY, radius, paint)

        positionX += speedX
        positionY += speedY

        if((positionX+radius) >= canvas.width.toFloat() || (positionX-radius )<= 0){
            speedX *= -1
        }

        if((positionY+radius) >= canvas.height.toFloat() || (positionY-radius) <= 0 ){
            speedY *= -1
        }

        invalidate()
    }


}