package com.example.gamemojo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class StudiosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_studios)

        val navHomeBtn = findViewById<ImageView>(R.id.imageView6)
        navHomeBtn.setOnClickListener { onHomeViewClick(navHomeBtn) }

        val navProfileBtn = findViewById<ImageView>(R.id.imageView8)
        navProfileBtn.setOnClickListener { onProfileViewClick(navProfileBtn) }

        val backBtn = findViewById<ImageView>(R.id.imageViewBack)
        backBtn.setOnClickListener {
            onBackPressed()
        }
    }

    private fun onHomeViewClick(view: ImageView) {
        val intent = Intent(this, Home_screen::class.java)
        startActivity(intent)
        finish()
    }

    private fun onProfileViewClick(view: ImageView) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}