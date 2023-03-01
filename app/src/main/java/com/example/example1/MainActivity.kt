package com.example.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var textView: TextView
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        textView = findViewById(R.id.textView)

        btnAdd.setOnClickListener {
            counter++
            textView.text = counter.toString()
        }
    }
}