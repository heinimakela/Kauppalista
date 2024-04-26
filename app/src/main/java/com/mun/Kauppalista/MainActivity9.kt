package com.mun.Kauppalista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter5(this, otsikko)

        val otsikko = mutableListOf<String>()

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            val textbox1: EditText = findViewById(R.id.textbox1)
            val textbox12 = textbox1.text.toString()
            val textbox13 = textbox12.replaceFirstChar { it.lowercase() }
            otsikko.add(textbox13)
            Toast.makeText(this, "$textbox13 lisätty", Toast.LENGTH_SHORT).show()
        }
    }
}