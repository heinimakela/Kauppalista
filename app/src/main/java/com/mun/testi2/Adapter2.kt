package com.mun.testi2

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter2(private val context: Context,
               private val list: ArrayList<Model>) : RecyclerView.Adapter<Adapter2.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTV: TextView = view.findViewById(R.id.button)
        val button1: Button = view.findViewById(R.id.button)
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
        holder.button1.setOnClickListener(View.OnClickListener {
            when {
                click == true -> {
                    holder.button1.setBackgroundColor(Color.rgb(185, 140, 244))
                    click = false
                }

                else -> {
                    holder.button1.setBackgroundColor(Color.rgb(88, 17, 185))
                    click = true
                }
            }
        })
    }
}


//(list.size != 0)
//list.removeAt(position)
//notifyItemRemoved(position)
//notifyItemRangeChanged(position, list.size)