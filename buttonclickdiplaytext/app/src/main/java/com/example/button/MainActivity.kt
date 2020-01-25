package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var but = findViewById<Button>(R.id.button)

        but.setOnClickListener {
            var test = findViewById<TextView>(R.id.text)
            println(test.text.toString())
            test.setText("tharindu kavishna")
        }
    }
}
