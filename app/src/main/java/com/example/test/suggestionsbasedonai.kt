package com.example.test

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class suggestionsbasedonai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.ai_cameradentifierpage1)

        // WindowInsets handling
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🌟 Spinner 1 setup
        val spinner1: Spinner = findViewById(R.id.mySpinner)
        val adapter1 = ArrayAdapter.createFromResource(
            this, R.array.dropdown_items, android.R.layout.simple_spinner_item
        )
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1.adapter = adapter1

        // 🌟 Spinner 2 setup
        val spinner2: Spinner = findViewById(R.id.mySpinner2)
        val adapter2 = ArrayAdapter.createFromResource(
            this, R.array.country, android.R.layout.simple_spinner_item
        )
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter = adapter2

        // 🌟 Spinner 3 setup
        val spinner3: Spinner = findViewById(R.id.mySpinner3)
        val adapter3 = ArrayAdapter.createFromResource(
            this, R.array.dropdown_items, android.R.layout.simple_spinner_item
        )
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner3.adapter = adapter3
    }
}
