package com.curso.android.app.practica.application1

import TextComparer
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    private val textComparer = TextComparer()

    fun String.compareTexts(text2: String): Boolean {
        return this == text2
    }

    fun compareTexts(text1: String, text2: String) {

    }

}
