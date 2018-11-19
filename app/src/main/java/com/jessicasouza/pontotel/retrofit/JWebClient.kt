package com.jessicasouza.pontotel.retrofit

import com.jessicasouza.pontotel.entities.JData
import com.jessicasouza.pontotel.response.IResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class JWebClient() {

    fun appointmentList(appointmentResponse: IResponse) {
        val call = JRetrofitInitializer().appointmentService().appointmentList()

        call.enqueue(object : Callback<JData> {

            override fun onResponse(call: Call<JData>?, response: Response<JData>?) {
                response?.body()?.let {
                    val user: JData = it
                    appointmentResponse.success(user)
                }
            }

            override fun onFailure(call: Call<JData>?, t: Throwable?) {
            }
        })
    }
}