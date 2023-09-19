package com.example.loginregister_activityintent

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val welcomeMessage = findViewById<TextView>(R.id.txtWelcomeMessage)

        // Menerima data username dari intent
        val username = intent.getStringExtra("username")

        // Menampilkan pesan selamat datang dengan username (jika ada)
        if (username != null) {
            welcomeMessage.text = "Welcome $username! Your email has been activated. Your phone has been registered."
        } else {
            welcomeMessage.text = "Welcome! Your email has been activated. Your phone has been registered."
        }
    }
}
