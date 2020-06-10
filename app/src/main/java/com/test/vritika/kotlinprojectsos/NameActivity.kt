package com.test.vritika.kotlinprojectsos

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_name.*


var name : String = "Anna"

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        Name.text = "Hello, I am Quarantina. What's your name?"
        SUBMITNAME.setOnClickListener {
            doSubmit()
        }

    }
    private fun doSubmit() {
        if (nameValue.text != null) {
            name = findViewById<EditText>(R.id.nameValue).toString()
            val intent = Intent(this, AgeActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(
                baseContext,
                "Please enter first name.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
