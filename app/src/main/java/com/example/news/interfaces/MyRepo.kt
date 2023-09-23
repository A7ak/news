package com.example.news.interfaces

import com.example.news.model.NewsRes
import retrofit2.Response

interface MyRepo {
    suspend fun getNews(): Response<NewsRes>
}

