package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Camera_real : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camera_real)

        val cross = findViewById<CardView>(R.id.cross)

        val next = findViewById<CardView>(R.id.next)

        cross.setOnClickListener {
            finish()
        }

        next.setOnClickListener {
            val intent = Intent(this, story_post::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }




    }
}