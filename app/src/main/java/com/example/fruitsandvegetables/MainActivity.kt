package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtUsuario = findViewById<TextView>(R.id.txtUsername)
        val txtContraseña = findViewById<TextView>(R.id.txtPassword)
        val btningresar = findViewById<Button>(R.id.btningresar)


        btningresar.setOnClickListener {
            val usuario = txtUsuario.getText().toString()
            val pass: String = txtContraseña.getText().toString()
            if (usuario.equals("Maria") && pass.equals("May123")) {
                var intent = Intent(this, Actividad2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "El usuario o contraseña son incorrectos intenlo de nuevo",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}


