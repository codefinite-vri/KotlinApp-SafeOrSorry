package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene3.*

class Scene3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene3)
        when (choice) {
            0 -> {
                scenario3.setText("OUCH! What's worse than having your phone breakdown during the lockdown? What's better is that you don't even have a spare phone currently. What do you do?")
                button33.setText("You rush to the electronic shop nearby to repair your phone.")
                button43.setText("You ask your neighbour for a spare phone.")
                button53.setText("You try to repair it yourself.")
                button63.setText("You order a phone online.")
            }
            1 -> {
                scenario3.setText("You see a group of poor children knocking your door, asking for food. They seem hungry and malnourished")
                button33.setText("You let them in. Make them sit in your home and then offer food.")
                button43.setText("Give them leftover from your plate.")
                button53.setText("Find snacks and untouched food which they can eat and give it to them while they stand outside your house.")
                button63.setText("You tell them to be positive. All will be fine. And then shoo them away.")
            }
            2 -> {
                scenario3.setText("You hear a knock at the door. Your enemy is coming. Doggo to the rescue! Time to safeguard the family. What do you do?")
                button33.setText("Bark from your place and show your anger.")
                button43.setText("Jump on the enemy and maybe bite them.")
                button53.setText("Harm them only if they harm your loved ones.")
                button63.setText("Ignore them. Who cares? You don't want to be infected by their germs.")
            }
            3 -> {
                scenario3.setText("The family member give you food from their plate to eat. You used to be happy with it normally. But now its unsafe. What do you do?")
                button33.setText("Won't touch it. Can't risk!")
                button43.setText("Feed the food to the stray dogs.")
                button53.setText("Eat the food. Food shouldn't be disrespected.")
                button63.setText("Tell them that you don't want food.")
            }
            4 -> {
                scenario3.setText("You just realized that you have a lot of workload. Some of your existing govt works came up. You need to arrange the paperwork. Now you have lots of time to get that done. What do you do?")
                button33.setText("Get out and get it done.")
                button43.setText("Wear proper protection and get out to do it, only if it is urgent.")
                button53.setText("Wait for the situation to be better.")
                button63.setText("It's okay to be procrastinate.")
            }
            5 -> {
                scenario3.setText("You start shivering out of nowhere. Your body seems hot. But there's no time to rest in front of patients. What do you do?")
                button33.setText("Take a leave. You might endanger alot of people due to your carelessness.")
                button43.setText("Continue working. There is lot of pressure.")
                button53.setText("You immediately get yourself tested.")
                button63.setText("Spread rumours of getting Covid-19 so that you get leave automatically.")
            }
        }
        button33.setOnClickListener {
            when(choice){
                2,3,5->score+=150
                0,1,4->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
        button43.setOnClickListener {
            when(choice){
                0,4->score+=150
                1,2,3,5->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
        button53.setOnClickListener {
            when(choice){
                0,1,2,4,5->score+=150
                3->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
        button63.setOnClickListener {
            when(choice){
                2,3,4->score+=150
                0,1,5->score-=100
            }
            startActivity(Intent(this, Hospital::class.java))
            finish()
        }
    }
}