package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Actividad6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad6)

        val bag= findViewById<Button>(R.id.descripcion)
        bag.setOnClickListener {
            var intent = Intent(this, Naranja::class.java)
            startActivity(intent)
        }
        val bag2= findViewById<Button>(R.id.descripcion1)
        bag2.setOnClickListener {
            var intent = Intent(this, Limon::class.java)
            startActivity(intent)
        }
        val bag3= findViewById<Button>(R.id.descripcion2)
        bag3.setOnClickListener {
            var intent = Intent(this, Mandarina::class.java)
            startActivity(intent)
        }
        val bag4= findViewById<Button>(R.id.descripcion3)
        bag4.setOnClickListener {
            var intent = Intent(this, Toronja::class.java)
            startActivity(intent)
        }
        val bag5= findViewById<Button>(R.id.descripcion4)
        bag5.setOnClickListener {
            var intent = Intent(this, Carambola::class.java)
            startActivity(intent)
        }
        val bag6= findViewById<Button>(R.id.descripcion5)
        bag6.setOnClickListener {
            var intent = Intent(this, Naranjaagria::class.java)
            startActivity(intent)
        }
    }
}