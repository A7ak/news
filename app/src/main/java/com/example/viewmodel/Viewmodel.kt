package com.example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.interfaces.MyRepo
import com.example.model.NewsRes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Viewmodel @Inject constructor(
    private val myRepo: MyRepo
) : ViewModel() {
    private val _newsLiveData = MutableLiveData<NewsRes>()
    val newLiveData: LiveData<NewsRes> get() = _newsLiveData

    fun getNews() {
        viewModelScope.launch() {
            _newsLiveData.value = myRepo.getNews().body()
        }
    }
}