package com.example.viewmodel

import androidx.lifecycle.ViewModel
import com.example.interfaces.MyRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class NewsViewmodel @Inject constructor(
    private val myRepo: MyRepo
) : ViewModel() {
    fun getNews() = myRepo.getNews()
}