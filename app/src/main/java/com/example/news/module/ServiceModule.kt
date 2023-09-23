package com.example.news.module

import com.example.news.service.RetrofitBuilder
import com.example.news.service.Service
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    fun provideService(): Service {
        return RetrofitBuilder.service
    }
}