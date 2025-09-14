package com.muhammadsalahuddin.i220969

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class other_story : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_other_story)
        val cross= findViewById<CardView>(R.id.cross)

        val profile= findViewById<CardView>(R.id.profile)


        cross.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


        profile.setOnClickListener {
            val intent = Intent(this, Profile3::class.java)
            startActivity(intent)
        }
    }
}