package com.example.module

import com.example.service.RetrofitBuilder
import com.example.service.Service
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