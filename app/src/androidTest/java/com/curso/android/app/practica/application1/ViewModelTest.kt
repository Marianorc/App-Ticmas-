package com.curso.android.app.practica.application1

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @JvmField
    @Rule
    var activityRule: Unit = ActivityTestRule(MainActivity::class.java)

    private fun ActivityTestRule(java: Class<MainActivity>) {

    }

    @Test
    fun testTextComparison() {
        // Ingresar texto en los EditText
        Espresso.onView(ViewMatchers.withId(R.id.editText1)).perform(ViewActions.typeText("Hello"))
        Espresso.onView(ViewMatchers.withId(R.id.editText2)).perform(ViewActions.typeText("World"))

        // Hacer clic en el botón
        Espresso.onView(ViewMatchers.withId(R.id.buttonCompare)).perform(ViewActions.click())

        // Verificar el resultado en el TextView
        Espresso.onView(ViewMatchers.withId(R.id.textResult))
            .check(ViewAssertions.matches(ViewMatchers.withText("Las cadenas son diferentes")))
    }
}

class ActivityTestRule<T> {

}
