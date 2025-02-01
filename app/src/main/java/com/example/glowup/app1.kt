package com.example.glowup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class app1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val ImageView: ImageView = findViewById(R.id.imageView3)
//        ImageView.setOnClickListener {
//            val intent = Intent(this, app4::class.java)
//            startActivity(intent)
//        }

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(  this, app2::class.java)
            startActivity(intent)
        }
    }
}