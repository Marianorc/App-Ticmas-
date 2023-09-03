package com.curso.android.app.practica.application1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar los elementos de la UI
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val buttonCompare = findViewById<Button>(R.id.buttonCompare)
        val textResult = findViewById<TextView>(R.id.textResult)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        // Configurar el evento de clic en el botón
        buttonCompare.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            // Llamar al método del ViewModel para realizar la comparación
            val areEqual = viewModel.compareTexts(text1, text2)

            // Actualizar la vista (el TextView) con el resultado
            val resultText = if (areEqual) "Las cadenas son iguales" else "Las cadenas son diferentes"
            textResult.text = resultText
        }
    }
}
