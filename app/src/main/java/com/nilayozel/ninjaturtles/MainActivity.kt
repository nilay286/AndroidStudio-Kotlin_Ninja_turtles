package com.nilayozel.ninjaturtles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ninjaText : TextView = findViewById(R.id.ninjaText)
        var ninjaImage : ImageView = findViewById(R.id.ninjaImage)
        var clickButton : Button = findViewById(R.id.clickButton)

        ninjaImage.setImageResource(R.drawable.ninjaturtles)

        clickButton.setOnClickListener(){

            Toast.makeText(this,"Character is chosen", Toast.LENGTH_SHORT)

            var randomSayi = (1..4).random()

            when(randomSayi){
                1-> {ninjaImage.setImageResource(R.drawable.donatello)
                        ninjaText.text = "Donatello"
                    }

                2-> {ninjaImage.setImageResource(R.drawable.leonardo)
                    ninjaText.text = "Leonardo"
                }

                3-> {ninjaImage.setImageResource(R.drawable.michelangelo)
                    ninjaText.text = "Michelangelo"
                }

                4-> {ninjaImage.setImageResource(R.drawable.raphael)
                    ninjaText.text = "Raphael"
                }

            }




        }

    }
}