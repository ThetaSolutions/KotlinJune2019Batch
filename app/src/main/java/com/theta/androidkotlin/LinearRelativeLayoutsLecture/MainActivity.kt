package com.theta.androidkotlin.LinearRelativeLayoutsLecture

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.theta.androidkotlin.R
import com.theta.sharedPreferences.SharedPrefs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        third.setTextColor(resources.getColor(R.color.colorAccent))

      //Hide the Textview with ID four
        four.visibility = View.GONE

        //Implement ClickListener
        six.setOnClickListener {

            //Show Toast
            Toast.makeText(this,
                six.text.toString(),Toast.LENGTH_LONG).show()

            //Show the four back
            four.visibility= View.VISIBLE

            //hide five
            five.visibility = View.INVISIBLE

            //seven...
            seven.text = "Changed"
        }


        seven.setOnClickListener {
            seven.text = "Seven"


            //Shared Prefs
            val thetaPrefs = "com.theta.androidkotlin.prefs"
            val sharedPrefs = getSharedPreferences(thetaPrefs, 0)
            sharedPrefs.edit().putString("ButtonSeven", seven.text.toString()).commit()

           val valueFromSharedPrefs= sharedPrefs.getString("ButtonSeven","")

        }


    }
}
