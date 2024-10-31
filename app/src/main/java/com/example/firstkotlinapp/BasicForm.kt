package com.example.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BasicForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_form)

        //=========================================================================================
        //my code - start

        val sendButton: Button = findViewById(R.id.send_form)
        val clearButton: Button = findViewById(R.id.clear_form)
        val shareButton: Button = findViewById(R.id.share_form)

        sendButton.setOnClickListener {
            val nameInput: EditText = findViewById(R.id.name_input)
            val emailInput: EditText = findViewById(R.id.email_input)
            val messageInput: EditText = findViewById(R.id.message_input)

            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val message = messageInput.text.toString()

            Toast.makeText(this, "Form Data Send Successfully", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, GetFormData::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("message", message)
            startActivity(intent)

        }

        clearButton.setOnClickListener {
            val nameInput: EditText = findViewById(R.id.name_input)
            val emailInput: EditText = findViewById(R.id.email_input)
            val messageInput: EditText = findViewById(R.id.message_input)

            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val message = messageInput.text.toString()

            nameInput.setText("")
            emailInput.setText("")
            messageInput.setText("")
            Toast.makeText(this, "Form Data Cleared Successfully", Toast.LENGTH_SHORT).show()
        }

        shareButton.setOnClickListener {
            val nameInput: EditText = findViewById(R.id.name_input)
            val emailInput: EditText = findViewById(R.id.email_input)
            val messageInput: EditText = findViewById(R.id.message_input)

            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val message = messageInput.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            val shareBody = "Name: $name\nEmail: $email\nMessage: $message"
            intent.putExtra(Intent.EXTRA_TEXT, shareBody)
//            intent.putExtra(Intent.EXTRA_TEXT, email)
//            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share To:"))
        }

        //my code - end
        //=========================================================================================

    }
}