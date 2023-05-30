package com.example.kotlinprojct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameActivity : AppCompatActivity() {
    lateinit var butyes : Button
    lateinit var butno : Button
    lateinit var ivent : TextView
    lateinit var stat1 : TextView
    lateinit var stat2 : TextView
    lateinit var stat3 : TextView
    lateinit var stat4 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        init()
    }
    fun init(){
        butyes=findViewById(R.id.yes)
        butno=findViewById(R.id.no)
        ivent=findViewById(R.id.text_ivent)
        stat1=findViewById(R.id.stat_1)
        stat2=findViewById(R.id.stat_2)
        stat3=findViewById(R.id.stat_3)
        stat4=findViewById(R.id.stat_4)
        stat1.text="50"
        stat2.text="50"
        stat3.text="50"
        stat4.text="50"
    }
}