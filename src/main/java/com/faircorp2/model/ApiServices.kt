package com.faircorp2.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService: WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://dev-mind.fr/training/android/")
            .build()
            .create(WindowApiService::class.java)
    }

    val roomsApiService: RoomApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://dev-mind.fr/training/android/")
            .build()
            .create(RoomApiService::class.java)
    }

    val heatersApiService: HeaterApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://dev-mind.fr/training/android/")
            .build()
            .create(HeaterApiService::class.java)
    }

    val buildingsApiService: BuildingApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://dev-mind.fr/training/android/")
            .build()
            .create(BuildingApiService::class.java)
    }
}