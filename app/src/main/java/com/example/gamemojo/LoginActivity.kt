package com.example.gamemojo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signin = findViewById<Button>(R.id.button)

        signin.setOnClickListener {
            val intent = Intent(this, Home_screen::class.java)
            startActivity(intent)
            finish()
        }

        val createAcc = findViewById<Button>(R.id.button2)

        createAcc.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}