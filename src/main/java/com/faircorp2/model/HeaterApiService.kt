package com.faircorp2.model

import retrofit2.Call
import retrofit2.http.*

interface HeaterApiService {
    @GET("heaters")
    fun findAll(): Call<List<HeaterDto>>

    @GET("heaters")
    fun findAll(@Query("sort") sort: String): Call<List<HeaterDto>>

    @GET("heaters/{heater_id}")
    fun findById(@Path("id") id: Long): Call<HeaterDto>

    @PUT("heaters/{heater_id}")
    fun update(@Path("id") id: Long, @Body heater: HeaterDto): Call<HeaterDto>

}
