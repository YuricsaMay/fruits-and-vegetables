package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

import android.os.Bundle


class Actividad2 : AppCompatActivity() {

    val TAG="com.example.fruitsandvegetables.actividad2.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)
        val b1=findViewById<Button>(R.id.b1)
        val b2=findViewById<Button>(R.id.b2)
        val b3=findViewById<Button>(R.id.b3)
        val b4=findViewById<Button>(R.id.b4)
        val b5=findViewById<Button>(R.id.b5)
        val b6=findViewById<Button>(R.id.b6)

        b1.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Actividad3::class.java)
            intent.putExtra(TAG, "enero-febrero")
            startActivity(intent)
        })
        b2.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Actividad3::class.java)
            intent.putExtra(TAG, "marzo-abril")
            startActivity(intent)
        })
        b3.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Actividad3::class.java)
            intent.putExtra(TAG, "mayo-junio")
            startActivity(intent)
        })
        b4.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Actividad3::class.java)
            intent.putExtra(TAG, "julio-agosto")
            startActivity(intent)
        })
        b5.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Actividad3::class.java)
            intent.putExtra(TAG, "septiembre-octubre")
            startActivity(intent)
        })
        b6.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Actividad3::class.java)
            intent.putExtra(TAG, "noviembre-diciembre")
            startActivity(intent)
        })
    }
}

