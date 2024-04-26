package com.mun.Kauppalista

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val button1: Button = findViewById(R.id.button1)
        var a = true
        button1.setOnClickListener {
            when {
                a == true -> {
                    button1.setBackgroundColor(Color.rgb(224, 219, 238))
                    //ruokalajit.addAll(tofuwokki)
                    a = false
                }
                else -> {
                    button1.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(tofuwokki)
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
                    //ruokalajit.addAll(linssicurry)
                    b = false
                }
                else -> {
                    button2.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(linssicurry)
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
                    //ruokalajit.addAll(palakpaneer)
                    c = false
                }
                else -> {
                    button3.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(palakpaneer)
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
                    //ruokalajit.addAll(kikhernetikkamasala)
                    d = false
                }
                else -> {
                    button4.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(kikhernetikkamasala)
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
                    //ruokalajit.addAll(nakkikastikejaperuna)
                    e = false
                }
                else -> {
                    button5.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(nakkikastikejaperuna)
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
                    //ruokalajit.addAll(mustapapupyörykätjapasta)
                    f = false
                }
                else -> {
                    button6.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(mustapapupyörykätjapasta)
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
                    //ruokalajit.addAll(vegepyttipannu)
                    g = false
                }
                else -> {
                    button7.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(vegepyttipannu)
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
                    //ruokalajit.addAll(quesadillat)
                    h = false
                }
                else -> {
                    button8.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(quesadillat)
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
                    //ruokalajit.addAll(tacot)
                    i = false
                }
                else -> {
                    button9.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(tacot)
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
                    //ruokalajit.addAll(tortillat)
                    j = false
                }
                else -> {
                    button10.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.removeAll(tortillat)
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
                    //ruokalajit.add("kaurahiutale")
                    k = false
                }
                else -> {
                    button11.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("kaurahiutale")
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
                    //ruokalajit.add("smoothiehedelmät")
                    l = false
                }
                else -> {
                    button12.setBackgroundColor(Color.rgb(103,79,163))
                    //ruokalajit.remove("smoothiehedelmät")
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
                    //ruokalajit.add("alpro")
                    m = false
                }
                else -> {
                    button13.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("alpro")
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
                    //ruokalajit.add("puolukka")
                    n = false
                }
                else -> {
                    button14.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("puolukka")
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
                    //ruokalajit.add("leipä")
                    o = false
                }
                else -> {
                    button15.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("leipä")
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
                    //ruokalajit.add("hummus")
                    p = false
                }
                else -> {
                    button16.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("hummus")
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
                    //ruokalajit.add("pähkinä")
                    q = false
                }
                else -> {
                    button17.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("pähkinä")
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
                    //ruokalajit.add("vessapaperi")
                    r = false
                }
                else -> {
                    button18.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("vessapaperi")
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
                    //ruokalajit.add("pyykinpesuaine")
                    s = false
                }
                else -> {
                    button19.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("pyykinpesuaine")
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
                    //ruokalajit.add("shampoo")
                    t = false
                }
                else -> {
                    button20.setBackgroundColor(Color.rgb(103, 79, 163))
                    //ruokalajit.remove("shampoo")
                    t = true
                }
            }
        }

        //"Valmis" -nappi:

        //val button22: Button = findViewById(R.id.button22)
        //button22.setOnClickListener {
            //ruokalajit.addAll(taytelista)
            //Intent(this, MainActivity7::class.java).also {
                //var qe = 1
                //for (value in ruokalajit) {
                    //it.putExtra("e${qe++}", value)
                //}
                //startActivity(it)
    }
}