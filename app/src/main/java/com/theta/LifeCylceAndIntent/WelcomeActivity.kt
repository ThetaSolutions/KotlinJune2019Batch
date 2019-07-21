package com.theta.LifeCylceAndIntent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import com.theta.androidkotlin.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val userName = intent.getStringExtra(Intent.EXTRA_TEXT)
        var userAge = intent.getIntExtra("AGE", 0)


        welcomeText.text = welcomeText.text.toString() + userName + "\n AGE: " + userAge

        logout.setOnClickListener {

            showLogoutConfirmationDialog()
          //  logoutUser()
        }
    }

    private fun showLogoutConfirmationDialog() {
        var builder = AlertDialog.Builder(this@WelcomeActivity)
        builder.setTitle("Logout Confirmation")
        builder.setMessage("Are you sure you want to logout?")
        builder.setPositiveButton("YES"){dialog, which ->
            logoutUser()
        }
        builder.setNegativeButton("NO"){dialog, which ->

        }

//        builder.setNeutralButton("Cancel"){dialog, which ->
//
//        }

       builder.create().show()


    }

    fun logoutUser() {
        val intent = Intent(
            this@WelcomeActivity,
            IntentLifeCycleActivity::class.java
        )
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }
}
