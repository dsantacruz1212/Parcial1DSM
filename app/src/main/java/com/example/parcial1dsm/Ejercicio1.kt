package com.example.parcial1dsm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class Ejercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio1)

        val buttonRegresar = findViewById<Button>(R.id.buttonRegresar)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        // Listener para el botón Calcular
        buttonRegresar.setOnClickListener {
            // Crear un Intent para iniciar MainActivity
            val intent = Intent(this, MainActivity::class.java)
            // Iniciar MainActivity
            startActivity(intent)
        }
        buttonCalcular.setOnClickListener {
            // Obtener los valores de los EditText
            val nombre = findViewById<EditText>(R.id.editTextNombre).text.toString()
            val nota1 = findViewById<EditText>(R.id.editTextNota1).text.toString().toFloatOrNull() ?: 0f
            val nota2 = findViewById<EditText>(R.id.editTextNota2).text.toString().toFloatOrNull() ?: 0f
            val nota3 = findViewById<EditText>(R.id.editTextNota3).text.toString().toFloatOrNull() ?: 0f
            val nota4 = findViewById<EditText>(R.id.editTextNota4).text.toString().toFloatOrNull() ?: 0f
            val nota5 = findViewById<EditText>(R.id.editTextNota5).text.toString().toFloatOrNull() ?: 0f
            val textViewResultados = findViewById<TextView>(R.id.textViewResultados)
            // Calcular el promedio
            val promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5

            // Mostrar el resultado en el TextView
            textViewResultados.text = "Nombre: $nombre\nPromedio: $promedio"


    }
}
}
