package com.example.helloandroidui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views
        val btnClick = findViewById<Button>(R.id.btnClick)
        val etName = findViewById<EditText>(R.id.etName)
        val btnNext = findViewById<Button>(R.id.btnNext)

        // Button click - Personalized Toast
        btnClick.setOnClickListener {
            val name = etName.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Hello $name!", Toast.LENGTH_SHORT).show()
            }
        }

        // Navigate to SecondActivity
        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
