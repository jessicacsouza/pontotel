package com.jessicasouza.pontotel.retrofit

import com.jessicasouza.pontotel.entities.JData
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface IService {

    @GET("pontotel-docs/data.json")
    fun appointmentList(): Call<JData>

    @FormUrlEncoded
    @POST("api/v1/appointments/save-rate")
    fun saveRate(
        @Field("serviceScore") serviceScore: Int, @Field("barberScore") barberScore: Int,
        @Field("barbershopScore") barbershopScore: Int, @Field("appointmentId") appointmentId: Long
    )
            : Call<ResponseBody>
}