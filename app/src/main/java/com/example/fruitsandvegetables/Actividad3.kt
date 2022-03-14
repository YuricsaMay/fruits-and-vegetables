package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Actividad3 : AppCompatActivity() {

    val TAG = "com.example.fruitsandvegetables.actividad3.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)
        val be = findViewById<Button>(R.id.info3)
        be.setOnClickListener {
            var intent = Intent(this,Actividad4::class.java)
            startActivity(intent)

            val bm = findViewById<Button>(R.id.info4)
            bm.setOnClickListener {
                var intent = Intent(this,Guanabana::class.java)
                startActivity(intent)

                val bb = findViewById<Button>(R.id.info2)
                bb.setOnClickListener {
                    var intent = Intent(this, Anona::class.java)
                    startActivity(intent)
                    val bt = findViewById<Button>(R.id.info)

                    bt.setOnClickListener {
                        var intent = Intent(this, Caimito::class.java)
                        startActivity(intent)
                    }

                }
            }
        }
    }
}




