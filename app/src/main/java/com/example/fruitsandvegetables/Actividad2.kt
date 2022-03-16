package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle

class Actividad2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)


        val bt= findViewById<Button>(R.id.b1)
        bt.setOnClickListener {
            var intent = Intent(this, Actividad3::class.java)
            startActivity(intent)

        }
        val bFrid= findViewById<Button>(R.id.b2)
        bFrid.setOnClickListener {
            var intent = Intent(this, Actividad4::class.java)
            startActivity(intent)
        }
        val bFr= findViewById<Button>(R.id.b3)
        bFr.setOnClickListener {
            var intent = Intent(this, Actividad5::class.java)
            startActivity(intent)
        }
        val bF= findViewById<Button>(R.id.b4)
        bF.setOnClickListener {
            var intent = Intent(this, Actividad6::class.java)
            startActivity(intent)
        }
        val bda= findViewById<Button>(R.id.b5)
        bda.setOnClickListener {
            var intent = Intent(this, Actividad7::class.java)
            startActivity(intent)
        }
        val ba= findViewById<Button>(R.id.b6)
        ba.setOnClickListener {
            var intent = Intent(this, Actividad8::class.java)
            startActivity(intent)
        }


    }
}

