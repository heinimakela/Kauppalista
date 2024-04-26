package com.mun.Kauppalista

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter6(private val context: Context,
               private val list: ArrayList<Model4>
) : RecyclerView.Adapter<Adapter6.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTV: TextView = view.findViewById(R.id.button)
        val button: Button = view.findViewById(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cell_view2, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.button.setBackgroundColor(Color.rgb(38, 39, 70))
        holder.titleTV.text = data.title
    }

    fun updateAll(arrayList: ArrayList<Model4>) {
        list.clear()
        list.addAll(arrayList)
        notifyDataSetChanged()
    }
}
