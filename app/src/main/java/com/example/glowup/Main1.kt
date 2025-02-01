package com.example.glowup

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Main1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val logo: CardView = findViewById(R.id.logo)

        // Initially hide the logo
        logo.visibility = View.INVISIBLE

        Handler(Looper.getMainLooper()).postDelayed({
            logo.visibility = View.VISIBLE
        }, 1000)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Main2::class.java)
            startActivity(intent)
            finish()  // Close this activity so user can't return back
        }, 2000)
    }
}