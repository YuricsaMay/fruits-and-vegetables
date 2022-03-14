package com.example.fruitsandvegetables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Actividad3 : AppCompatActivity() {

    val TAG="com.example.fruitsandvegetables.actividad3.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)


        var frutas = ArrayList<frutas>()
        /* frutas.add("Manzana")
         frutas.add("Plátano")
         frutas.add("Sandía")
         frutas.add("Durazno")*/

        frutas.add(frutas("Papaya", R.drawable.fruta8))
        frutas.add(frutas("Guanabana", R.drawable.fruta18))
        frutas.add(frutas("Caimito o cayumito", R.drawable.fruta10))
        frutas.add(frutas("Anona", R.drawable.fruta6))



        var grid: GridView = findViewById(R.id.grid)
        //val adaptador =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)

        val adaptador = AdaptadorCustom(this, frutas)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_SHORT).show()


        }
    }
    }





