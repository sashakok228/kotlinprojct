package com.example.kotlinprojct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AuthActivity : AppCompatActivity() {
    lateinit var dal : Button
    lateinit var nazad : Button
    lateinit var nomer : EditText
    lateinit var password : EditText
    lateinit var nomerper : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        init()
        nazad.setOnClickListener{
            nazad()
        }
    }
    fun init(){
        dal=findViewById(R.id.dal_auth)
        nazad=findViewById(R.id.nazad_auth)
        nomer=findViewById(R.id.nomer_telefona)
        password=findViewById(R.id.pass_auth)
    }
    fun nazad(){
        val i= Intent(this,MainActivity::class.java)
        startActivity(i)
        finish()
    }
    fun dal_auth(){
        var buff : String
        buff=nomer.text.toString()
        var nomerper : Int=buff.toInt()
        buff=nomer.text.toString()
        var password : Int=buff.toInt()
        val i= Intent(this,MainActivity::class.java)
        startActivity(i)
        finish()
    }
}