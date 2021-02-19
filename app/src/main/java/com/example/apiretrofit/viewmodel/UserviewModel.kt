package com.example.apiretrofit.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.example.apiretrofit.MainActivity
import com.example.apiretrofit.model.User
import com.example.apiretrofit.model.UserApi
import com.example.apiretrofit.model.UserRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserviewModel:ViewModel()
{
    private val _result = MutableLiveData<String>()
    val result: LiveData<String>
        get() = _result


    private val _answer = MutableLiveData<String>()
    val answer: LiveData<String>
        get() = _answer
/////////////////////////////////////////////////////////////////////////


    fun getUserData(id : Int){
        val userRepository: UserRepository =
            UserRepository()
        val call : Call<User> = userRepository.getRetrofit().create(UserApi::class.java).getUser(id)
        call.enqueue(object : Callback<User> {
            override fun onFailure(call: Call<User>?, t: Throwable?) {
                Log.w("Eror", t!!.message.toString())
            }

            override fun onResponse(call: Call<User>?, response: Response<User>?) {
                Log.w("okApi",response!!.body()!!.image.toString())
                Log.w("okApi",response!!.body()!!.forced.toString())
                Log.w("okApi",response!!.body()!!.answer.toString())

                _result.value = response!!.body()!!.image
                _answer.value = response.body().answer

                Log.w("linkcheck", _result.value.toString())




            }
        })

    }

}