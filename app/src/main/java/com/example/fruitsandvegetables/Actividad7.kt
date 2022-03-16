package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Actividad7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad7)

        val bse= findViewById<Button>(R.id.descripcion)
        bse.setOnClickListener {
            var intent = Intent(this, Elote::class.java)
            startActivity(intent)
        }
        val bse2= findViewById<Button>(R.id.descripcion1)
        bse2.setOnClickListener {
            var intent = Intent(this, Tomate::class.java)
            startActivity(intent)
        }
        val bse3= findViewById<Button>(R.id.descripcion2)
        bse3.setOnClickListener {
            var intent = Intent(this, Calabaza::class.java)
            startActivity(intent)
        }
        val bse4= findViewById<Button>(R.id.descripcion3)
        bse4.setOnClickListener {
            var intent = Intent(this, Frijol::class.java)
            startActivity(intent)
        }
        val bse5= findViewById<Button>(R.id.descripcion4)
        bse5.setOnClickListener {
            var intent = Intent(this, Chile::class.java)
            startActivity(intent)
        }
        val bse6= findViewById<Button>(R.id.descripcion5)
        bse6.setOnClickListener {
            var intent = Intent(this, Rabano::class.java)
            startActivity(intent)
        }
    }
}