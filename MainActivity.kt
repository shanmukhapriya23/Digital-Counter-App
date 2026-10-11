package com.example.digitalcounterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variable to maintain application state
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding views from XML layout
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnDecrement = findViewById<Button>(R.id.btnDecrement)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Helper function to update UI state
        fun updateCounter() {
            tvCounter.text = count.toString()
        }

        // Increment Button Click Listener
        btnIncrement.setOnClickListener {
            count++
            updateCounter()
        }

        // Decrement Button Click Listener (prevents going below zero)
        btnDecrement.setOnClickListener {
            if (count > 0) {
                count--
                updateCounter()
            }
        }

        // Reset Button Click Listener
        btnReset.setOnClickListener {
            count = 0
            updateCounter()
        }
    }
}