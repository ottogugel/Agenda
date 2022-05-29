package com.example.agenda10.component

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda10.MainActivity
import com.example.agenda10.R
import com.example.agenda10.model.Contato
import com.squareup.picasso.Picasso

class RecyclerViewAdapter(
    private var lcontatos: List<Contato>,
    private val contatoView: MainActivity

): RecyclerView.Adapter<ContatoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.element_view, parent, false)
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        Picasso.get()
            .load(lcontatos[position].imagemUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .into((holder.imagem))

        holder.nome.text = lcontatos[position].nome
        holder.matricula.text = lcontatos[position].matricula

        holder.card.setOnClickListener {
            (contatoView as IOnClick).onClickElement(position)
        }
    }

    override fun getItemCount(): Int {
        return lcontatos.size
    }
}