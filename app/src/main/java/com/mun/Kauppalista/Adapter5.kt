package com.mun.Kauppalista

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContentAdapter(
    private val context: Context,
    private val items: List<Model3>,
    private val listener: (Model3) -> Unit
) : RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentAdapter.ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.cell_view2, parent, false)
        return ContentAdapter.ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        //private val name = itemView.findViewById<TextView>(R.id.name)
        //private val image = itemView.findViewById<ImageView>(R.id.image)
        val titleTV: TextView = itemView.findViewById(R.id.button)
        val button: Button = itemView.findViewById(R.id.button)
        val vari= varimuunnos(kategoria)
        val kategoria = String()
        fun bind(item: Model3) {
            //name.text = item.name
            //image.loadUrl(item.imageUrl)
            titleTV.text = item.title
            button.setBackgroundColor(vari as Int)

            kategoria =item.category
        }
    }
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



