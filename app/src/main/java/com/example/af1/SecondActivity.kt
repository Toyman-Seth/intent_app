package com.example.af1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textUsername : TextView
    private lateinit var textPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textUsername = findViewById(R.id.tv_username)
        textPassword = findViewById(R.id.tv_password)

        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        textUsername.text = "Username : "+username
        textPassword.text = "Password : "+password
    }
}