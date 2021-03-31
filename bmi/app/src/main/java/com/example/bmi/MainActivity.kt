package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cal.setOnClickListener {
            val weight1 = weght.text.toString()
            val height2 = height.text.toString()
            clear.setOnClickListener{
                weght.setText("")
                height.setText("")
                Toast.makeText(applicationContext,"clear", Toast.LENGTH_LONG).show()
            }

        }


    }}

