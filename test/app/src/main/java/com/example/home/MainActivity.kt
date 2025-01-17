package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnShoeToast.setOnClickListener {
            Log.i("MainActivity","Button was clicked")

            Toast.makeText(this,"click here",Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {

            Toast.makeText(this,"login here",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
