package com.example.myfirsttestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // окно букв
        val buttonAlfabet: Button = findViewById(R.id.button_alfabet)

        val intent_alfabet = Intent(this, Activity_Alfabet::class.java)

        buttonAlfabet.setOnClickListener{
            startActivity(intent_alfabet)
        }
        // окно чисел
        val buttonNumb: Button = findViewById(R.id.button_numb)

        val intent_numb = Intent(this, Activity_Numbers::class.java)

        buttonNumb.setOnClickListener{
            startActivity(intent_numb)
        }


    }
}