package com.example.applicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var helloText: TextView = findViewById(R.id.textView)
        var helloButton: Button = findViewById(R.id.tapHere)
        helloButton.setOnClickListener {
            if (helloText.text.equals("push️")) {
                helloText.text = "押した"
            } else {
                helloText.text   = "push️"
            }
            /*helloText.text = "push*/
        }
    }
}