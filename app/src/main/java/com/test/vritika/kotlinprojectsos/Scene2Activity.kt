package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene2.*
import kotlin.random.Random

class Scene2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene2)
        when (choice) {
            0 -> {
                scenario2.setText("The one you had a crush on has agreed to join the virtual call you are gonna be a part of. It's time to look smart and leave a lasting impression. Unfortunately, the lockdown has made you grow hair in a messy way. You really need to get a makeover before the call of your life. What do you do?")
                button32.setText("You rush to the parlour open nearby.")
                button42.setText("You call the parlour or saloon worker home.")
                button52.setText("You let it go. The one who doesn't accept you at your worst, doesn't deserve you at your best")
                button62.setText("You cancel your plan of attending the virtual call.")
            }
            1 -> {
                scenario2.setText("You are too bored and want a way to pass your time. You start reading books kept at home until you are left with none. You ask your friends to suggest you books and they do. The book you are looking out for is too expensive online. A dealer away from your home is selling it at cheaper rates. What do you do?")
                button32.setText("Think of reading it some other time.")
                button42.setText("Go out buy the book.")
                button52.setText("Spend more money and buy it online.")
                button62.setText("Hack an online book portal to get the book.")
            }
            2 -> {
                scenario2.setText("You stepped out of your house, you dirty fellow. You need to clean yourself before coming in contact with food or people. What do you do?")
                button32.setText("Show your master that you are dirty and ask them to clean you.")
                button42.setText("Step under the shower and wait until your master washes you.")
                button52.setText("Lick yourself. The best way to get cleaned.")
                button62.setText("Go and sleep. Germs will sleep too.")
            }
            3 -> {
                scenario2.setText("You are finally better off. You have established a digital presence. Now you don't need to work as a domestic help anymore. Your children demand party. What do you do?")
                button32.setText("Take them out on a ride to a famous tourist destination.")
                button42.setText("Cook their favourite food and give home party.")
                button52.setText("Shout at them. This isn't time for celebration.")
                button62.setText("Call your neighbours for a huge party.")
            }
            4 -> {
                scenario2.setText("Friends, party and beach. What else do you want? They force you to drink alcohol and smoke to enjoy more. What do you do?")
                button32.setText("Drink only how much you take and stop.")
                button42.setText("Get drunk since you needed this.")
                button52.setText("Whatsapp news says drinking prevents corona. So get drunk.")
                button62.setText("Try to break the rules and people's windows too.")
            }
            5 -> {
                scenario2.setText("You had promised your daughter to be home on her birthday. It's her birthday tomorrow. You haven't slept properly for days. You are getting tired. What do you do?")
                button32.setText("Take a break and celebrate your daughter's birthday with her.")
                button42.setText("Avoid her demand due to increasing number of patients.")
                button52.setText("You tell her to skip a party. You will celebrate it with her.")
                button62.setText("You keep drinking coffee to avoid sleep and enjoy party and work as well.")
            }
        }
        button32.setOnClickListener {
            when(choice){
                2,1,4,5->score+=150
                0,3->score-=100
            }
            startActivity(Intent(this, Scene3Activity::class.java))
            finish()
        }
        button42.setOnClickListener {
            when(choice){
                2,3->score+=150
                0,1,4,5->score-=100
            }
            startActivity(Intent(this, Scene3Activity::class.java))
            finish()
        }
        button52.setOnClickListener {
            when(choice){
                0,1,3,5->score+=150
                2,4->score-=100
            }
            startActivity(Intent(this, Scene3Activity::class.java))
            finish()
        }
        button62.setOnClickListener {
            when(choice){
                0,1->score+=150
                2,3,4,5->score-=100
            }
            startActivity(Intent(this, Scene3Activity::class.java))
            finish()
        }
    }
}