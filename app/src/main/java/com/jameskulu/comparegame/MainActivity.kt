package com.jameskulu.comparegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnFirst: Button = findViewById(R.id.btnFirst)
        val btnSecond: Button = findViewById(R.id.btnSecond)
        val btnRestart: Button = findViewById(R.id.btnRestart)
        val tvCorrect: TextView = findViewById(R.id.tvCorrect)
        val tvIncorrect: TextView = findViewById(R.id.tvIncorrect)
        val tvResult: TextView = findViewById(R.id.tvResult)



        var correctCount = 0
        var incorrectCount = 0

        val randomNumber: Int = Random().nextInt(100)
        val randomNumber2: Int = Random().nextInt(100)
        btnFirst.text = randomNumber.toString()
        btnSecond.text = randomNumber2.toString()

        btnFirst.setOnClickListener {
            if(btnFirst.text.toString().toInt() > btnSecond.text.toString().toInt()){
                correctCount+=1
                tvCorrect.text = "Correct: $correctCount"
            }
            if(btnFirst.text.toString().toInt() < btnSecond.text.toString().toInt()){
                incorrectCount+=1
                tvIncorrect.text = "Incorrect: $incorrectCount"
            }

            val randomNumber: Int = Random().nextInt(100)
            val randomNumber2: Int = Random().nextInt(100)
            btnFirst.text = randomNumber.toString()
            btnSecond.text = randomNumber2.toString()
        }

        btnSecond.setOnClickListener {

            if(btnFirst.text.toString().toInt() < btnSecond.text.toString().toInt()){
                correctCount+=1
                tvCorrect.text = "Correct: $correctCount"
            }
            if(btnFirst.text.toString().toInt() > btnSecond.text.toString().toInt()){
                incorrectCount+=1
                tvIncorrect.text = "Incorrect: $incorrectCount"
            }

            val randomNumber: Int = Random().nextInt(100)
            val randomNumber2: Int = Random().nextInt(100)
            btnFirst.text = randomNumber.toString()
            btnSecond.text = randomNumber2.toString()
        }

    }
}