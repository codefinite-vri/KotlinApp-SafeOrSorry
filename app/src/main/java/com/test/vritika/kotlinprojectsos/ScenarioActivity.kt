package com.test.vritika.kotlinprojectsos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scenario.*
import kotlin.random.Random

class ScenarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scenario)
        when (choice) {
            0 -> {
                scenario.setText("You are a student studying at a university. Student life has gone topsy-turvy due to the pandemic. Online classes start with a smile and end with a cracked network. You have no clue when classes will resume. There is no surety of exams yet assignments and projects never cease to exist. What you are waiting for is a chance of redemption. Either a circular saying no school, or school starts! You are bored.You wake up one morning to your best friend\'s call. Holiday means party and fun. Your friend invites you to spend some quality time with them. What do you do?")
                button3.setText("You dress up in your good clothes and go to meet your friend.")
                button4.setText("You refuse and rather read a good book alone.")
                button5.setText("You suggest to have a video call or virtual movie party.")
                button6.setText("You get annoyed at your friend and end relations with her.")
            }
            1 -> {
                scenario.setText("You have been working as an IT Engineer away from your home. This lockdown has made things tougher for you. You felt it would be better if you could wake up late but the work from home trend messed up your schedule too.Away from home, you feel stranded. The only relief is the roof above your head. You miss mom\'s food and dad\'s love.You wish to go home. What do you do?")
                button3.setText("Sneak through borders and illegally go home.")
                button4.setText("You get a flight or train and go to your hometown.")
                button5.setText("You wait where you are till the situation is better.")
                button6.setText("You cry and cry and face depression alone.")
            }
            2 -> {
                scenario.setText("You are a little puppy who is the apple of the eye of every family member. You are the princess and the prince to the young one. At this time, when people abandon their pets, your family is there for you. Your master is the best. They\'ve got you a toy. The softy crunchy one. You wanna lick it. Bite it. Claim it. But it\'s unwashed. What do you do?")
                button3.setText("Pounce on it. Who cares its dirty!")
                button4.setText("Wait for your master to wash it and give you.")
                button5.setText("They know it's unsafe and still give it to you. So you get annoyed and walk away.")
                button6.setText("You make your signature face and make them give you the unclean ball")
            }
            3 -> {
                scenario.setText("You are an ordinary simple-and-content maid. Even after being a single parent, life was settled. You had enough work to fulfill your and your family\'s needs. But now, you are jobless. You lose all your work and income. Some pay you, others don\'t. You need to find a new solution. What do you do?")
                button3.setText("Roam outside the house and search for work.")
                button4.setText("Ask the neighbour's educated kid to teach you technology and help you get a new work.")
                button5.setText("Talk to people and find ways to get out of the misery.")
                button6.setText("Go around begging for money.")
            }
            4 -> {
                scenario.setText("Hey, you are the Chill Pill. You are the one who decided to retire soon and spend time with your old friends in the neighbourhood. You led the Laughter Yoga community of your society. Now, there is no laughter, no yoga. You wake up and switch on the TV. There\'s only one channel that is updated - the news channel. Seeing the growing number of cases on TV annoys you. What do you do?")
                button3.setText("Break the TV and save the emotional hurt.")
                button4.setText("Call friends and family and spend time productively.")
                button5.setText("You wait where you are till the situation is better.")
                button6.setText("Try to break the rules and get out of home.")
            }
            5 -> {
                scenario.setText("Hey you, Doctor! You are the bravest of all of us. You risk your life everyday to save another. No amount of gratitude would be enough to respect your work. You are a saviour. Your health is in your hands too. You need to stop stressing and take enough rest. However, cases seem to be flooding in. What do you do?")
                button3.setText("Work extra hours to save people harming your health.")
                button4.setText("Take rest while you work!")
                button5.setText("You listen to music and calm your soul.")
                button6.setText("You keep drinking coffee to avoid sleep.")
            }
        }
        button3.setOnClickListener {
            startActivity(Intent(this, Scene1Activity::class.java))
            finish()
        }
        button4.setOnClickListener {
            startActivity(Intent(this, Scene1Activity::class.java))
            finish()
        }
        button5.setOnClickListener {
            startActivity(Intent(this, Scene1Activity::class.java))
            finish()
        }
        button6.setOnClickListener {
            startActivity(Intent(this, Scene1Activity::class.java))
            finish()
        }
    }
}