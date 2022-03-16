package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fruitsandvegetables.MainActivity
import com.example.fruitsandvegetables.R

class Actividad5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad5)



        val bju= findViewById<Button>(R.id.de)
        bju.setOnClickListener {
            var intent = Intent(this, Mamoncillo::class.java)
            startActivity(intent)
        }
        val bju2= findViewById<Button>(R.id.de2)
        bju2.setOnClickListener {
            var intent = Intent(this, Platano::class.java)
            startActivity(intent)
        }
        val bju3= findViewById<Button>(R.id.des3)
        bju3.setOnClickListener {
            var intent = Intent(this, Pitahaya::class.java)
            startActivity(intent)
        }
        val bju4= findViewById<Button>(R.id.des4)
        bju4.setOnClickListener {
            var intent = Intent(this, Yuca::class.java)
            startActivity(intent)
        }
        val bju5= findViewById<Button>(R.id.des5)
        bju5.setOnClickListener {
            var intent = Intent(this, Camote::class.java)
            startActivity(intent)
        }
        val bju6= findViewById<Button>(R.id.des6)
        bju6.setOnClickListener {
            var intent = Intent(this,Sacpa::class.java)
            startActivity(intent)
        }
    }
}