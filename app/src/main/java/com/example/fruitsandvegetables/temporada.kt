package com.example.fruitsandvegetables

import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class temporada : AppCompatActivity() {

        val TAG="com.example.fruitsandvegetables.temporada.CIUDAD"

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_temporada)


            var frutas = ArrayList<frutas>()


            frutas.add(frutas("Naranja", R.drawable.fruta13))
            frutas.add(frutas("Limón", R.drawable.fruta11))
            frutas.add(frutas("Naranja agria", R.drawable.fruta4))
            frutas.add(frutas("Mandarina", R.drawable.fruta16))


            var grid: GridView = findViewById(R.id.temp)
            //val adaptador =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)

            val adaptador = AdaptadorCustom(this, frutas)
            grid.adapter = adaptador
            grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_SHORT).show()


            }
        }

}