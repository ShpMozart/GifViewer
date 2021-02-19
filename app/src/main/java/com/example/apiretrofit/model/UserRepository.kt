package com.example.apiretrofit.model

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

    class UserRepository {
        private val timeOut:Long = 30
        fun Client():OkHttpClient{
            return OkHttpClient().newBuilder()
                .addInterceptor(HttpLoggingInterceptor()
                    .apply { level=HttpLoggingInterceptor.Level.BODY })
                .connectTimeout(timeOut,TimeUnit.SECONDS)
                .writeTimeout(timeOut,TimeUnit.SECONDS)
                .readTimeout(timeOut,TimeUnit.SECONDS)
                .build()
        }
        fun getRetrofit():Retrofit{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Const.BASE_URL)
                .client(Client())
                .build()
        }
}