package com.example.fruitsandvegetables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Actividad4 : AppCompatActivity() {
    val TAG="com.example.fruitsandvegetables.actividad4.CIUDAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad4)


        var frutas = ArrayList<frutas>()


        frutas.add(frutas("Cirhuela", R.drawable.fruta12))
        frutas.add(frutas("Mango", R.drawable.fruta1))
        frutas.add(frutas("Sandía", R.drawable.fruta5))
        frutas.add(frutas("Mamey", R.drawable.fruta7))


        var grid: GridView = findViewById(R.id.grid2)
        //val adaptador =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)

        val adaptador = AdaptadorCustom(this, frutas)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_SHORT).show()


        }
    }
}


