package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile3)

        val msg = findViewById<CardView>(R.id.msg)

        val search = findViewById<ImageView>(R.id.search)

        val like = findViewById<ImageView>(R.id.like)

        val profile = findViewById<CardView>(R.id.profile)

        val create = findViewById<ImageView>(R.id.create)

        val nav_home = findViewById<ImageView>(R.id.nav_home)


        msg.setOnClickListener {
            val intent = Intent(this,   Chat_screen::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }


        search.setOnClickListener {
            val intent = Intent(this, mainSearch::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        like.setOnClickListener {
            val intent = Intent(this, notification::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this,   Profile2::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }


        nav_home.setOnClickListener {
            val intent = Intent(this,   Home::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        create.setOnClickListener {
            val intent = Intent(this,   create_post::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }
    }
}