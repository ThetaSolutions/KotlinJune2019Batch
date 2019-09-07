package com.theta.RecyclerView

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.theta.androidkotlin.R
import com.theta.classes.Student
import com.theta.network.MyStudent
import com.theta.network.ThetaService
import kotlinx.android.synthetic.main.activity_recycler_view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecyclerViewActivity : AppCompatActivity()
    , SwipeRefreshLayout.OnRefreshListener, OnItemClick {


    val myStudentAdapter = MyStudentAdapter(this, this)
    val studentAdapter = StudentAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        progressBar.visibility = View.VISIBLE
        val manager = LinearLayoutManager(this)
        recyclerViewStudents.layoutManager = manager
        recyclerViewStudents.adapter = myStudentAdapter
        refresh.setOnRefreshListener(this)
        onRefresh()

    }

    override fun onRefresh() {
        refresh.isRefreshing = true

        getStudentListFromServer()
        //    getStudentListLocally()
    }

    override fun onClick(student: MyStudent) {
        //Go to Next Activity using Intent.

        Toast.makeText(this, student.firstName, Toast.LENGTH_LONG).show()

    }

    fun setAdapter(studentList: ArrayList<MyStudent>) {
        myStudentAdapter.addStudentList(studentList)
        if (studentList.size == 0) {
            emptyText.visibility = View.VISIBLE
        }
        progressBar.visibility = View.GONE
        refresh.isRefreshing = false


    }


    private fun getStudentListFromServer() {

        // Get the Student list from the server
        val service = ThetaService.getRetrofitInstance()
        val call = service?.getAllStudents()

        call?.enqueue(object : Callback<List<MyStudent>> {
            override fun onFailure(call: Call<List<MyStudent>>, t: Throwable) {
                Toast.makeText(this@RecyclerViewActivity, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<List<MyStudent>>,
                response: Response<List<MyStudent>>
            ) {
                // Call Successfull, Data Successfuly Received
                if (response.isSuccessful) {
                    setAdapter(response.body() as ArrayList<MyStudent>)
                    //   setAdapter(arrayListOf<MyStudent>())
                }
            }
        })
    }

    private fun getStudentListLocally() {
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

        studentAdapter.addStudentList(studentList)
        studentAdapter.notifyDataSetChanged()
    }
}
