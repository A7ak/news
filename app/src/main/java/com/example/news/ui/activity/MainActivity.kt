package com.example.news.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.news.R
import com.example.news.databinding.ActivityMainBinding
import com.example.news.model.Article
import com.example.news.ui.NewAdaptor
import com.example.news.viewmodel.Viewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<Viewmodel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getNewsApi()

        viewModel.newLiveData.observe(this) {
            setupNewsRv(it.articles)
        }
    }

    private fun setupNewsRv(articles: List<Article>) {
        binding.newRv.adapter = NewAdaptor(articles) {
            navigateToWebview(it)
        }
    }

    private fun navigateToWebview(url: String) {
        var intent = Intent(this,WebViewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    private fun getNewsApi() {
      viewModel.getNews()
    }
}