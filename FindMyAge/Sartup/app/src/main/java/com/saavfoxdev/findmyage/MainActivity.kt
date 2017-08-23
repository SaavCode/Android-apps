package com.saavfoxdev.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.attribute.AclFileAttributeView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    /* buFindAge.setOnClickListener {

         val yearOfBirth : Int = enterAge.text.toString().toInt()

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
         val myAge = currentYear - yearOfBirth
         //convert input to string and then to int

        txtYearOfBirth.text = "your age is $myAge years"
     }
     */
    }
    fun buFindAge(view: View){


        val yearOfBirth : Int = enterAge.text.toString().toInt()

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yearOfBirth
        //convert input to string and then to int

        txtYearOfBirth.text = "your age is $myAge years"
    }
}
