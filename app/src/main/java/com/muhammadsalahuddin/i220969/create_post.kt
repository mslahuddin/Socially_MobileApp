package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.cardview.widget.CardView

class create_post : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_post)
        val camera = findViewById<TextView>(R.id.camera)

        val cancel = findViewById<TextView>(R.id.cancel)

        val next = findViewById<TextView>(R.id.next)


        camera.setOnClickListener {
            val intent = Intent(this, camera::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        cancel.setOnClickListener {
            val intent = Intent(this, Home::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        next.setOnClickListener {
            val intent = Intent(this, Home::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }
    }
}