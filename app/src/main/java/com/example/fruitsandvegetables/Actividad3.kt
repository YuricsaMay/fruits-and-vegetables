package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class Actividad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)


        val be1= findViewById<Button>(R.id.descripcion)
        be1.setOnClickListener {
            var intent = Intent(this, Anona::class.java)
            startActivity(intent)
        }
        val be2= findViewById<Button>(R.id.descripcion1)
        be2.setOnClickListener {
            var intent = Intent(this,Huanabana::class.java)
            startActivity(intent)
        }
        val be3= findViewById<Button>(R.id.descripcion2)
        be3.setOnClickListener {
            var intent = Intent(this, Papaya::class.java)
            startActivity(intent)
        }
        val be4= findViewById<Button>(R.id.descripcion3)
        be4.setOnClickListener {
            var intent = Intent(this, Tamarindo::class.java)
            startActivity(intent)
        }
        val be5= findViewById<Button>(R.id.descripcion4)
        be5.setOnClickListener {
            var intent = Intent(this, pina::class.java)
            startActivity(intent)
        }
        val be6= findViewById<Button>(R.id.descripcion5)
        be6.setOnClickListener {
            var intent = Intent(this, Caimito::class.java)
            startActivity(intent)
        }
    }
}