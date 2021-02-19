package com.example.apiretrofit.model

import com.example.apiretrofit.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET("api")
    fun getUser(@Query("user_id") id:Int):Call<User>
}