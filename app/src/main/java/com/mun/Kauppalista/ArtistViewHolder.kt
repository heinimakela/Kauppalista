package com.mun.Kauppalista

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ArtistViewHolder(
    view: View,
    onItemClicked: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {
    init {
        itemView.setOnClickListener {
            onItemClicked(adapterPosition)
        }
    }

    fun bind(model: Model3) {
        //bind data
    }
}