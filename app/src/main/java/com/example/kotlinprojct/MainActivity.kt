package com.example.kotlinprojct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttongame : Button;
    lateinit var exit : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        buttongame.setOnClickListener{
         startgame()
        }
        exit.setOnClickListener{
            exit()
        }
    }
    fun init(){
        supportActionBar?.hide()
        buttongame =findViewById(R.id.play)
        exit =findViewById(R.id.exit)
    }
    fun startgame(){
        val game = Intent(this,GameActivity::class.java)
        startActivity(game)
        finish()
    }
    fun exit(){
        finish()
    }
}