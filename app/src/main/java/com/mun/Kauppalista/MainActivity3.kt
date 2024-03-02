package com.mun.Kauppalista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter1(this, fetchList())
    }
    private fun fetchList(): ArrayList<Model1> {

        val hevit = listOf("tomaatti","kurkku","avokado","lime","kesäkurpitsa","paprika","chili",
            "inkivääri","kevätsipuli","babypinaatti","salaatti","banaani","porkkana","sipuli",
            "valkosipuli","peruna","hedelmä")
        val kylmat = listOf("vegenakki","vegejuusto","maustamaton tofu","marinoitu tofu","tofu",
            "alpro",
            "margariini","kaurakerma","ranskankerma")
        val kuivat0 = listOf("leipä")
        val kuivat1 = listOf("tacopohja","tortillapohja","tacosalsa")
        val kuivat2 = listOf("tölkkilinssi","kikherne","mustapapu",
            "tomaattimurska","tomaattipyre","kookosmaito","ananas")
        val kuivat3 = listOf("kaurahiutale","riisi","linssi",
            "riisinuudeli","pasta","rypsiöljy","oliiviöljy","vehnäjauho")
        val mausteet = listOf("chilijauhe","curry","garam masala","juustokumina","kasvisliemikuutio","korianteri",
            "kurkuma","mustapippuri","oregano","savupaprika","sipulijauhe","soijakastike",
            "suola","timjami","paprikamauste",
            "valkosipulijauhe")
        val pakasteet = listOf("pakastepinaatti","smoothiesekoitus","puolukka","mustikka")

        val mausteet2 = mutableListOf<String>()
        val kuivat02 = mutableListOf<String>()
        val kuivat12 = mutableListOf<String>()
        val kuivat22 = mutableListOf<String>()
        val kuivat32 = mutableListOf<String>()
        val pakasteet2 = mutableListOf<String>()
        val hevit2 = mutableListOf<String>()
        val kylmat2 = mutableListOf<String>()

        val muut2 = mutableListOf<String>()

        val ruokalajit = mutableListOf("e1","e2","e3","e4","e5","e6","e7","e8","e9","e10","e11","e12",
            "e13","e14","e15","e16","e17","e18","e19","e20","e21","e22","e23","e24","e25",
            "e26","e27","e28","e29","e30","e31","e32","e33","e34","e35","e36","e37","e38",
            "e39","e40","e41","e42","e43","e44","e45","e46","e47","e48","e49","e50")
        var s = 1
        for (value in ruokalajit){
            val a = intent.getStringExtra("e${s++}")
            val aa = "$a"

            when {
                hevit.contains(aa) -> hevit2.add(aa)
                kuivat0.contains(aa) -> kuivat02.add(aa)
                kylmat.contains(aa) -> kylmat2.add(aa)
                kuivat1.contains(aa) -> kuivat12.add(aa)
                kuivat2.contains(aa) -> kuivat22.add(aa)
                kuivat3.contains(aa) -> kuivat32.add(aa)
                mausteet.contains(aa) -> mausteet2.add(aa)
                pakasteet.contains(aa) -> pakasteet2.add(aa)
                else -> muut2.add(aa)
            }
        }

        val muut3 = mutableListOf<String>()
        val muut4 = mutableListOf<String>()
        for (i in muut2) {
            val numero = i.take(2)
            val numerot = listOf("e1","e2","e3","e4","e5","e6","e7","e8","e9")
            when {
                numerot.contains(numero) -> muut3.add(i)
                else -> muut4.add(i)
            }
        }

        val aineet = hevit2 + kuivat02 + kylmat2  + kuivat12 + kuivat22 +
                kuivat32 + mausteet2 + pakasteet2 + muut4

        val aineet2 = mutableMapOf<String, String>()
        for (aa in aineet){
            when {
                hevit.contains(aa) -> aineet2.put(aa,"hevi")
                kuivat0.contains (aa) -> aineet2.put(aa,"kuiva")
                kylmat.contains(aa) -> aineet2.put(aa,"kylmä")
                kuivat1.contains (aa) -> aineet2.put(aa,"kuiva")
                kuivat2.contains (aa) -> aineet2.put(aa,"kuiva")
                kuivat3.contains (aa) -> aineet2.put(aa,"kuiva")
                mausteet.contains(aa) -> aineet2.put(aa,"mauste")
                pakasteet.contains(aa) -> aineet2.put(aa,"pakaste")
                else -> aineet2.put(aa,"muu")
            }
        }

        val list = arrayListOf<Model1>()

        for ((k,v) in aineet2) {
            val model = Model1(
                com.google.android.material.R.drawable.abc_btn_check_material,
                "$k",
                "$v"
            )
            list.add(model)
        }
        return list
    }
}