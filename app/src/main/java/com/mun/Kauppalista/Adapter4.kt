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
        val vari= varimuunnos(kategoria)
        holder.button.setBackgroundColor(vari as Int)

        holder.titleTV.text = data.title

        val vari2= varimuunnos2(kategoria)

        var click = true
        holder.button.setOnClickListener {
            when {
                click == true -> {
                    holder.button.setBackgroundColor(vari2 as Int)
                    click = false
                }

                else -> {
                    holder.button.setBackgroundColor(vari)
                    click = true
                }
            }
        }
        holder.setIsRecyclable(false)


    }

    private fun varimuunnos(kategoria: String): Any {
        return when (kategoria) {
            "hevi" -> Color.rgb(50, 205, 50)
            "kylmä" -> Color.rgb(100, 149, 237)
            "pakaste" -> Color.rgb(0,190,190)
            "kuiva" -> Color.rgb(225,36,233)
            "muu" -> Color.rgb(135,70,255)
            "mauste" -> Color.rgb(218, 165, 32)
            else -> "nothing"
        }
    }

    private fun varimuunnos2(kategoria: String): Any {
        return when (kategoria) {
            "hevi" -> Color.rgb(216,245,216)
            "kylmä" -> Color.rgb(219,231,251)
            "pakaste" -> Color.rgb(230,255,225)
            "kuiva" -> Color.rgb(251,226,252)
            "muu" -> Color.rgb(233,221,255)
            "mauste" -> Color.rgb(249,238,210)
            else -> "nothing"
        }
    }
}



