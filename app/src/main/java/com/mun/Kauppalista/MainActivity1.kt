package com.mun.Kauppalista
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 : AppCompatActivity() {

    val ruokalajit = mutableListOf<String>()
    val tofuwokki = listOf("porkkana", "paprika", "kesäkurpitsa", "marinoitu tofu", "riisinuudeli")
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
    val linssicurry = listOf(
        "linssi",
        "kookosmaito",
        "tomaattimurska",
        "chili",
        "valkosipuli",
        "kasvisliemikuutio"
    )
    val nakkikastikejaperuna = listOf(
        "vegenakki", "kaurakerma", "sipuli", "margariini", "vehnäjauho",
        "kasvisliemikuutio", "mustapippuri", "savupaprika", "soijakastike", "peruna"
    )

    val mustapapupyörykätjapasta = listOf(
        "sipuli", "mustapapu", "oliiviöljy", "sipulijauhe",
        "valkosipulijauhe", "vehnäjauho", "pasta", "kaurakerma", "ravintohiivahiutale"
    )

    val vegepyttipannu = listOf(
        "peruna", "sipuli", "tofu", "tomaatti", "suola",
        "mustapippuri", "timjami", "paprikajauhe", "rypsiöljy"
    )

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

    val smoothie = listOf("alpro", "smoothiesekoitus", "puolukka")
    val kaurahiutale = listOf("kaurahiutale")
    val leipa = listOf("leipä")
    val pahkina = listOf("pähkinä")
    val vessapaperi = listOf("vessapaperi")
    val pyykinpesuaine = listOf("pyykinpesuaine")
    val shampoo = listOf("shampoo")
    val smoothiehedelmät = listOf("smoothiehedelmät")
    val alpro = listOf("alpro")
    val puolukka = listOf("puolukka")
    val hummus = listOf("hummus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            ruokalajit.addAll(tofuwokki)
            Toast.makeText(this, "Tofuwokki valittu", Toast.LENGTH_SHORT).show()
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            ruokalajit.addAll(linssicurry)
            Toast.makeText(this, "Linssicurry valittu", Toast.LENGTH_SHORT).show()
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            ruokalajit.addAll(palakpaneer)
            Toast.makeText(this, "Palak paneer valittu", Toast.LENGTH_SHORT).show()
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            ruokalajit.addAll(kikhernetikkamasala)
            Toast.makeText(this, "Kikherne tikka masala valittu", Toast.LENGTH_SHORT).show()
        }
        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            ruokalajit.addAll(nakkikastikejaperuna)
            Toast.makeText(this, "Nakkikastike ja peruna valittu", Toast.LENGTH_SHORT).show()
        }
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            ruokalajit.addAll(mustapapupyörykätjapasta)
            Toast.makeText(this, "Mustapapupyörykät ja pasta valittu", Toast.LENGTH_SHORT).show()
        }
        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            ruokalajit.addAll(vegepyttipannu)
            Toast.makeText(this, "Vegepyttipannu valittu", Toast.LENGTH_SHORT).show()
        }
        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            ruokalajit.addAll(quesadillat)
            Toast.makeText(this, "Quesadillat valittu", Toast.LENGTH_SHORT).show()
        }
        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            ruokalajit.addAll(tacot)
            Toast.makeText(this, "Linssitacot valittu", Toast.LENGTH_SHORT).show()
        }
        val button10: Button = findViewById(R.id.button10)
        button10.setOnClickListener {
            ruokalajit.addAll(tortillat)
            Toast.makeText(this, "Tofutortillat valittu", Toast.LENGTH_SHORT).show()
        }
        val button11: Button = findViewById(R.id.button11)
        button11.setOnClickListener {
            ruokalajit.addAll(kaurahiutale)
            Toast.makeText(this, "Kaurahiutale valittu", Toast.LENGTH_SHORT).show()
        }
        val button12: Button = findViewById(R.id.button12)
        button12.setOnClickListener {
            ruokalajit.addAll(smoothiehedelmät)
            Toast.makeText(this, "Smoothiehedelmät valittu", Toast.LENGTH_SHORT).show()
        }
        val button13: Button = findViewById(R.id.button13)
        button13.setOnClickListener {
            ruokalajit.addAll(alpro)
            Toast.makeText(this, "Alpro valittu", Toast.LENGTH_SHORT).show()
        }
        val button14: Button = findViewById(R.id.button14)
        button14.setOnClickListener {
            ruokalajit.addAll(puolukka)
            Toast.makeText(this, "Puolukkka valittu", Toast.LENGTH_SHORT).show()
        }
        val button15: Button = findViewById(R.id.button15)
        button15.setOnClickListener {
            ruokalajit.addAll(leipa)
            Toast.makeText(this, "Leipä valittu", Toast.LENGTH_SHORT).show()
        }
        val button16: Button = findViewById(R.id.button16)
        button16.setOnClickListener {
            ruokalajit.addAll(hummus)
            Toast.makeText(this, "Hummus valittu", Toast.LENGTH_SHORT).show()
        }
        val button17: Button = findViewById(R.id.button17)
        button17.setOnClickListener {
            ruokalajit.addAll(pahkina)
            Toast.makeText(this, "Pähkinä valittu", Toast.LENGTH_SHORT).show()
        }
        val button18: Button = findViewById(R.id.button18)
        button18.setOnClickListener {
            ruokalajit.addAll(vessapaperi)
            Toast.makeText(this, "Vessapaperi valittu", Toast.LENGTH_SHORT).show()
        }

        val button19: Button = findViewById(R.id.button19)
        button19.setOnClickListener {
            ruokalajit.addAll(pyykinpesuaine)
            Toast.makeText(this, "Pyykinpesuaine valittu", Toast.LENGTH_SHORT).show()
        }
        val button20: Button = findViewById(R.id.button20)
        button20.setOnClickListener {
            ruokalajit.addAll(shampoo)
            Toast.makeText(this, "Shampoo valittu", Toast.LENGTH_SHORT).show()
        }

        //"Syötä" -nappi:

        val button21: Button = findViewById(R.id.button21)
        button21.setOnClickListener {
            val textbox1: EditText = findViewById(R.id.textbox1)
            val textbox12 = textbox1.text.toString()
            ruokalajit.add(textbox12)
            Toast.makeText(this, "$textbox12 lisätty", Toast.LENGTH_SHORT).show()
        }

        //"Valmis" -nappi:

        val button22: Button = findViewById(R.id.button22)
        button22.setOnClickListener {
            Intent(this, MainActivity5::class.java).also {
                var t = 1
                for (value in ruokalajit) {
                    it.putExtra("e${t++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 1

        val button23: Button = findViewById(R.id.button23)
        button23.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                var j = 1
                for (value in ruokalajit) {
                    it.putExtra("e${j++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 2

        val button24: Button = findViewById(R.id.button24)
        button24.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                var t = 1
                for (value in ruokalajit) {
                    it.putExtra("e${t++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 3

        val button25: Button = findViewById(R.id.button25)
        button25.setOnClickListener {
            Intent(this, MainActivity4::class.java).also {
                var t = 1
                for (value in ruokalajit) {
                    it.putExtra("e${t++}", value)
                }
                startActivity(it)
            }
        }

        //Testi 4

        val button26: Button = findViewById(R.id.button26)
        button26.setOnClickListener {
            Intent(this, MainActivity5::class.java).also {
                var t = 1
                for (value in ruokalajit) {
                    it.putExtra("e${t++}", value)
                }
                startActivity(it)
            }
        }
    }
}