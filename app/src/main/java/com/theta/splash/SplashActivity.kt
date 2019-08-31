package com.theta.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.theta.RecyclerView.RecyclerViewActivity
import com.theta.androidkotlin.LinearRelativeLayoutsLecture.MainActivity
import com.theta.androidkotlin.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY:Long = 1000 //3 Seconds
    private var mDelayedHandler: Handler? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mDelayedHandler = Handler()
        mDelayedHandler?.postDelayed(mRunnable, SPLASH_DELAY)
    }

    val mRunnable:Runnable = Runnable {
     //...
        val intent = Intent(this@SplashActivity,
            RecyclerViewActivity::class.java)
        startActivity(intent)
    }

}
