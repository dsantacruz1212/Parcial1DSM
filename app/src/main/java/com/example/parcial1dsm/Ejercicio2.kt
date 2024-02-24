package com.example.parcial1dsm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio2)

        val buttonRegresar2 = findViewById<Button>(R.id.buttonRegresar)
        val buttonCalcular2 = findViewById<Button>(R.id.buttonCalcular2)
        // Listener para el botón Calcular
        buttonRegresar2.setOnClickListener {
            // Crear un Intent para iniciar MainActivity
            val intent = Intent(this, MainActivity::class.java)
            // Iniciar MainActivity
            startActivity(intent)
        }
        buttonCalcular2.setOnClickListener {
            // Obtener los valores de los EditText
            val nombre = findViewById<EditText>(R.id.editTextNombre).text.toString()
            val salarioBase = findViewById<EditText>(R.id.editTextSalario).text.toString().toFloatOrNull() ?: 0f
            val iss = salarioBase * 0.03
            val afp = salarioBase *0.04
            val renta = salarioBase *0.05
            val SalarioNeto = salarioBase - iss - afp - renta
            val textViewResultados = findViewById<TextView>(R.id.textViewResultados)


            // Mostrar el resultado en el TextView
            textViewResultados.text = "Nombre: $nombre\n" +
                    "Salario Base: $salarioBase\n" +
                    "Descuento ISS: $iss\n" +
                    "Descuento AFP: $afp\n" +
                    "Descuento Renta: $renta\n" +
                    "Salario Neto: $SalarioNeto\n"


        }
    }
}
