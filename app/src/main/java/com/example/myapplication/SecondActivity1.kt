package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second1)

        val button = findViewById<Button>(R.id.send2)
        button.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}