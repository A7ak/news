package com.example.news.module

import com.example.news.interfaces.MyRepo
import com.example.news.repository.MyRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepoModule {
    @Binds
    abstract fun bindMyRepo(myRepoImpl: MyRepoImpl): MyRepo
}