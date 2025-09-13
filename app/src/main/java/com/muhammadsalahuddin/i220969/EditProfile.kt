package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)

        val cancel = findViewById<TextView>(R.id.cancel)

        val done = findViewById<TextView>(R.id.done)

        val ChangePhoto = findViewById<TextView>(R.id.ChangePhoto)


        cancel.setOnClickListener {
            val intent = Intent(this, Profile2::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        done.setOnClickListener {
            val intent = Intent(this, Profile2::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        ChangePhoto.setOnClickListener {
            val intent = Intent(this, create_post::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }
    }
}