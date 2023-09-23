package com.example.service

import com.example.model.NewsRes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("top-headlines")
    suspend fun getNews(
        @Query("apiKey") apikey: String,
        @Query("country") country: String
    ): Response<NewsRes>

}