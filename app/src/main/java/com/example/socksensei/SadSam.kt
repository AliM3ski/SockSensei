package com.example.socksensei

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SadSam : AppCompatActivity() {

    lateinit var buttonSamExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sad_sam) // Correct layout file

        // Remove incorrect binding inflation
        // binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(binding.root) // This was causing the issue

        buttonSamExit = findViewById(R.id.resetButton)

        buttonSamExit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}