package com.faircorp2.model

import retrofit2.Call
import retrofit2.http.*

interface RoomApiService {
    @GET("rooms")
    fun findAll(): Call<List<RoomDto>>

    @GET("rooms")
    fun findAll(@Query("sort") sort: String): Call<List<RoomDto>>

    @GET("rooms/{room_id}")
    fun findById(@Path("id") id: Long): Call<RoomDto>

    @PUT("rooms/{room_id}")
    fun update(@Path("id") id: Long, @Body room: RoomDto): Call<RoomDto>

}
