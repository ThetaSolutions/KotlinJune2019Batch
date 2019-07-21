package com.theta.LifeCylceAndIntent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lifecycle.*


class IntentLifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.theta.androidkotlin.R.layout.activity_lifecycle)

        showToast("onCreate")
        Log.d("IntentLifeCycleActivity", "onCreate")
        textLifeCycle.setText("OnCreate")

        buttonClick.setOnClickListener {
            //Explicit INTENT vs Implicit Intent
//Toast.makeText(this@IntentLifeCycleActivity,
//    editTextUserName.text.toString(), Toast.LENGTH_LONG).show()
            showExplicitIntent()

            //       showImplicitIntent()


        }


    }

    private fun showExplicitIntent() {
        //1- Explicit INTENT
        val explicitIntent = Intent(
            this@IntentLifeCycleActivity,
            Main2Activity::class.java
        )

        explicitIntent.putExtra(
            Intent.EXTRA_TEXT
            , editTextUserName.text.toString()
        )

        explicitIntent.putExtra(
            "AGE"
            , Integer.valueOf(editTextAge.text.toString())
        )

        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        explicitIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(explicitIntent)
        finish()
    }

    private fun showImplicitIntent() {
        //Implicit Intent
        val implicitIntent = Intent()
        implicitIntent.action = Intent.ACTION_SEND
        implicitIntent.putExtra(Intent.EXTRA_TEXT, "My Text")
        implicitIntent.type = "text/plain"
//            implicitIntent.type= "audio/*"
//            implicitIntent.type= "video/*"
//            implicitIntent.type= "application/*"
        val intent = Intent.createChooser(implicitIntent, "Share Text With")
        startActivity(intent)

    }

    override fun onStart() {
        super.onStart()
        showToast("onStart")
        Log.d("IntentLifeCycleActivity", "onStart")
        textLifeCycle.text = textLifeCycle.text.toString() + "\n onStart"

    }

    override fun onResume() {
        super.onResume()
        showToast("onResume")
        Log.d("IntentLifeCycleActivity", "onResume")
        textLifeCycle.text = textLifeCycle.text.toString() + "\n onResume"


        //  Audio.ON
        //VIDEO.ON
        //CALL

    }

    override fun onPause() {

        super.onPause()
        showToast("onPause")
        Log.d("IntentLifeCycleActivity", "onPause")
        textLifeCycle.text = textLifeCycle.text.toString() + "\n onPause"

        //    status = Status.Offline
        //  if(Video ==ON) {
        //Pause()
        //  }
        //CALL.DROP

    }

    override fun onStop() {
        super.onStop()
        showToast("onStop")
        Log.d("IntentLifeCycleActivity", "onStop")
        textLifeCycle.text = textLifeCycle.text.toString() + "\n onStop"


    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy")
        Log.d("IntentLifeCycleActivity", "onDestroy")
        textLifeCycle.text = textLifeCycle.text.toString() + "\n onDestroy"


    }

    override fun onRestart() {
        super.onRestart()
        showToast("onRestart")

        Log.d("IntentLifeCycleActivity", "onRestart")
        textLifeCycle.text = textLifeCycle.text.toString() + "\n onRestart"


    }

    private fun showToast(text: String) {
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        //Colour
        toast.show()

    }
}