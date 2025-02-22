package com.example.socksensei

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SockDisplay : AppCompatActivity() {

    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sleepy_joe) // Correct layout file

        // Remove incorrect binding inflation
        // binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(binding.root) // This was causing the issue

        button2 = findViewById(R.id.resetButton)

        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}