package com.theta.RecyclerView

import com.theta.network.MyStudent

interface OnItemClick {
    fun onClick(student: MyStudent)
}