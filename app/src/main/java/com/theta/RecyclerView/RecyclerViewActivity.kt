package com.theta.RecyclerView

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.theta.androidkotlin.R
import com.theta.classes.Student
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val studentList: ArrayList<Student> = getStudentList()

        val manager = LinearLayoutManager(this)

        recyclerViewStudents.layoutManager = manager
        val adapter= StudentAdapter(this)
        adapter.addStudentList(studentList)

        recyclerViewStudents.adapter = adapter
    }


    fun getStudentList(): ArrayList<Student> {

        val studentList = arrayListOf<Student>()
        studentList.add(Student(name = "Salman", lastName = "Nazir"))
        studentList.add(Student(name = "Theta", lastName = "Solutions"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Usman", lastName = "Nazir"))
        studentList.add(Student(name = "Hassan", lastName = "Ali"))
        studentList.add(Student(name = "Mujahid", lastName = "Umer"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Sufyan", lastName = "Ahad"))
        studentList.add(Student(name = "Salman", lastName = "Nazir"))
        studentList.add(Student(name = "Theta", lastName = "Solutions"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Usman", lastName = "Nazir"))
        studentList.add(Student(name = "Hassan", lastName = "Ali"))
        studentList.add(Student(name = "Mujahid", lastName = "Umer"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Sufyan", lastName = "Ahad"))
        studentList.add(Student(name = "Salman", lastName = "Nazir"))
        studentList.add(Student(name = "Theta", lastName = "Solutions"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Usman", lastName = "Nazir"))
        studentList.add(Student(name = "Hassan", lastName = "Ali"))
        studentList.add(Student(name = "Mujahid", lastName = "Umer"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Sufyan", lastName = "Ahad"))
        studentList.add(Student(name = "Salman", lastName = "Nazir"))
        studentList.add(Student(name = "Theta", lastName = "Solutions"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Usman", lastName = "Nazir"))
        studentList.add(Student(name = "Hassan", lastName = "Ali"))
        studentList.add(Student(name = "Mujahid", lastName = "Umer"))
        studentList.add(Student(name = "Ali", lastName = "Ahmed"))
        studentList.add(Student(name = "Sufyan", lastName = "Ahad"))

        return studentList
    }
}
