package com.example.news.repository

import com.example.news.interfaces.MyRepo
import com.example.news.model.NewsRes
import com.example.news.service.Service
import retrofit2.Response
import javax.inject.Inject
class MyRepoImpl @Inject constructor(val service: Service) : MyRepo {
    override suspend fun getNews(): Response<NewsRes> {
        return service.getNews(apikey = "5a757f5735a14bfb8c90a76934d4ceb0", country = "us")
    }
}
