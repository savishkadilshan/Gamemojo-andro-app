package com.example.gamemojo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val navStudiosBtn = findViewById<ImageView>(R.id.imageView7)
        navStudiosBtn.setOnClickListener { onImageViewClick(navStudiosBtn) }

        val navProfileBtn = findViewById<ImageView>(R.id.imageView8)
        navProfileBtn.setOnClickListener { onProfileViewClick(navProfileBtn) }
    }

    private fun onImageViewClick(view: ImageView) {
        val intent = Intent(this, StudiosActivity::class.java)
        startActivity(intent)
    }

    private fun onProfileViewClick(view: ImageView) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}