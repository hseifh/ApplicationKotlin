package com.example.applicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationkotlin.databinding.ActivityResultBinding
//import com.fsgieuhgie.applicationkotlin.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    val gu = 0
    val choki = 1
    val pa = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //受け取りID(g,c,p)
        val id = intent.getIntExtra("MY_HAND",0)

        //
        val myHant: Int

        myHant = when(id){
            R.id.gu -> {
                binding.myHandImage.setImageResource(R.drawable.gu)
                gu
            }
            R.id.choki -> {
                binding.myHandImage.setImageResource(R.drawable.choki)
                choki
            }
            R.id.pa -> {
                binding.myHandImage.setImageResource(R.drawable.pa)
                pa
            }
            else -> gu
        }
        //print(myHant)

        //ランダムで(0,1,2)
        val comHand = (Math.random() * 3).toInt()
        //コンピュータの手を決める
        when(comHand){
            gu -> binding.comHandImage.setImageResource(R.drawable.gu_white)
            choki -> binding.comHandImage.setImageResource(R.drawable.choki_white)
            pa -> binding.comHandImage.setImageResource(R.drawable.pa_white)
        }

        //勝敗を判定する
        val gameResult = (comHand -myHant + 3) % 3
        when(gameResult){
            0 -> binding.resultLabel.setText(R.string.result_draw)
            1 -> binding.resultLabel.setText(R.string.result_win)
            2 -> binding.resultLabel.setText(R.string.result_lose)
        }

        //戻るボタン
        binding.backButton.setOnClickListener{ finish() }

    }
}