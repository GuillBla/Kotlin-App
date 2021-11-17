package com.faircorp2.model

import retrofit2.Call
import retrofit2.http.*

interface WindowApiService {
    @GET("windows")
    fun findAll(): Call<List<WindowDto>>

    @GET("windows")
    fun findAll(@Query("sort") sort: String): Call<List<WindowDto>>

    @GET("windows/{id}")
    fun findById(@Path("id") id: Long): Call<WindowDto>

    @PUT("windows/{id}")
    fun update(@Path("id") id: Long, @Body window: WindowDto): Call<WindowDto>

}
