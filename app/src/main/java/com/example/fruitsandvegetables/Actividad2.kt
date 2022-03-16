package com.example.timeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

import android.os.Bundle
import com.example.artsyapp.temporada1


class Actividad2 : AppCompatActivity() {

    val TAG="com.example.fruitsandvegetables.actividad2.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)


        val b1=findViewById<Button>(R.id.b1)
        b1.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, temporada1::class.java)
            intent.putExtra(TAG, "enero-febrero")
            startActivity(intent)
        })
       val b2= findViewById<Button>(R.id.b2)
        b2.setOnClickListener {
            var intent = Intent(this, temporada1::class.java)
            startActivity(intent)
        }
        val b3=findViewById<Button>(R.id.b3)
        b3.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,temporada1::class.java)
            intent.putExtra(TAG, "mayo-junio")
            startActivity(intent)
        })
        val b4=findViewById<Button>(R.id.b4)
        b4.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,temporada1::class.java)
            intent.putExtra(TAG, "julio-agosto")
            startActivity(intent)
        })
        val b5=findViewById<Button>(R.id.b5)
        b5.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,temporada1::class.java)
            intent.putExtra(TAG, "septiembre-octubre")
            startActivity(intent)
        })
        val b6=findViewById<Button>(R.id.b6)
        b6.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,temporada1::class.java)
            intent.putExtra(TAG, "noviembre-diciembre")
            startActivity(intent)
        })
    }
}

