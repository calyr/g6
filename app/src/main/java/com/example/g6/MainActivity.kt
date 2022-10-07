package com.example.g6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val btnWithBack: Button get() = findViewById(R.id.btn_with_back)
    private val btnWithoutBackActivity: Button get() = findViewById(R.id.btn_without_back)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWithBack.setOnClickListener {
            startActivity(Intent(this, WithBackActivity::class.java))
        }

        btnWithoutBackActivity.setOnClickListener {
            startActivity(Intent(this, WithoutBackActivity::class.java))
        }
    }
}