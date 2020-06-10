package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene1_b.*
import kotlin.random.Random

class Scene1BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene1_b)
        when (choice) {
            0 -> {
                scenario1b.setText("Captain America used to be your childhood favourite. Not being subscribed to any channel, you are unable to watch it. What do you do?")
                button31b.setText("You go out and purchase it from the black dealer.")
                button41b.setText("You get a subscription.")
                button51b.setText("You change your plans of watching the movie.")
                button61b.setText("You become Captain America itself.")
            }
            1 -> {
                scenario1b.setText("There's so much work to do. You are tired of the daily chores now. It's high time, you need a maid to come and clean this mess. What do you do?")
                button31b.setText("You control your emotions and go work yourself.")
                button41b.setText("You call a part-time maid to work at your home.")
                button51b.setText("You ask your friend to come and clean your house in exchange for the money he borrowed from you.")
                button61b.setText("You let your home be messed.")
            }
            2 -> {
                scenario1b.setText("Your owner is back home after going to the pharmacy. Those bread in his hand smell yum. But what smells better is your owner's sweat. What do you do?")
                button31b.setText("Lick your owner to show affection")
                button41b.setText("Ignore your owner. Rather sleep.")
                button51b.setText("Jump and show excitement. Don't touch owner until he washes himself.")
                button61b.setText("You make your signature face and make him hug you.")
            }
            3 -> {
                scenario1b.setText("You are running out of cash. The digital methods aren't enough to earn you a meal for your children. What do you do?")
                button31b.setText("Go to your employer and ask for loan.")
                button41b.setText("Find places where food is found for free but ensure that you maintain hygiene")
                button51b.setText("Talk to people and find ways to get out of the misery.")
                button61b.setText("Go around begging for money.")
            }
            4 -> {
                scenario1b.setText("Your meds are over. You need them. Your going out isn't safe considering your sickness. What do you do?")
                button31b.setText("Ask someone to get them for you. Make sure you wear masks.")
                button41b.setText("Get out yourself. No corona can harm you.")
                button51b.setText("You'd rather die of old age, than corona.")
                button61b.setText("Start finding homemade alternatives of medicines even if they aren't helping you.")
            }
            5 -> {
                scenario1b.setText("Your mask had an accident tear while you were treating a Covid-19 patient. What do you do?")
                button31b.setText("Get Quarantined.")
                button41b.setText("Continue Working.")
                button51b.setText("Go telling everyone you got infected.")
                button61b.setText("End your life to prevent miseries.")
            }
        }
        button31b.setOnClickListener {
            when(choice){
                1,4,5->score+=150
                0,2,3->score-=100
            }
            startActivity(Intent(this, Scene2BActivity::class.java))
            finish()
        }
        button41b.setOnClickListener {
            when(choice){
                0,2,3->score+=150
                1,4,5->score-=100
            }
            startActivity(Intent(this, Scene2BActivity::class.java))
            finish()
        }
        button51b.setOnClickListener {
            when(choice){
                0,2,3->score+=150
                1,4,5->score-=100
            }
            startActivity(Intent(this, Scene2BActivity::class.java))
            finish()
        }
        button61b.setOnClickListener {
            when(choice){
                0->score+=150
                1,2,3,4,5->score-=100
            }
            startActivity(Intent(this, Scene2BActivity::class.java))
            finish()
        }
    }
}