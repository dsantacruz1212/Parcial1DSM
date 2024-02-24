package com.example.parcial1dsm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio3)

        val buttonRegresar3 = findViewById<Button>(R.id.buttonRegresar3)
        val buttonCalcular3 = findViewById<Button>(R.id.buttonCalcular3)
        val buttonLimpiar = findViewById<Button>(R.id.buttonLimpiar)
        val buttonSuma = findViewById<Button>(R.id.buttonSuma)
        val buttonResta = findViewById<Button>(R.id.buttonResta)
        val buttonMultiplicacion = findViewById<Button>(R.id.buttonMultiplicacion)
        val buttonDivision = findViewById<Button>(R.id.buttonDivision)
        val numero1 = findViewById<EditText>(R.id.editTextNumber1)
        val numero2 = findViewById<EditText>(R.id.editTextNumber2)
        val operacion = findViewById<TextView>(R.id.textViewCalculo)
        val respuesta = findViewById<TextView>(R.id.textViewResultados3)

        // BOTON PARA REGRESAR
        buttonRegresar3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // BOTON PARA LIMPIAR
        buttonLimpiar.setOnClickListener {
            numero1.setText("")
            numero2.setText("")
            operacion.text = ""
            respuesta.text = ""
        }

        buttonSuma.setOnClickListener {
            operacion.text = "+"
        }
        buttonResta.setOnClickListener {
            operacion.text = "-"
        }
        buttonMultiplicacion.setOnClickListener {
            operacion.text = "x"
        }
        buttonDivision.setOnClickListener {
            operacion.text = "/"
        }

        buttonCalcular3.setOnClickListener {
            val operacionText = operacion.text.toString()
            val numero1Text = numero1.text.toString().toFloatOrNull() ?: 0f
            val numero2Text = numero2.text.toString().toFloatOrNull() ?: 0f
            var resultado: Float = 0f

            if (operacionText == "+") {
                resultado = numero1Text + numero2Text
            } else if (operacionText == "-") {
                resultado = numero1Text - numero2Text
            } else if (operacionText == "x") {
                resultado = numero1Text * numero2Text
            } else if (operacionText == "/") {
                if (numero2Text != 0f) {
                    resultado = numero1Text / numero2Text
                } else {
                    respuesta.textSize = 35f
                    respuesta.text = "No se puede dividir por cero"
                    return@setOnClickListener
                }
            } else {
                respuesta.textSize = 35f
                respuesta.text = "Ingrese una operación para empezar"
                return@setOnClickListener
            }

            respuesta.text = resultado.toString()
        }
    }
}
