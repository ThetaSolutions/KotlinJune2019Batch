package com.theta.fragments

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.theta.androidkotlin.R

class BottomNavigationActivity : AppCompatActivity() {

    //2- SupportFragmentManager
    val manager = supportFragmentManager

    //3- Prepare Transaction

    val transaction = manager.beginTransaction()

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                addHomeFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                addDashBoardFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                addNotificationFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_chats -> {
                addChatFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addChatFragment() {

    }

    private fun addNotificationFragment() {
        // 1- Preparing Fragment
        val notificationFragment = NotificationFragment()
//
//        //2- SupportFragmentManager
//        val manager = supportFragmentManager
//
//        //3- Prepare Transaction
//
//        val transaction = manager.beginTransaction()

        //4- Adding Fragment
        transaction.add(
            R.id.fragment_container, notificationFragment
        )
        //5- executing transaction
        transaction.commit()
    }

    private fun addDashBoardFragment() {
        // 1- Preparing Fragment
        val dashboardFragment = DashboardFragment()

//        //2- SupportFragmentManager
//        val manager = supportFragmentManager
//
//        //3- Prepare Transaction
//
//        val transaction = manager.beginTransaction()

        //4- Adding Fragment
        transaction.add(R.id.fragment_container, dashboardFragment)
        //5- executing transaction
        transaction.commit()
    }

    private fun addHomeFragment() {
        // 1- Preparing Fragment
        val homeFragment = HomeFragment()

        //4- Adding Fragment
        transaction.add(R.id.fragment_container, homeFragment)
        //5- executing transaction
        transaction.commit()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        addHomeFragment()
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
