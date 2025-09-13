package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat)

        val call = findViewById<ImageView>(R.id.call)


        call.setOnClickListener {
            val intent = Intent(this, Profile2::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

    }
}