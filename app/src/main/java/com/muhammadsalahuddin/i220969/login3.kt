package com.muhammadsalahuddin.i220969

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login3)
        val login = findViewById<Button>(R.id.login)

        val signup = findViewById<TextView>(R.id.signUp)

        signup.setOnClickListener {
            Toast.makeText(this, "Redirecting to Sign Up...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Login::class.java) // replace with your actual sign-up activity
            startActivity(intent)
        }

        login.setOnClickListener {
            Toast.makeText(this, "Account Created Successfully!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}