package com.jameskulu.comparegame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var btnFirst:Button
    private lateinit var btnSecond:Button
    private lateinit var btnRestart:Button
    private lateinit var tvCorrect:TextView
    private lateinit var tvIncorrect:TextView
    private lateinit var tvResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFirst = findViewById(R.id.btnFirst)
        btnSecond = findViewById(R.id.btnSecond)
        btnRestart = findViewById(R.id.btnRestart)
        tvCorrect = findViewById(R.id.tvCorrect)
        tvIncorrect = findViewById(R.id.tvIncorrect)
        tvResult = findViewById(R.id.tvResult)

        var correctCount = 0
        var incorrectCount = 0
        var gameCount = 0

        val randomNumber: Int = Random().nextInt(100)
        val randomNumber2: Int = Random().nextInt(100)
        btnFirst.text = randomNumber.toString()
        btnSecond.text = randomNumber2.toString()


        btnFirst.setOnClickListener {

            if (gameCount == 10){
                btnFirst.isClickable = false
                btnSecond.isClickable = false
                tvCorrect.visibility = View.VISIBLE
                tvIncorrect.visibility = View.VISIBLE
                btnRestart.visibility = View.VISIBLE
                if (correctCount > incorrectCount){
                    tvResult.text = "You won !"
                    tvResult.setBackgroundColor(Color.GREEN)
                }
                if (correctCount < incorrectCount){
                    tvResult.text = "You lose !"
                    tvResult.setBackgroundColor(Color.RED)
                }
                if (correctCount == incorrectCount){
                    tvResult.text = "Draw !"
                    tvResult.setBackgroundColor(Color.YELLOW)
                }
            }
            else {
                if (btnFirst.text.toString().toInt() > btnSecond.text.toString().toInt()) {
                    correctCount += 1
                    tvCorrect.text = "Correct: $correctCount"
                    gameCount += 1
                }
                if (btnFirst.text.toString().toInt() < btnSecond.text.toString().toInt()) {
                    incorrectCount += 1
                    tvIncorrect.text = "Incorrect: $incorrectCount"
                    gameCount += 1
                }
                val randomNumber: Int = Random().nextInt(100)
                val randomNumber2: Int = Random().nextInt(100)
                btnFirst.text = randomNumber.toString()
                btnSecond.text = randomNumber2.toString()
            }
        }



        btnSecond.setOnClickListener {
            if (gameCount == 10) {
                btnFirst.isClickable = false
                btnSecond.isClickable = false
                tvCorrect.visibility = View.VISIBLE
                tvIncorrect.visibility = View.VISIBLE
                btnRestart.visibility = View.VISIBLE

                if (correctCount > incorrectCount){
                    tvResult.text = "You won !"
                    tvResult.setBackgroundColor(Color.GREEN)
                }
                if (correctCount < incorrectCount){
                    tvResult.text = "You lose !"
                    tvResult.setBackgroundColor(Color.RED)
                }
                if (correctCount == incorrectCount){
                    tvResult.text = "Draw !"
                    tvResult.setBackgroundColor(Color.YELLOW)
                }
            } else {
                if (btnFirst.text.toString().toInt() < btnSecond.text.toString().toInt()) {
                    correctCount += 1
                    tvCorrect.text = "Correct: $correctCount"
                    gameCount += 1
                }
                if (btnFirst.text.toString().toInt() > btnSecond.text.toString().toInt()) {
                    incorrectCount += 1
                    tvIncorrect.text = "Incorrect: $incorrectCount"
                    gameCount += 1
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
            tvResult.text = ""
            tvResult.setBackgroundColor(Color.TRANSPARENT)

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



