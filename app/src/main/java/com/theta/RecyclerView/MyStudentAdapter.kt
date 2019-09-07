package com.theta.RecyclerView

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.theta.androidkotlin.R
import com.theta.network.MyStudent
import kotlinx.android.synthetic.main.my_student_item_view.view.*

class MyStudentAdapter(val context: Context, val listener: OnItemClick) :
    RecyclerView.Adapter<MyStudentAdapter.StudentViewHolder>() {

    var studentList: ArrayList<MyStudent> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): StudentViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.my_student_item_view, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: StudentViewHolder, position: Int) {

        val student: MyStudent = studentList.get(position)
        val name: TextView = viewHolder.itemView.my_student_name
        val phone: TextView = viewHolder.itemView.my_student_phoneNumber
        val email: TextView = viewHolder.itemView.my_student_email
        val training: TextView = viewHolder.itemView.my_student_training

        name.text = student.firstName
        phone.text = student.phone
        email.text = student.emailAddress
        training.text = student.courseTraining

        viewHolder.itemView.setOnClickListener {
            listener.onClick(student)
        }

    }

    fun addStudentList(studentListFromActivity: ArrayList<MyStudent>) {
        studentList = studentListFromActivity
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}