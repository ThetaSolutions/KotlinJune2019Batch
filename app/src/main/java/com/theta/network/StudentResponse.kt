package com.theta.network

import com.google.gson.annotations.SerializedName

data class StudentResponse(val studentList : MyStudent? = null)

class MyStudent {

    @SerializedName("ID")
    var id = 0

    @SerializedName("Name")
    var firstName = ""

    @SerializedName("Training")
    var courseTraining = ""

    @SerializedName("PhoneNo")
    var phone = ""

    @SerializedName("Email")
    var emailAddress = ""

}