package com.curso.android.app.practica.application1

import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest {
    @Test
    fun testCompareTexts_equalStrings() {
        val viewModel = MainViewModel()
        val text1 = "Hola"
        val text2 = "Hola"
        val result = viewModel.compareTexts(text1, text2)
        assertEquals(true, result)
    }

    @Test
    fun testCompareTexts_differentStrings() {
        val viewModel = MainViewModel()
        val text1 = "Hola"
        val text2 = "Adiós"
        val result = viewModel.compareTexts(text1, text2)
        assertEquals(false, result)
    }
}
