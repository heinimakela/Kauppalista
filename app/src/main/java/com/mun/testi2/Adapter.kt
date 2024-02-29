package com.mun.testi2

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context5: Context,
               private val list5: ArrayList<Model3>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTV600: TextView = view.findViewById(R.id.button2000)
        val button60000: Button = view.findViewById(R.id.button2000)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context5).inflate(R.layout.cell_view3, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list5.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var click = true
        val data = list5[position]
        holder.titleTV6000.text = data.title
        holder.button60000.setOnClickListener(View.OnClickListener {
            when {
                click == true -> {
                    holder.button60000.setBackgroundColor(Color.rgb(185, 140, 244))
                    click = false
                }

                else -> {
                    holder.button60000.setBackgroundColor(Color.rgb(88, 17, 185))
                    click = true
                }
            }
        })
    }
}
//var click = true
//import android.graphics.Color
//when {
//    click == true -> {
//        holder.button1.setBackgroundColor(Color.rgb(185, 140, 244))
//        click = false
//    }

//    else -> {
//        holder.button1.setBackgroundColor(Color.rgb(88, 17, 185))
//        click = true
//    }
//}

