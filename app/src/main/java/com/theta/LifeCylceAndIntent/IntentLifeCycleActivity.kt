package com.theta.LifeCylceAndIntent

import android.content.Intent
import android.os.Bundle
import android.os.Debug
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import android.view.Gravity
import com.theta.androidkotlin.ActivityViewsWIthIds.LogicActivity
import kotlinx.android.synthetic.main.activity_lifecycle.*


class IntentLifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.theta.androidkotlin.R.layout.activity_lifecycle)

        showToast("onCreate")
        Log.d("IntentLifeCycleActivity", "onCreate")
        textLifeCycle.setText("OnCreate")

        buttonClick.setOnClickListener {
            // INTENT

            val intent = Intent(this, LogicActivity::class.java)
          //  intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            finish()


//   public Intent intent = new Intent(this, LogicActivity.class)




        }


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