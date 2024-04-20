package com.example.gamemojo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val logoutbtn = findViewById<Button>(R.id.button3)

        logoutbtn.setOnClickListener {
            Toast.makeText(this, "You'll log out shortly", Toast.LENGTH_SHORT).show()
        }

        val navHomeBtn = findViewById<ImageView>(R.id.imageView66)
        navHomeBtn.setOnClickListener { onHomeViewClick(navHomeBtn) }

        val navStudiosBtn = findViewById<ImageView>(R.id.imageView7)
        navStudiosBtn.setOnClickListener { onStudioViewClick(navStudiosBtn) }

        val backBtn = findViewById<ImageView>(R.id.imageViewBack2)
        backBtn.setOnClickListener {
            onBackPressed()
        }
    }

    private fun onHomeViewClick(view: ImageView) {
        val intent = Intent(this, Home_screen::class.java)
        startActivity(intent)
        finish()
    }

    private fun onStudioViewClick(view: ImageView) {
        val intent = Intent(this, StudiosActivity::class.java)
        startActivity(intent)
    }
}