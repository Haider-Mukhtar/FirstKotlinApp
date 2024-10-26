package com.example.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //=========================================================================================
        //my code - start

        val helloButton: Button = findViewById(R.id.hello_btn)
        helloButton.setOnClickListener {
            Toast.makeText(this, "Hello, Welcome to First Kotlin App", Toast.LENGTH_SHORT).show()
        }

        val goButton: Button = findViewById(R.id.go_btn)
        goButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        //myy code - end
        //=========================================================================================

    }
}