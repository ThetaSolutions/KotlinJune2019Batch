package com.theta.RecyclerView

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.theta.androidkotlin.R
import com.theta.classes.Student
import kotlinx.android.synthetic.main.student_item_view.view.*

class StudentAdapter(val context: Context) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    var studentList: ArrayList<Student> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): StudentViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.student_item_view, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: StudentViewHolder, position: Int) {

        val student: Student = studentList.get(position)
        val name: TextView = viewHolder.itemView.student_name
        val lastName: TextView = viewHolder.itemView.student_lastName

        name.text = student.name
        lastName.text = student.lastName

    }

    fun addStudentList(studentListFromActivity: ArrayList<Student>) {
        studentList = studentListFromActivity
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}