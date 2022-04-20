package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var rollBtn: Button
    private lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.imageView)

        rollBtn=findViewById(R.id.buttonOne)

        rollBtn.setOnClickListener(){
            rollDice()
        }

    }

    private fun rollDice() {
        var randomInt:Int = Random.nextInt(6)+1
        var drawableResource = when(randomInt) {
            1 -> R.drawable.die1
            2 -> R.drawable.die2
            3 -> R.drawable.die3
            4 -> R.drawable.die4
            5 -> R.drawable.die5
            else -> R.drawable.die6
        }

        diceImage.setImageResource(drawableResource)
    }

}