package com.keepcoding.androidsuperpoderes.components

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.ImageView
import com.keepcoding.androidsuperpoderes.R

class StarComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val imageView: ImageView

    // TODO
    // Variable nueva de tipo Boolean
    // Estado inicial unchecked
    // Cada vez que cambie el estado cambiar el recurso dentro del ImageView

    init {
        imageView = inflate(context, R.layout.component_star, this)
            .findViewById(R.id.iv_star)
    }
}
