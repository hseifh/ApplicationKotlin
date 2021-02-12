package com.example.applicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.applicationkotlin.databinding.ActivityMainBinding

//import com.example.applicationkotlin

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.tapHere.setOnClickListener {
            binding.textView.text = "ボタンがタップされました"
        }
        
        /*
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("seihfgisehgfiruwheureur")
        var helloText: TextView = findViewById(R.id.textView)
        var helloButton: Button = findViewById(R.id.tapHere)
        helloButton.setOnClickListener {
            if (helloText.text == "push️") {
                helloText.text = "押した"
                println("押した")
                //for (i in 0..200) println(i)
            } else {
                helloText.text   = "push️"
                println("push")
            }
        }
        */

    }
}