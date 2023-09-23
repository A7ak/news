package com.example.news.service

import com.example.news.model.NewsRes
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