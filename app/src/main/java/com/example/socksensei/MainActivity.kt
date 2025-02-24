package com.example.socksensei

import com.example.socksensei.R
import android.content.Intent
import android.media.MediaPlayer
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
            val rnds = (0..5).random() // Generate a new random number on each click

            val intent = when (rnds) {
                1 -> Intent(this, SleepyJoe::class.java)
                2 -> Intent(this, SadSam::class.java) // Handle case when rnds == 2
                3 -> Intent(this, ChillGuyChad::class.java) // Handle case when rnds == 3
                4 -> Intent(this, OpenMindedOrkes::class.java) // Handle case when rnds == 3
                5 -> Intent(this, WickedWarp::class.java) // Handle case when rnds == 3
                else -> Intent(this, HappyHailey::class.java) // Default case for rnds == 0
            }

            startActivity(intent)
            val music: MediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.music)
            music.start()


        }


        myTextView.typewriterEffect("What Has Been On Your Mind Recently?", 70L, this)
    }
}