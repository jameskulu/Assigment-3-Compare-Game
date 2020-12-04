package com.jameskulu.comparegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        var correctCount = 0
        var incorrectCount = 0
        var gameCount = 0

        val randomNumber: Int = Random().nextInt(100)
        val randomNumber2: Int = Random().nextInt(100)
        btnFirst.text = randomNumber.toString()
        btnSecond.text = randomNumber2.toString()


            btnFirst.setOnClickListener {

                if (gameCount > 4){
                    btnFirst.isClickable = false
                    btnSecond.isClickable = false
                    tvCorrect.visibility = View.VISIBLE
                    tvIncorrect.visibility = View.VISIBLE
                    btnRestart.visibility = View.VISIBLE
                }
                else {

                    if (btnFirst.text.toString().toInt() > btnSecond.text.toString().toInt()) {
                        correctCount += 1
                        tvCorrect.text = "Correct: $correctCount"
                        gameCount += 1
                        println(gameCount)
                    }
                    if (btnFirst.text.toString().toInt() < btnSecond.text.toString().toInt()) {
                        incorrectCount += 1
                        tvIncorrect.text = "Incorrect: $incorrectCount"
                        gameCount += 1
                        println(gameCount)
                    }


                    val randomNumber: Int = Random().nextInt(100)
                    val randomNumber2: Int = Random().nextInt(100)
                    btnFirst.text = randomNumber.toString()
                    btnSecond.text = randomNumber2.toString()
                }
            }

            btnSecond.setOnClickListener {
                if (gameCount > 4) {
                    btnFirst.isClickable = false
                    btnSecond.isClickable = false
                    tvCorrect.visibility = View.VISIBLE
                    tvIncorrect.visibility = View.VISIBLE
                    btnRestart.visibility = View.VISIBLE
                } else {
                    if (btnFirst.text.toString().toInt() < btnSecond.text.toString().toInt()) {
                        correctCount += 1
                        tvCorrect.text = "Correct: $correctCount"
                        gameCount += 1
                        println(gameCount)

                    }
                    if (btnFirst.text.toString().toInt() > btnSecond.text.toString().toInt()) {
                        incorrectCount += 1
                        tvIncorrect.text = "Incorrect: $incorrectCount"
                        gameCount += 1
                        println(gameCount)
                    }

                    val randomNumber: Int = Random().nextInt(100)
                    val randomNumber2: Int = Random().nextInt(100)
                    btnFirst.text = randomNumber.toString()
                    btnSecond.text = randomNumber2.toString()

                }
            }

        btnRestart.setOnClickListener {
            gameCount = 0
            correctCount = 0
            incorrectCount = 0
            tvCorrect.text = "Correct: $correctCount"
            tvIncorrect.text = "Incorrect: $incorrectCount"
            btnFirst.isClickable = true
            btnSecond.isClickable = true
            btnRestart.visibility = View.INVISIBLE

            tvCorrect.visibility = View.INVISIBLE
            tvIncorrect.visibility = View.INVISIBLE

            val randomNumber: Int = Random().nextInt(100)
            val randomNumber2: Int = Random().nextInt(100)
            btnFirst.text = randomNumber.toString()
            btnSecond.text = randomNumber2.toString()
        }
        gameCount = 0
        correctCount = 0
        incorrectCount = 0



    }




}