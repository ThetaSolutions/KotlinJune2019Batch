package com.theta.sharedPreferences

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs() {
    val thetaPrefs = "com.theta.androidkotlin.prefs"


    public fun getSharedPrefs(context: Context): SharedPreferences? {
       val sharedPrefs = context.getSharedPreferences(thetaPrefs, 0)
        return sharedPrefs
    }
}