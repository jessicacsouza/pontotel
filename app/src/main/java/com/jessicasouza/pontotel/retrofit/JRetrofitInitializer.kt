package com.jessicasouza.pontotel.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JRetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://s3-sa-east-1.amazonaws.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun appointmentService() = retrofit.create(IService::class.java)

}