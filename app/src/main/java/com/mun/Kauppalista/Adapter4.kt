package com.mun.Kauppalista

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class Adapter4(private val context: Context,
               private val list: ArrayList<Model3>) : RecyclerView.Adapter<Adapter4.ViewHolder>() {

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

        val kategoria = data.category
        val vari = varimuunnos(kategoria)
        holder.button.setBackgroundColor(vari as Int)

        holder.titleTV.text = data.title
        var click = true
        holder.button.setOnClickListener {
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

    private fun varimuunnos(kategoria: String): Any {
        return when (kategoria) {
            "hevi" -> Color.rgb(50, 205, 50)
            "kylmä" -> Color.rgb(100, 149, 237)
            "pakaste" -> Color.rgb(0, 139, 139)
            "kuiva" -> Color.rgb(0, 139, 139)
            "muu" -> Color.rgb(255, 105, 180)
            "mauste" -> Color.rgb(218, 165, 32)
            else -> "nothing"
        }
    }
}



