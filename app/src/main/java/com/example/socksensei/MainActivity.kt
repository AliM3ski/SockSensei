package com.example.socksensei

import android.os.Bundle
import android.view.Window
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.socksensei.databinding.ActivityMainBinding
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import androidx.lifecycle.lifecycleScope;
import kotlinx.coroutines.delay;
import kotlinx.coroutines.launch;


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
            val intent = Intent(this, SockDisplay::class.java)
            startActivity(intent)
        }
        myTextView.typewriterEffect("What Has Been On Your Mind Recently?", 80L, this)
    }
}