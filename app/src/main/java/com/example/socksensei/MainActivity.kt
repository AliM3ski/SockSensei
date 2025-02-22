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
import android.content.Intent


public class MainActivity : AppCompatActivity() {

    lateinit var button1: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button1=findViewById(R.id.submitVentButton)

        button1.setOnClickListener {
            val intent = Intent(this, SockDisplay::class.java)
            startActivity(intent)
        }



    }
}