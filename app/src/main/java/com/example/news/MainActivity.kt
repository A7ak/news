package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.viewmodel.Viewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<Viewmodel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getNewsApi()

        viewModel.newLiveData.observe(this) {
            it.articles

        }
    }

    private fun getNewsApi() {
      viewModel.getNews()
    }
}