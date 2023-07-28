package com.keepcoding.androidsuperpoderes.components

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class StarComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    // Gestionar ambos estados checked y !checked
    // Mostrar star cuando no esté checkeado
    // Mostrar star_filled cuando esté checkeado
    init {
        // TODO inflate view y obtener una instancia del ImageView
    }
}
