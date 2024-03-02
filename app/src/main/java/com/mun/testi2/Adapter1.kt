package com.mun.testi2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class Adapter1(private val context: Context,
               private val list: ArrayList<Model1>) : RecyclerView.Adapter<Adapter1.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val iconIV: ImageView = view.findViewById(R.id.iconIV)
        val subtitleTV: TextView = view.findViewById(R.id.subtitleTV)
        val titleTV: TextView = view.findViewById(R.id.titleTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cell_view1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.iconIV.setImageDrawable(ContextCompat.getDrawable(context, data.icon))
        holder.subtitleTV.text = data.subtitle
        holder.titleTV.text = data.title
    }
}

