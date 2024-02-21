package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.txtinsira)
        var buttonText =findViewById<Button>(R.id.btntxt)

        buttonText.setOnClickListener {
            val msg = "Olá, $name"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }

    }
}