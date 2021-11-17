package com.faircorp2.model

import retrofit2.Call
import retrofit2.http.*

interface BuildingApiService {
    @GET("buildings")
    fun findAll(): Call<List<BuildingDto>>

    @GET("buildings")
    fun findAll(@Query("sort") sort: String): Call<List<BuildingDto>>

    @GET("buildings/{building_id}")
    fun findById(@Path("id") id: Long): Call<BuildingDto>

    @PUT("buildings/{building_id}")
    fun updateHeater(@Path("id") id: Long, @Body heater: HeaterDto): Call<BuildingDto>


}