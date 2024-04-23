package com.mun.Kauppalista
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity1 : AppCompatActivity() {

    val ruokalajit = mutableListOf<String>()
    val taytelista = listOf("e1","e2","e3","e4","e5","e6","e7","e8","e9","e10","e11","e12",
        "e13","e14","e15","e16","e17","e18","e19","e20","e21","e22","e23","e24","e25",
        "e26","e27","e28","e29","e30","e31","e32","e33","e34","e35","e36","e37","e38",
        "e39","e40","e41","e42","e43","e44","e45","e46","e47","e48","e49","e50","e51","e52","e53","e54",
    "e55","e56","e57","e58","e59","e60","e61","e62","e63","e64","e65","e66","e67","e68","e69","e70",
        "e71","e72","e73","e74","e75","e76","e77","e78","e79","e80","e81","e82","e83","e84","e85",
        "e86","e87","e88","e89","e90","e91","e92","e93","e94","e95","e96","e97","e98","e99","e100",
        "e101","e102","e103","e104","e105","e106","e107","e107","e108","e109","e110","e111","e112",
        "e113","e114","e115","e116","e117","e118","e119","e120","e121","e122","e123","e124","e125","e126",
        "e127","e128","e129","e130")

    val tofuwokki = listOf("porkkana", "paprika", "kesäkurpitsa", "marinoitu tofu", "riisinuudeli")
   //5
    val kikhernetikkamasala = listOf(
        "paprika",
        "sipuli",
        "valkosipuli",
        "chili",
        "korianteri",
        "kurkuma",
        "paprikamauste",
        "garam masala",
        "juustokumina",
        "curry",
        "tomaattimurska",
        "kikherne",
        "kaurakerma",
        "oliiviöljy",
        "riisi",
        "suola",
        "mustapippuri"
    )
    //17
    val palakpaneer = listOf(
        "maustamaton tofu",
        "pakastepinaatti",
        "inkivääri",
        "kaurakerma",
        "sipuli",
        "valkosipuli",
        "tomaattipyre",
        "garam masala",
        "korianteri",
        "juustokumina",
        "rypsiöljy",
        "riisi"
    )
    //12
    val linssicurry = listOf(
        "linssi",
        "kookosmaito",
        "tomaattimurska",
        "chili",
        "valkosipuli",
        "kasvisliemikuutio"
    )
    //6
    val nakkikastikejaperuna = listOf(
        "vegenakki", "kaurakerma", "sipuli", "margariini", "vehnäjauho",
        "kasvisliemikuutio", "mustapippuri", "savupaprika", "soijakastike", "peruna"
    )
    //10
    val mustapapupyörykätjapasta = listOf(
        "sipuli", "mustapapu", "oliiviöljy", "sipulijauhe",
        "valkosipulijauhe", "vehnäjauho", "pasta", "kaurakerma", "ravintohiivahiutale"
    )
    //9
    val vegepyttipannu = listOf(
        "peruna", "sipuli", "tofu", "tomaatti", "suola",
        "mustapippuri", "timjami", "paprikajauhe", "rypsiöljy"
    )
    //9
    val quesadillat = listOf(
        "kikherne",
        "oliiviöljy",
        "suola",
        "valkosipulijauhe",
        "paprikamauste",
        "oregano",
        "mustapippuri",
        "paprika",
        "chili",
        "vegejuusto",
        "tortillapohja",
        "avokado",
        "lime"
    )
    //13
    val tacot = listOf(
        "kevätsipuli",
        "valkosipuli",
        "saksanpähkinä",
        "juustokumina",
        "chilijauhe",
        "tölkkilinssi",
        "tomaattimurska",
        "tacopohja",
        "vegejuusto",
        "lime",
        "avokado",
        "babypinaatti"
    )
    //12
    val tortillat = listOf(
        "tomaatti",
        "kurkku",
        "salaatti",
        "paprika",
        "ananas",
        "marinoitu tofu",
        "ranskankerma",
        "taco salsa"
    )
    //8

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val button1: Button = findViewById(R.id.button1)
        var a = true
        button1.setOnClickListener {
            when {
                a == true -> {
                    button1.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(tofuwokki)
                    a = false
                }
                else -> {
                    button1.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(tofuwokki)
                    a = true
                }
            }
        }
        val button2: Button = findViewById(R.id.button2)
        var b = true
        button2.setOnClickListener {
            when {
                b == true -> {
                    button2.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(linssicurry)
                    b = false
                }
                else -> {
                    button2.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(linssicurry)
                    b = true
                }
            }
        }
        val button3: Button = findViewById(R.id.button3)
        var c = true
        button3.setOnClickListener {
            when {
                c == true -> {
                    button3.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(palakpaneer)
                    c = false
                }
                else -> {
                    button3.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(palakpaneer)
                    c = true
                }
            }
        }
        val button4: Button = findViewById(R.id.button4)
        var d = true
        button4.setOnClickListener {
            when {
                d == true -> {
                    button4.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(kikhernetikkamasala)
                    d = false
                }
                else -> {
                    button4.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(kikhernetikkamasala)
                    d = true
                }
            }
        }
        val button5: Button = findViewById(R.id.button5)
        var e = true
        button5.setOnClickListener {
            when {
                e == true -> {
                    button5.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(nakkikastikejaperuna)
                    e = false
                }
                else -> {
                    button5.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(nakkikastikejaperuna)
                    e = true
                }
            }
        }
        val button6: Button = findViewById(R.id.button6)
        var f = true
        button6.setOnClickListener {
            when {
                f == true -> {
                    button6.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(mustapapupyörykätjapasta)
                    f = false
                }
                else -> {
                    button6.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(mustapapupyörykätjapasta)
                    f = true
                }
            }
        }
        val button7: Button = findViewById(R.id.button7)
        var g = true
        button7.setOnClickListener {
            when {
                g == true -> {
                    button7.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(vegepyttipannu)
                    g = false
                }
                else -> {
                    button7.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(vegepyttipannu)
                    g = true
                }
            }
        }
        val button8: Button = findViewById(R.id.button8)
        var h = true
        button8.setOnClickListener {
            when {
                h == true -> {
                    button8.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(quesadillat)
                    h = false
                }
                else -> {
                    button8.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(quesadillat)
                    h = true
                }
            }
        }
        val button9: Button = findViewById(R.id.button9)
        var i = true
        button9.setOnClickListener {
            when {
                i == true -> {
                    button9.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(tacot)
                    i = false
                }
                else -> {
                    button9.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(tacot)
                    i = true
                }
            }
        }
        val button10: Button = findViewById(R.id.button10)
        var j = true
        button10.setOnClickListener {
            when {
                j == true -> {
                    button10.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.addAll(tortillat)
                    j = false
                }
                else -> {
                    button10.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.removeAll(tortillat)
                    j = true
                }
            }
        }
        val button11: Button = findViewById(R.id.button11)
        var k = true
        button11.setOnClickListener {
            when {
                k == true -> {
                    button11.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("kaurahiutale")
                    k = false
                }
                else -> {
                    button11.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("kaurahiutale")
                    k = true
                }
            }
        }
        val button12: Button = findViewById(R.id.button12)
            var l =true
        button12.setOnClickListener {
            when {
                l == true -> {
                    button12.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("smoothiehedelmät")
                    l = false
                }
                else -> {
                    button12.setBackgroundColor(Color.rgb(103,79,163))
                    ruokalajit.remove("smoothiehedelmät")
                    l = true
                }
            }
        }
        val button13: Button = findViewById(R.id.button13)
            var m = true
        button13.setOnClickListener {
            when {
                m == true -> {
                    button13.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("alpro")
                    m = false
                }
                else -> {
                    button13.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("alpro")
                    m = true
                }
            }
        }
        val button14: Button = findViewById(R.id.button14)
            var n = true
        button14.setOnClickListener {
            when {
                n == true -> {
                    button14.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("puolukka")
                    n = false
                }
                else -> {
                    button14.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("puolukka")
                    n = true
                }
            }
        }
        val button15: Button = findViewById(R.id.button15)
            var o = true
        button15.setOnClickListener {
            when {
                o == true -> {
                    button15.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("leipä")
                    o = false
                }
                else -> {
                    button15.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("leipä")
                    o = true
                }
            }
        }
        val button16: Button = findViewById(R.id.button16)
            var p = true
        button16.setOnClickListener {
            when {
                p == true -> {
                    button16.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("hummus")
                    p = false
                }
                else -> {
                    button16.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("hummus")
                    p = true
                }
            }
        }
        val button17: Button = findViewById(R.id.button17)
            var q = true
        button17.setOnClickListener {
            when {
                q == true -> {
                    button17.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("pähkinä")
                    q = false
                }
                else -> {
                    button17.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("pähkinä")
                    q = true
                }
            }
        }
        val button18: Button = findViewById(R.id.button18)
            var r = true
        button18.setOnClickListener {
            when {
                r == true -> {
                    button18.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("vessapaperi")
                    r = false
                }
                else -> {
                    button18.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("vessapaperi")
                    r = true
                }
            }
        }
        val button19: Button = findViewById(R.id.button19)
            var s = true
            button19.setOnClickListener {
                when {
                    s == true -> {
                        button19.setBackgroundColor(Color.rgb(224, 219, 238))
                        ruokalajit.add("pyykinpesuaine")
                        s = false
                    }
                    else -> {
                        button19.setBackgroundColor(Color.rgb(103, 79, 163))
                        ruokalajit.remove("pyykinpesuaine")
                        s = true
                    }
                }
            }
        val button20: Button = findViewById(R.id.button20)
        var t = true
        button20.setOnClickListener {
            //ruokalajit.add("shampoo")
            //Toast.makeText(this, "Shampoo valittu", Toast.LENGTH_SHORT).show()
            when {
                t == true -> {
                    button20.setBackgroundColor(Color.rgb(224, 219, 238))
                    ruokalajit.add("shampoo")
                    t = false
                }
                else -> {
                    button20.setBackgroundColor(Color.rgb(103, 79, 163))
                    ruokalajit.remove("shampoo")
                    t = true
                }
            }
        }

        //"Syötä" -nappi:
        val button21: Button = findViewById(R.id.button21)
        button21.setOnClickListener {
            val textbox1: EditText = findViewById(R.id.textbox1)
            val textbox12 = textbox1.text.toString()
            val textbox13 = textbox12.replaceFirstChar { it.lowercase() }
            ruokalajit.add(textbox13)
            Toast.makeText(this, "$textbox13 lisätty", Toast.LENGTH_SHORT).show()
        }

        //"Valmis" -nappi:

        val button22: Button = findViewById(R.id.button22)
        button22.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity7::class.java).also {
                var qe = 1
                for (value in ruokalajit) {
                    it.putExtra("e${qe++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 1

        val button23: Button = findViewById(R.id.button23)
        button23.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity2::class.java).also {
                var we = 1
                for (value in ruokalajit) {
                    it.putExtra("e${we++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 2

        val button24: Button = findViewById(R.id.button24)
        button24.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity3::class.java).also {
                var ee = 1
                for (value in ruokalajit) {
                    it.putExtra("e${ee++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 3

        val button25: Button = findViewById(R.id.button25)
        button25.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity4::class.java).also {
                var re = 1
                for (value in ruokalajit) {
                    it.putExtra("e${re++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 4

        val button26: Button = findViewById(R.id.button26)
        button26.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity5::class.java).also {
                var te = 1
                for (value in ruokalajit) {
                    it.putExtra("e${te++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 5

        val button27: Button = findViewById(R.id.button27)
        button27.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity6::class.java).also {
                var te = 1
                for (value in ruokalajit) {
                    it.putExtra("e${te++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 6

        val button28: Button = findViewById(R.id.button28)
        button28.setOnClickListener {
            ruokalajit.addAll(taytelista)
            Intent(this, MainActivity7::class.java).also {
                var te = 1
                for (value in ruokalajit) {
                    it.putExtra("e${te++}", value)
                }
                startActivity(it)
            }
        }
    }
}

