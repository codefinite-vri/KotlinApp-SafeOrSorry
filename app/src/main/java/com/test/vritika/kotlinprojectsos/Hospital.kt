package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hospital.*

class Hospital : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital)
        if (choice==2)
        {

                scenarioh.setText("Your master got hit by a car. He has been admitted to the hospital due to the criticality of his condition. What do you do?")
                button3h.setText("You force to  go to the hospital and meet him.")
                button4h.setText("You make the family feel better.")
                button5h.setText("You keep getting updates from them instead of going to visit him.")
                button6h.setText("You keep pooping in the house and dirtying everywhere because they won't take you to the hospital.")

        }
        else{
            scenarioh.setText("Your friend got hit by a car. He has been admitted to the hospital due to the criticality of his condition. What do you do?")
            button3h.setText("You rush to the hospital and meet him.")
            button4h.setText("You call his parents up and make them feel better.")
            button5h.setText("You keep getting updates from them instead of going to visit him.")
            button6h.setText("You call him and tell him that you are glad he didnt die.")
        }
        button3h.setOnClickListener{
            score-=100
            if(score>=350){
                startActivity(Intent(this, WinnerActivity::class.java))
                finish()
            }
            else{
                startActivity(Intent(this, LoserActivity::class.java))
                finish()
            }
        }
        button4h.setOnClickListener{
            score+=150
            if(score>=350){
                startActivity(Intent(this, WinnerActivity::class.java))
                finish()
            }
            else{
                startActivity(Intent(this, LoserActivity::class.java))
                finish()
            }
        }
        button5h.setOnClickListener{
            score+=150
            if(score>=350){
                startActivity(Intent(this, WinnerActivity::class.java))
                finish()
            }
            else{
                startActivity(Intent(this, LoserActivity::class.java))
                finish()
            }
        }
        button6h.setOnClickListener{
            if(choice==2){
                score-=100
            }
            else{
                score+=150
            }
            if(score>=350){
                startActivity(Intent(this, WinnerActivity::class.java))
                finish()
            }
            else{
                startActivity(Intent(this, LoserActivity::class.java))
                finish()
            }
        }
    }
}
