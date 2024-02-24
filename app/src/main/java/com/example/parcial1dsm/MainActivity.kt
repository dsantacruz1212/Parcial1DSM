package com.example.parcial1dsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.ejercicio1).setOnClickListener {

            startActivity(Intent(this, Ejercicio1::class.java))
        }

        findViewById<Button>(R.id.ejercicio2).setOnClickListener {

            startActivity(Intent(this, Ejercicio2::class.java))
        }

        findViewById<Button>(R.id.ejercicio3).setOnClickListener {
            startActivity(Intent(this, Ejercicio3::class.java))
        }


    }
}
