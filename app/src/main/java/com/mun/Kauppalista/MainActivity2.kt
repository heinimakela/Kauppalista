package com.mun.Kauppalista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val hevit = listOf("tomaatti","kurkku","avokado","lime","kesäkurpitsa","paprika","chili",
            "inkivääri","kevätsipuli","babypinaatti","salaatti","banaani","porkkana","sipuli",
            "valkosipuli","peruna","hedelmä","suolakurkku")
        val kylmat = listOf("vegenakki","vegejuusto","maustamaton tofu","marinoitu tofu","tofu",
            "alpro", "margariini","kaurakerma","ranskankerma","hummus")
        val kuivat = listOf("tölkkilinssi","kikherne","mustapapu",
            "tomaattimurska","tomaattipyre","kookosmaito","ananas","tacopohja","tortillapohja","tacosalsa","leipä",
            "oreo","keksi","hampurilaissämpylä","kaurahiutale","riisi","linssi",
            "riisinuudeli","pasta","rypsiöljy","oliiviöljy","vehnäjauho","majoneesi")
        val mausteet = listOf("chilijauhe","curry","garam masala","juustokumina","kasvisliemikuutio",
            "korianteri",
            "kurkuma","mustapippuri","oregano","savupaprika","sipulijauhe","soijakastike",
            "suola","timjami","paprikamauste",
            "valkosipulijauhe")
        val pakasteet = listOf("pakastepinaatti","smoothiesekoitus","puolukka","mustikka","kalapuikko",
            "kasvispihvi")
        val koodit = listOf("e1","e2","e3","e4","e5","e6","e7","e8","e9","e10","e11","e12",
            "e13","e14","e15","e16","e17","e18","e19","e20","e21","e22","e23","e24","e25",
            "e26","e27","e28","e29","e30","e31","e32","e33","e34","e35","e36","e37","e38",
            "e39","e40","e41","e42","e43","e44","e45","e46","e47","e48","e49","e50")

        val mausteet2 = mutableListOf<String>()
        val kuivat2 = mutableListOf<String>()
        val pakasteet2 = mutableListOf<String>()
        val hevit2 = mutableListOf<String>()
        val kylmat2 = mutableListOf<String>()
        val muut2 = mutableListOf<String>()
        val koodit2 = mutableListOf<String>()

        val ruokalajit = listOf("e1","e2","e3","e4","e5","e6","e7","e8","e9","e10","e11","e12","e13","e14","e15","e16","e17","e18","e19","e20","e21","e22","e23","e24","e25")

        for (value in ruokalajit){
            val a = intent.getStringExtra("$value")
            val aa = "$a"
            when {
                hevit.contains(aa) -> hevit2.add(aa)
                kylmat.contains(aa) -> kylmat2.add(aa)
                kuivat.contains(aa) -> kuivat2.add(aa)
                mausteet.contains(aa) -> mausteet2.add(aa)
                pakasteet.contains(aa) -> pakasteet2.add(aa)
                koodit.contains(aa) -> koodit2.add(aa)
                else -> muut2.add(aa)
            }
        }

        val arrayAdapter1: ArrayAdapter<*>
        val listview1: ListView = findViewById(R.id.lista1)
        arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, hevit2)
        listview1.adapter = arrayAdapter1

        val arrayAdapter2: ArrayAdapter<*>
        val listview2: ListView = findViewById(R.id.lista2)
        arrayAdapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_1, kylmat2)
        listview2.adapter = arrayAdapter2

        val arrayAdapter3: ArrayAdapter<*>
        val listview3: ListView = findViewById(R.id.lista3)
        arrayAdapter3 = ArrayAdapter(this, android.R.layout.simple_list_item_1, kuivat2)
        listview3.adapter = arrayAdapter3

        val arrayAdapter4: ArrayAdapter<*>
        val listview4: ListView = findViewById(R.id.lista4)
        arrayAdapter4 = ArrayAdapter(this, android.R.layout.simple_list_item_1, mausteet2)
        listview4.adapter = arrayAdapter4

        val arrayAdapter5: ArrayAdapter<*>
        val listview5: ListView = findViewById(R.id.lista5)
        arrayAdapter5 = ArrayAdapter(this, android.R.layout.simple_list_item_1, pakasteet2)
        listview5.adapter = arrayAdapter5

        val arrayAdapter6: ArrayAdapter<*>
        val listview6: ListView = findViewById(R.id.lista6)
        arrayAdapter6 = ArrayAdapter(this, android.R.layout.simple_list_item_1, muut2)
        listview6.adapter = arrayAdapter6
    }
}