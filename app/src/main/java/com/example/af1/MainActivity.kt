package com.example.af1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btn_sendData : Button
    private lateinit var editUsername : EditText
    private lateinit var editPassword : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sendData = findViewById(R.id.btn_sendData)
        editUsername = findViewById(R.id.et_username)
        editPassword = findViewById(R.id.et_password)

        btn_sendData.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("username",editUsername.text.toString())
                .putExtra("password",editPassword.text.toString())
            )
        }
    }
}