package com.example.socksensei

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.socksensei.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


public class MainActivity : AppCompatActivity() {

    lateinit var button1: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button1 = findViewById(R.id.submitVentButton)
        val myTextView = findViewById<TextView>(R.id.questionText)
        // Apply the typewriter effect
         fun TextView.typewriterEffect(textView: TextView, text: String, intervalMs: Long) {
            textView.text = ""
            lifecycleScope.launch {
                text.forEach { char ->
                    delay(intervalMs)
                    textView.append(char.toString())
                }
            }


        }
        button1.setOnClickListener {
            val rnds = (0..2).random() // Generate a new random number on each click

            val intent = when (rnds) {
                1 -> Intent(this, SleepyJoe::class.java)
                2 -> Intent(this, SadSam::class.java) // Handle case when rnds == 2
                else -> Intent(this, HappyHailey::class.java) // Default case for rnds == 0
            }

            startActivity(intent)
        }


        myTextView.typewriterEffect("What Has Been On Your Mind Recently?", 70L, this)
    }
}