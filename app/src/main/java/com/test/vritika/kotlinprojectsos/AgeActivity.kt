package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_age.*


var age :Int =10
var score : Int = 500
var score1: Int=500

class AgeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        Age1.text="That's really nice. I know I sound like an old woman, but I am just 21 years old. How about you?"
        val intent = Intent(this, Questionnaire::class.java)
        op1.setOnClickListener{
            score-=200
            score1=score
            startActivity(intent)
        }
        op2.setOnClickListener{
            score-=100
            score1=score
            startActivity(intent)
        }
        op3.setOnClickListener{
            startActivity(intent)
        }
        op4.setOnClickListener{
            score-=100
            score1=score
            startActivity(intent)
        }
        op5.setOnClickListener{
            score-=200
            score1=score
            startActivity(intent)
        }
    }
}
