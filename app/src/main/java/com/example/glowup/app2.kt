package com.example.glowup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class app2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val floatingActionButton: FloatingActionButton = findViewById(R.id.categoryButton)
        floatingActionButton.setOnClickListener {
            val intent = Intent(this, app3::class.java)
            startActivity(intent)
        }

        val floatingActionButton2: FloatingActionButton = findViewById(R.id.remainderButton)
        floatingActionButton2.setOnClickListener {
            val intent = Intent(this, remainder::class.java)
            startActivity(intent)
        }

        val floatingActionButton3: FloatingActionButton = findViewById(R.id.profileButton)
        floatingActionButton3.setOnClickListener {
            val intent = Intent(this, remainder::class.java)
            startActivity(intent)
        }

    }
}