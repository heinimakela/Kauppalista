package com.mun.testi2

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter3(private val context: Context,
               private val list: ArrayList<Model2>) : RecyclerView.Adapter<Adapter3.ViewHolder>() {

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
        var click = true
        val data = list[position]
        holder.titleTV.text = data.title
        holder.button.setOnClickListener{
            when {
                click == true -> {
                    holder.button.setBackgroundColor(Color.rgb(185, 140, 244))
                    click = false
                }

                else -> {
                    holder.button.setBackgroundColor(Color.rgb(88, 17, 185))
                    click = true
                }
            }
        }
    }
}