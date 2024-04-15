package com.mun.Kauppalista

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter5(
    private val onItemClicked: (Model3) -> Unit
) : RecyclerView.Adapter<ArtistViewHolder>() {

    var data: List<Model3> = ArrayList(0)
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): ArtistViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.cell_view2, parent, false)
        return ArtistViewHolder(viewHolder) {
            onItemClicked(data[it])
        }
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(viewHolder: ArtistViewHolder, position: Int) {
        viewHolder.bind(data[position])
    }
}

