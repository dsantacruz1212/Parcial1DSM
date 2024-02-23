package com.example.parcial1dsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establecer el primer layout por defecto
        setContentView(R.layout.activity_main)

        // Aquí puedes agregar un listener a cada botón para cambiar el layout cuando se presiona
        findViewById<Button>(R.id.ejercicio1).setOnClickListener {
            // Iniciar la actividad Ejercicio1
            startActivity(Intent(this, Ejercicio1::class.java))
        }

        findViewById<Button>(R.id.ejercicio2).setOnClickListener {
            // Cambiar al segundo layout (ejercicio2.xml)
            setContentView(R.layout.ejercicio2)
        }

        findViewById<Button>(R.id.ejercicio3).setOnClickListener {
            // Cambiar al tercer layout (ejercicio3.xml)
            setContentView(R.layout.ejercicio3)
        }
    }
}
