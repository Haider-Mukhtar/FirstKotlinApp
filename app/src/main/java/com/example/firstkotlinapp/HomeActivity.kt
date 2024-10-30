package com.example.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //=========================================================================================
        //my code - start

        val linearPageButton: Button = findViewById(R.id.linear_btn)
        linearPageButton.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        val relativePageButton: Button = findViewById(R.id.relative_btn)
        relativePageButton.setOnClickListener {
            val intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        val uiComponentsButton: Button = findViewById(R.id.ui_btn)
        uiComponentsButton.setOnClickListener {
            val intent = Intent(this, UiComponentsActivity::class.java)
            startActivity(intent)
        }

        val gridButton: Button = findViewById(R.id.grid_btn)
        gridButton.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }

        val formButton: Button = findViewById(R.id.form_btn)
        formButton.setOnClickListener {
            val intent = Intent(this, BasicForm::class.java)
            startActivity(intent)
        }


        //myy code - end
        //=========================================================================================

    }
}