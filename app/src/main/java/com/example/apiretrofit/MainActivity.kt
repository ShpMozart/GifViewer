package com.example.apiretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.apiretrofit.model.User
import com.example.apiretrofit.model.UserApi
import com.example.apiretrofit.model.UserRepository
import com.example.apiretrofit.viewmodel.UserviewModel
import com.shashank.sony.fancytoastlib.FancyToast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
private lateinit var  viewModel: UserviewModel
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ///////
        viewModel = ViewModelProvider(this).get(UserviewModel::class.java)
        ///////


    }
}
