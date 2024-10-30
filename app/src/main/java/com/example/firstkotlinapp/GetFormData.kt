package com.example.firstkotlinapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetFormData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_form_data)


        //=========================================================================================
        //my code - start

        val bundle: Bundle? = intent.extras
        val name = bundle!!.getString("name")
        val email = bundle.getString("email")
        val message = bundle.getString("message")

        val textView101: TextView = findViewById(R.id.textView101)
        val textView102: TextView = findViewById(R.id.textView102)
        val textView103: TextView = findViewById(R.id.textView103)

        textView101.text = name
        textView102.text = email
        textView103.text = message



        //my code - end
        //=========================================================================================

    }
}