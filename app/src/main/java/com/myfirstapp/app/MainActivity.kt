package com.myfirstapp.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //function to calculate the age (given input of DOB year)
    fun onSubmit(view: View) {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        tvAge.text = "Age : " + (currentYear - inputYear.text.toString().toInt())
    }
}