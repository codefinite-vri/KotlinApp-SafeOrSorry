package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loser.*

class LoserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loser)
        restartl.setOnClickListener{
            startActivity(Intent(this, Questionnaire::class.java))
            finish()
        }
    }
}
