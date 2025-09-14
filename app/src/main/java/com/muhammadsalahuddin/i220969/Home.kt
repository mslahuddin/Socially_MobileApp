package com.muhammadsalahuddin.i220969

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home) // ✅ fixed
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val search = findViewById<ImageView>(R.id.search)

        val like = findViewById<ImageView>(R.id.like)

        val profile = findViewById<CardView>(R.id.profile)

        val create = findViewById<ImageView>(R.id.create)

        val story = findViewById<CardView>(R.id.story)

        val share = findViewById<ImageView>(R.id.share)

        val camera = findViewById<ImageView>(R.id.camera)

        val myStory = findViewById<CardView>(R.id.myStory)



        val cardProfile = findViewById<CardView>(R.id.cardProfile)









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

        create.setOnClickListener {
            val intent = Intent(this,   create_post::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        story.setOnClickListener {
            val intent = Intent(this,   other_story::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        share.setOnClickListener {
            val intent = Intent(this,   Search2::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        camera.setOnClickListener {
            val intent = Intent(this,   Camera_real::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        myStory.setOnClickListener {
            val intent = Intent(this,   mystory::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        cardProfile.setOnClickListener {
            val intent = Intent(this,   Profile::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }
    }
}
