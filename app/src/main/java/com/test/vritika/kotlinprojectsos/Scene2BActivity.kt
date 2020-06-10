package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene2_b.*
import kotlin.random.Random

class Scene2BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene2_b)
        when (choice) {
            0 -> {
                scenario2b.setText("Now this was an unnecessary expense. You came here without money. You need money for the next payments. What do you do?")
                button32b.setText("You do digital transactions.")
                button42b.setText("You go to the bank and withdraw money.")
                button52b.setText("You ask your friend for money.")
                button62b.setText("You remind your friend of all the money that she borrowed from you and get a treat.")
            }
            1 -> {
                scenario2b.setText("You start feeling sick. You need to take rest. You are staying at home, doesn't mean you stress out and work for money. What do you do?")
                button32b.setText("You inform your boss and take a leave. Health is first.")
                button42b.setText("You continue to work amidst your sickness.")
                button52b.setText("You start wooing your boss to get leave.")
                button62b.setText("You think of working overtime too so that you can get leave later.")
            }
            2 -> {
                scenario2b.setText("They use you to entertain them and shoo you when busy. How is this even fair? You are mad at them. You wanna show your anger. You need more attention than this. What do you do?")
                button32b.setText("Leave the home when the door is left open and move around.")
                button42b.setText("Hide yourself safely in a clean corner of the home.")
                button52b.setText("Refuse to eat lunch. But eat dinner cuz you dont wanna fall ill.")
                button62b.setText("Bite one of the family members.")
            }
            3 -> {
                scenario2b.setText("Your employer is asking you to do work with dirty and unhygienic items. What do you do?")
                button32b.setText("Calmly refuse to do the work.")
                button42b.setText("Do it with a fear of losing your job.")
                button52b.setText("Pick the dirt and throw it on him.")
                button62b.setText("You challenge your employer to clean it himself.")
            }
            4 -> {
                scenario2b.setText("You are bored of drinking canned juices. Your family members don't make good juices and you are the worst cook possible. You miss the taste of the lemonade you used to have at Mishra's Corner with your friends. What do you do?")
                button32b.setText("Ask Mishra to make a lemonade for you and go there!")
                button42b.setText("Try asking your family to make it or ignore the cravings.")
                button52b.setText("Try making juice yourself. You may even start a juice shop in the future.")
                button62b.setText("Ask the neighbour to make you some juice.")
            }
            5 -> {
                scenario2b.setText("Your patient recovered. His family gave you a dress as a gift which they want you to try at the moment. What do you do?")
                button32b.setText("Refuse to wear it without washing it.")
                button42b.setText("Wear and show them, you can't hurt their sentiments.")
                button52b.setText("You refuse to accept it because its not of your standards.")
                button62b.setText("You accept it but explain them nicely that you cant wear it now. You'll send them a pic later.")
            }
        }
        button32b.setOnClickListener {
            when(choice){
                0,1,3,5->score+=150
                2,4->score-=100
            }
            startActivity(Intent(this, Scene3BActivity::class.java))
            finish()
        }
        button42b.setOnClickListener {
            when(choice){
                2,4->score+=150
                0,1,3,5->score-=100
            }
            startActivity(Intent(this, Scene3BActivity::class.java))
            finish()
        }
        button52b.setOnClickListener {
            when(choice){
                0,1,2,4->score+=150
                3,5->score-=100
            }
            startActivity(Intent(this, Scene3BActivity::class.java))
            finish()
        }
        button62b.setOnClickListener {
            when(choice){
                0,5->score+=150
                1,2,3,4->score-=100
            }
            startActivity(Intent(this, Scene3BActivity::class.java))
            finish()
        }
    }
}