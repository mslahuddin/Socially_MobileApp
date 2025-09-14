package com.muhammadsalahuddin.i220969

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Video_Call : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_video_call)

        val msg = findViewById<CardView>(R.id.msg)

        msg.setOnClickListener {
            val intent = Intent(this, Chat_screen::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

    }
}