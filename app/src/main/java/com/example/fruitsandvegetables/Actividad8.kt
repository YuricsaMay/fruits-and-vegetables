package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Actividad8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad8)



        val bdiv= findViewById<Button>(R.id.descripcion)
        bdiv.setOnClickListener {
            var intent = Intent(this, Camote::class.java)
            startActivity(intent)
        }
        val bdiv2= findViewById<Button>(R.id.descripcion1)
        bdiv2.setOnClickListener {
            var intent = Intent(this, Cana::class.java)
            startActivity(intent)
        }
        val bdiv3= findViewById<Button>(R.id.descripcion2)
        bdiv3.setOnClickListener {
            var intent = Intent(this, Yuca::class.java)
            startActivity(intent)
        }
        val bdiv4= findViewById<Button>(R.id.descripcion3)
        bdiv4.setOnClickListener {
            var intent = Intent(this, Toronja::class.java)
            startActivity(intent)
        }
        val bdiv5= findViewById<Button>(R.id.descripcion4)
        bdiv5.setOnClickListener {
            var intent = Intent(this, Naranja::class.java)
            startActivity(intent)
        }
        val bdiv6= findViewById<Button>(R.id.descripcion5)
        bdiv6.setOnClickListener {
            var intent = Intent(this, Jicama::class.java)
            startActivity(intent)
        }
    }
}