package com.example.gamemojo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signup = findViewById<Button>(R.id.button)

        signup.setOnClickListener {
            val intent = Intent(this, Home_screen::class.java)
            startActivity(intent)
            finish()
        }
    }
}