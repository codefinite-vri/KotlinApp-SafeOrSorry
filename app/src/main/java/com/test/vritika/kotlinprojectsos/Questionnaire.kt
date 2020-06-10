package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_questionnaire.*
import kotlin.random.Random
import kotlin.system.exitProcess

var choice : Int = 0

class Questionnaire : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnaire)
        score=score1
        question.setText("Hello. Glad to meet you on this online platform. Covid-19 and the lockdown has changed our lives completely. To drive your boredom away, I have a small roleplay for you! Are you ready to join me on a virtual journey of fun?")
        button1.setOnClickListener {
            startActivity(Intent(this, ScenarioActivity::class.java))
            choice = Random.nextInt(6)
            finish()
        }
        button2.setOnClickListener {
            System.exit(0)
            finish()
        }
    }
}

