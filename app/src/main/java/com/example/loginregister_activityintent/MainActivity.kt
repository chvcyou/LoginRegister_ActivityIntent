package com.example.loginregister_activityintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var gologin: TextView
    private lateinit var usernameEditText: EditText
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gologin = findViewById(R.id.gologin)
        btnRegister = findViewById(R.id.btnRegister)


        gologin.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        }
        btnRegister.setOnClickListener {
            val intent = Intent(this@MainActivity, WelcomeActivity::class.java)

            // Mengambil nilai username dari EditText
            val username = usernameEditText.text.toString()

            // Mengirim nilai username ke WelcomeActivity
            intent.putExtra("username", username)

            startActivity(intent)
        }
    }
}


