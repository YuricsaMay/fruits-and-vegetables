package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Actividad4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad4)



        val bma= findViewById<Button>(R.id.descripcion)
        bma.setOnClickListener {
            var intent = Intent(this, Ciruela::class.java)
            startActivity(intent)
        }
        val bma1= findViewById<Button>(R.id.descripcion1)
        bma1.setOnClickListener {
            var intent = Intent(this, Sandia::class.java)
            startActivity(intent)
        }
        val bma2= findViewById<Button>(R.id.descripcion2)
        bma2.setOnClickListener {
            var intent = Intent(this, Mamey::class.java)
            startActivity(intent)
        }
        val bma3= findViewById<Button>(R.id.descripcion3)
        bma3.setOnClickListener {
            var intent = Intent(this, Mango::class.java)
            startActivity(intent)
        }
        val bma5= findViewById<Button>(R.id.descripcion4)
        bma5.setOnClickListener {
            var intent = Intent(this, Zapote::class.java)
            startActivity(intent)
        }
        val bma6= findViewById<Button>(R.id.descripcion5)
        bma6.setOnClickListener {
            var intent = Intent(this, Papaya::class.java)
            startActivity(intent)
        }
    }
}