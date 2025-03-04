package com.example.practice2

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDownload = findViewById<Button>(R.id.btnDownload)
        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)

        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading...", Toast.LENGTH_SHORT).show()
        }

        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
        }

        buttonLight.setOnClickListener{
            // change to red mode
            layout.setBackgroundResource(R.color.red)
        }

        buttonDark.setOnClickListener{
            // change to dark mode
            layout.setBackgroundResource(R.color.black)
        }
    }
}