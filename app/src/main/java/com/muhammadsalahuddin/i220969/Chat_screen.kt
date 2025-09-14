package com.muhammadsalahuddin.i220969

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Chat_screen : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_screen)

        val call = findViewById<ImageView>(R.id.call)

        val back = findViewById<ImageView>(R.id.back)

        val camera = findViewById<ImageView>(R.id.camera)


        call.setOnClickListener {
            val intent = Intent(this, Video_Call::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        back.setOnClickListener {
            finish()
        }

        camera.setOnClickListener {
            val intent = Intent(this, Camera_real::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

    }
}