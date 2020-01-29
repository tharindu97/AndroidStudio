package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.kittinunf.fuel.Fuel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("panama")
        buttonClick.setOnClickListener {
            Fuel.get("https://jsonplaceholder.typicode.com/posts/")
                .response{
                request, response, result ->
                    println(request)
                    println(response)
                    val (bytes, error)  = result
                    if( bytes != null){
                        println(" response byets ${String(bytes)}")
                    }
            }
        }
    }
}
