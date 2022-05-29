package com.example.agenda10.component

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda10.R
import de.hdodenhof.circleimageview.CircleImageView

class ContatoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var imagem: CircleImageView = itemView.findViewById(R.id.item_imagem)
    var nome: TextView = itemView.findViewById(R.id.item_nome)
    var matricula: TextView = itemView.findViewById(R.id.item_matricula)
    var card: CardView = itemView.findViewById(R.id.item_card)
}