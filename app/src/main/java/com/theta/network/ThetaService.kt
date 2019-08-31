package com.theta.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET




interface ThetaService {


       @GET("AllStudentsList")
    fun getAllStudents():Call<StudentResponse>

//    @GET("Login")
//    fun loginUser():Call<LoginResponse>


    // http://thetakotlin.azurewebsites.net/Home/AllStudentsList
    companion object {

        private var retrofit: Retrofit? = null
        val BASE_URL = "http://thetakotlin.azurewebsites.net/Home/"

        fun getRetrofitInstance(): ThetaService? {
            if (retrofit == null) {
                // New instance create
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit?.create(ThetaService::class.java)

        }
    }
}
