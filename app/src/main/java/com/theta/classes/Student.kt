package com.theta.classes

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Student(
    age: Int = 0, val name: String, phoneNumber: Int = 0,
    height: Float = 0.0f, val lastName: String
) : Serializable

