package com.example.pathoflight

import retrofit2.Call
import retrofit2.http.GET

interface ApiService_Surahs {
    @GET("surahs")
    fun getSurahs(): Call<List<Surah>>
}