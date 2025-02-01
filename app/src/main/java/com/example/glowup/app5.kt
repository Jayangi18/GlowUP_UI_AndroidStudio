package com.example.glowup

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class app5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageView: ImageView = findViewById(R.id.imageView3)
        imageView.setOnClickListener {
            val intent = Intent(this, app4::class.java)
            startActivity(intent)
        }

        val floatingActionButton: FloatingActionButton = findViewById(R.id.homeButton)
        floatingActionButton.setOnClickListener {
            val intent = Intent(this, app2::class.java)
            startActivity(intent)
        }

        val floatingActionButton2: FloatingActionButton = findViewById(R.id.remainderButton)
        floatingActionButton2.setOnClickListener {
            val intent = Intent(this, remainder::class.java)
            startActivity(intent)
        }

        val floatingActionButton3: FloatingActionButton = findViewById(R.id.profileButton)
        floatingActionButton3.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}