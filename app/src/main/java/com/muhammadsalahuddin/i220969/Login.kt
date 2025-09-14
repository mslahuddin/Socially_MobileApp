package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.Button
import android.widget.ImageView
import android.widget.Toast



class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val createAccountBtn = findViewById<Button>(R.id.accountBtn)

        val close = findViewById<ImageView>(R.id.close)

        createAccountBtn.setOnClickListener {
            Toast.makeText(this, "Account Created Successfully!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Login2::class.java)
            startActivity(intent)
        }

        close.setOnClickListener {
            Toast.makeText(this, "Closed app", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Login2::class.java)
          finish()
        }
    }
}