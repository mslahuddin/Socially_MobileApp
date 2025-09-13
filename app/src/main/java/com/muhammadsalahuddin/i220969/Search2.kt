package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Search2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search2)

        val chat = findViewById<LinearLayout>(R.id.chat)

        val camera = findViewById<ImageView>(R.id.camera)



        chat.setOnClickListener {
            val intent = Intent(this, call::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        camera.setOnClickListener {
            val intent = Intent(this, camera::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

    }
}