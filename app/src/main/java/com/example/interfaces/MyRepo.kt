package com.example.interfaces

import com.example.model.NewsRes
import retrofit2.Response

interface MyRepo {
    suspend fun getNews(): Response<NewsRes>
}

