package com.example.applicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.applicationkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gu.setOnClickListener { onJankenButtonTapped(it) }
        binding.choki.setOnClickListener{ onJankenButtonTapped(it) }
        binding.pa.setOnClickListener{ onJankenButtonTapped(it) }
    }

    fun onJankenButtonTapped(view: View?){
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("MY_HAND",view?.id)
        startActivity(intent)
    }
}

/*
        binding.tapHere.setOnClickListener {
            //binding.textView.text = "ボタンがタップされました"
            //println("ランダムクラス")
            //println("Math.random()" + Math.random())
            //println("(Math.random() * 3)" + (Math.random() * 3))
            println("(Math.random() * 3).toInt()" + (Math.random() * 3).toInt())
        }
        */

/*
super.onCreate(savedInstanceState)
binding = ActivityMainBinding.inflate(layoutInflater)
var view = binding.root
setContentView(view)
binding.tapHere.setOnClickListener {
    binding.textView.text = "ボタンがタップされました"
}
*/



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