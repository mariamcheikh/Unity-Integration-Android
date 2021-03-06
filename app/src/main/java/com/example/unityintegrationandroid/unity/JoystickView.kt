package com.example.unityintegrationandroid.unity

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.example.unityintegrationandroid.R

class JoystickView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.view_joystick, this)
    }
}