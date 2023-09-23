package com.example.repository

import com.example.interfaces.MyRepo
import javax.inject.Inject
class MyRepoImpl @Inject constructor() : MyRepo {
    override fun getNews(): String {
        return ""
    }


}
