package com.geeks.lesson_2_5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveAppService {

    @GET("getPercentage")
    fun getPercentage(
        @Header("X-Rapidapi-Key") key: String,
        @Header("X-Rapidapi-Host") host: String,
        @Query("fname") firstName: String,
        @Query("sname") secondName: String
    ): Call<LoveResult>
}
