package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene1.*
import kotlin.random.Random

class Scene1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene1)
        when (choice) {
            0 -> {
                scenario1.setText("Opening Instagram and Whatsapp status hurts you. Those delicious food items are all that you crave. You wish to eat them but you can't. Mom isn't ready to cook either. What do you do?")
                button31.setText("You order food online.")
                button41.setText("You avoid your cravings.")
                button51.setText("You try to cook by yourself.")
                button61.setText("You get annoyed and skip food.")
            }
            1 -> {
                scenario1.setText("You have been asked to take an institutional quarantine of 2 weeks. You are bored in a day. The walls make you wanna end your life. It's annoying - being alone here. What do you do?")
                button31.setText("Bribe the authorities and get out of the facility")
                button41.setText("Wait till the end of the quarantine period.")
                button51.setText("Try to hit on the good-looking nurse.")
                button61.setText("Enjoy being pampered in solitude.")
            }
            2 -> {
                scenario1.setText("You stand at your window and notice your best friend plus crush walk outside your homee with your owner. She has no doggo gang following her unlike usual. What do you do?")
                button31.setText("Move away. You won't hurt yourself while you lose the opportunity.")
                button41.setText("Chance to woo her.")
                button51.setText("Ignore her. She was flirting with your enemy last week.")
                button61.setText("Get out and find another dog to make this poodle jealous.")
            }
            3 -> {
                scenario1.setText("There's one lady who hasn't yet given you leave. You go to her house for work. Working with masks is very uncomfortable. You feel breathless at times. It tires you to the core. What do you do?")
                button31.setText("Wear mask no matter what.")
                button41.setText("Take small breaks in between your work to breathe. Don't tire yourself totally.")
                button51.setText("Remove your mask when no one's watching.")
                button61.setText("Make sure you sneeze with the mask off.")
            }
            4 -> {
                scenario1.setText("This is disheartening. You have called the same people repeatedly. You have done the same tasks. It's time to move on. Life can't go on this way. What do you do?")
                button31.setText("Start doing exercise. Do new schedules everyday.")
                button41.setText("Learn a new activity each week and maybe start a youtube channel.")
                button51.setText("Call your enemies and befriend them.")
                button61.setText("Let the lockdown go to hell. Get out and party.")
            }
            5 -> {
                scenario1.setText("Masks are out of stock. The hospitals are flooding. You either reuse masks or take a break. What do you do?")
                button31.setText("Reuse Masks!")
                button41.setText("Take a break.")
                button51.setText("Treat without masks. It's okay, you are a warrior")
                button61.setText("Use tissue paper as masks.")
            }
        }
        button31.setOnClickListener {
            when(choice){
                2,3,4->score+=150
                0,1,5->score-=100
            }
            startActivity(Intent(this, Scene2Activity::class.java))
            finish()
        }
        button41.setOnClickListener {
            when(choice){
                0,1,3,4,5->score+=150
                2->score-=100
            }
            startActivity(Intent(this, Scene2Activity::class.java))
            finish()
        }
        button51.setOnClickListener {
            when(choice){
                0,1,2,4->score+=150
                3,5->score-=100
            }
            startActivity(Intent(this, Scene2Activity::class.java))
            finish()
        }
        button61.setOnClickListener {
            when(choice){
               1->score+=150
               0,2,3,4,5->score-=100
            }
            startActivity(Intent(this, Scene2Activity::class.java))
            finish()
        }
    }
}