package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene3_b.*
import kotlin.random.Random

class Scene3BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene3_b)
        when (choice) {
            0 -> {
                scenario3b.setText("You have become so board of wearing the same old home clothes, that you started wearing formal wear at home. Discounts are flooding on sites. It's clothes shopping time. What do you do?")
                button33b.setText("You order a bulk of clothes.")
                button43b.setText("You control your shopping instincts.")
                button53b.setText("You start wearing outdoor clothes at home.")
                button63b.setText("You exchange clothes with your friend.")
            }
            1 -> {
                scenario3b.setText("You just had a transaction. What do you do?")
                button33b.setText("You go sit on your couch normally and do what you would otherwise do.")
                button43b.setText("You go eat since you are hungry.")
                button53b.setText("You wash up or get sanitized.")
                button63b.setText("You bathe. You are impure now.")
            }
            2 -> {
                scenario3b.setText("The baby in the house loves you too. She drops stuff from her plate at times to feed you. But leftovers have her saliva. It's not safe currently. What do you do?")
                button33b.setText("Won't touch it. Can't risk!")
                button43b.setText("Show the master that his daughter is giving you bad food.")
                button53b.setText("Eat the food. Food shouldn't be disrespected.")
                button63b.setText("Not come near the table during lunch or dinner to avoid cravings.")
            }
            3 -> {
                scenario3b.setText("You start feeling sick. You need to take rest. You are staying at home, doesn't mean you stress out and work for money. What do you do?")
                button33b.setText("You take a leave. Health is first.")
                button43b.setText("You continue to work amidst your sickness.")
                button53b.setText("You start wooing someone who can help you earn money.")
                button63b.setText("You think of working overtime later.")
            }
            4 -> {
                scenario3b.setText("Now this was an unnecessary expense. You came here without money. You need money for the next payments. What do you do?")
                button33b.setText("You do digital transactions.")
                button43b.setText("You go to the bank and withdraw money.")
                button53b.setText("You ask your friend for money.")
                button63b.setText("You remind your friend of all the money that she borrowed from you and get a treat.")
            }
            5 -> {
                scenario3b.setText("Your family member is sick. They have been showing most corona symptoms. What do you do?")
                button33b.setText("Test them and yourself and then resume work.")
                button43b.setText("Leave it. Doesn't matter. Work over all!")
                button53b.setText("Take medicines secretly. Don't tell anyone.")
                button63b.setText("You treat your family yourself so as to save them from societal pressure.")
            }
        }
        button33b.setOnClickListener {
            when(choice){
                2,3,4,5->score+=150
                0,1->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
        button43b.setOnClickListener {
            when(choice){
                0,2->score+=150
                1,3,4,5->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
        button53b.setOnClickListener {
            when(choice){
                0,1,3,4->score+=150
                2,5->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
        button63b.setOnClickListener {
            when(choice){
                1,2,3,4->score+=150
                0,5->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
    }
}