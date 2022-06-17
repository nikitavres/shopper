package com.example.babka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            var intent = Intent(this@LoginActivity, ScrollActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}