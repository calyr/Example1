package com.example.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LiveDataStringActivity : AppCompatActivity() {
    lateinit var btnLiveData : Button
    lateinit var textView: TextView
    lateinit var liveDataString: LiveDataString
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_string)

        btnLiveData = findViewById(R.id.btnLiveData)
        textView = findViewById(R.id.textView2)
        liveDataString = LiveDataString()
        liveDataString.model.observe(this,::updateUi)
        btnLiveData.setOnClickListener {
            counter++
            liveDataString.changedValue(counter.toString())
        }
    }

    private fun updateUi(s: String) {
        textView.text = s
    }
}