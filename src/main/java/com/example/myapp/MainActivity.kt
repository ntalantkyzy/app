package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var firstName:EditText
    lateinit var lastName: EditText
    lateinit var nextBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstName = findViewById(R.id.firstName)
        lastName = findViewById(R.id.lastName)
        nextBtn = findViewById(R.id.nextBtn)

        nextBtn.setOnClickListener {
            val firstName = firstName.text.toString()
            val lastName = lastName.text.toString()
            val intent = Intent(this,MainActivity2 ::class.java)
            startActivity(intent)

        }
    }
}