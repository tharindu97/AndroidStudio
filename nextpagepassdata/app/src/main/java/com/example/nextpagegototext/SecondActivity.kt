package com.example.nextpagegototext

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)

        var test = findViewById<TextView>(R.id.text)
        var intent = getIntent()
        test.setText(intent.getStringExtra("Name"))
    }
}