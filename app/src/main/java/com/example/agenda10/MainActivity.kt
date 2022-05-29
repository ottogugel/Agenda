package com.example.agenda10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda10.component.IOnClick
import com.example.agenda10.component.RecyclerViewAdapter
import com.example.agenda10.model.Contato

class MainActivity : AppCompatActivity(), IOnClick{

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter

    private var itensClicados = mutableListOf<Int>()
    private var totalClicks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view)

        val lcontatos = mutableListOf(
            Contato("Jonatas","12345","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
            Contato("Maria","67891","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"),
            Contato("João","01112","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
            Contato("Cesar","13141","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg")
        )

        recyclerView = findViewById(R.id.recycler_view)
        adapter = RecyclerViewAdapter(lcontatos, this)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter

    }

    override fun onClickElement(position: Int) {

        Toast.makeText(this, "Item ${position}", Toast.LENGTH_LONG).show() // ${} = interpolação

        if(!itensClicados.contains(position)) {
            itensClicados.add(position)
        }
        Log.d("ITEM", "Clicks: ${++totalClicks}: $itensClicados")
    }



}