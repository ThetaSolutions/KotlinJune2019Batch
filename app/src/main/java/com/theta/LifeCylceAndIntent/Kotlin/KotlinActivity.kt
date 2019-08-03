package com.theta.LifeCylceAndIntent.Kotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import com.theta.androidkotlin.R

import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        kotlinVariables()
        varVsVal()
        concatinationInKotlin()
        dataTypes()
        convertDataTypes()
        mathOperators()
        incrementDecrement()
        LoopsWithRange()
        whenStatement()
        objectNullSafety()

    }

    private fun objectNullSafety() {
        var loginButton: ImageButton? = null

        loginButton?.getTag() // avoid null pointer exception

//        public button = new Button()
////        if (button != null) {
////            button.getTag()
////        }
    }

    private fun whenStatement() {
        val count = 100

        if (count > 100) {

        } else if (count < 100) {

        } else if (count == 100) {

        } else if (count == 50) {
            //
        }

        when (count) {
            100 -> {
            }
            1000 -> {
            }
            50 -> {
            }
        }


    }

    private fun LoopsWithRange() {

        //ArrayList
        val studentsName = arrayListOf<String>()
        studentsName.add("Jahangir")
        studentsName.add("Salman")
        studentsName.add("Ahmed")
        studentsName.add("Ali")
        studentsName.add("Umer")
        studentsName.add("Zeeshan")


        if (studentsName.contains("Salman")) {
            //
        } else if (studentsName.contains("Ali")) {
            //
        }



        Log.d("LoopsWithRange", studentsName.size.toString())

        //ForEach
        studentsName.forEach {
            Log.d("LoopsWithRange", it)
        }

        if (studentsName.contains("Salman")) {
            Log.d("LoopsWithRange", "Salman Found")
        }

        val myList = List<Int>(10) { 100 }

        for (studentCount in myList) {
            Log.d("ForLoop", studentCount.toString())
        }

        //With Range

        for (count in 5..10) {
            Log.d("LoopInRange", count.toString())
        }

//        for(int i = 5; i <10; i++) {
//
//        }

    }

    private fun incrementDecrement() {
        var a = 5
        var b = 6

        var result = 0
        result = a++ + b //12,16, -> 11 -> a= 6
        Log.d("incrementDecrement", result.toString())
        result = a++ + b // 11,12,-> 12 -> a = 7, b = 6
        Log.d("incrementDecrement", result.toString())
        Log.d("a", a.toString())
        result = a-- - b // -2, -1, -3 -> 1; a=6, b= 6
        Log.d("incrementDecrement", result.toString())

        result = a-- - b //-1, -2, 0,-> a= 5, b = 6
        Log.d("incrementDecrement", result.toString())

        result = a++ - b // -1,
        Log.d("incrementDecrement", result.toString())


    }

    private fun mathOperators() {
        val a = 5
        val b = 10
        val e = 17
        var result = 0
        var c = "5"
        var d = "10"

        result = a * b // 50
        result = a / b // 0
        result = e % a // 2,
        result = a + b // 15
        Log.d("a / b", result.toString())

        result = a - b // -5
        result = Integer.valueOf(c + d) //Integer.valueOf("510") -> 510
        Log.d("mathOperators", result.toString())

    }

    private fun convertDataTypes() {
        val age = "17"

        var myAge = Integer.valueOf(age) // String to Integer
        myAge = 17   //both are 17

        val phone = 123
        var phoneString = phone.toString() //Integer to String

    }

    private fun dataTypes() {
        var name: String = ""
        var age: Int = 5
        var height: Double = 5.5
        var depth: Float = 5.5f
        var isMale: Boolean = true
    }

    private fun concatinationInKotlin() {
        val firstName = "Theta"
        val secondName = "Solutions"

        val name = "$firstName$secondName"
        val name1 = firstName + secondName
        val age = 5

        Log.d("concatinationInKotlin", "$firstName$age$secondName")

    }

    private fun varVsVal() {
        var name = "Theta" // Variable
        val nameInstitute = "Theta" //Always start with Val

        name = "Theta Solutions"
        //  nameInstitute = "Theta SOlutions" //Not possible

        name = ""
        name = "adfgadsg"
        name = "asdg3563456"

        val DOB = "11/11/1990"

    }

    private fun kotlinVariables() {

        var age = 5    //Auto
        val age1: Int //Explicitly  declaraiton
        age1 = 7 // Initialization
        //   age1 = null //not possible
        //  public Int age1 = 5 in Java
        //     age1 = "Salman"  // Not Possible
        //     age = "Theta" //Not Possible

        //  age = null //not possible
        // Problem -> Null pointer exception

        val name = "Theta Solutions"
        val name1: String = "Theta Solutions"
        var name2: String? = "Theta Solutions"

        var name3 = ""
        //    name2 = null // possible

        //  name1 = null //not possible

        val height = 5.5
        val depth = 5.5f

        var numberOfStudents: Int? = 5 //null safety/check
        numberOfStudents = null  //Possible
        numberOfStudents = 10


        // Do something
        //if null -> crash
        Log.d("Activity", name1)
        Log.d("Activity", name2)


    }

}
