package com.example.news.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.news.R
import com.example.news.databinding.ActivityMainBinding
import com.example.news.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras?.getString("url")?.let {
            loadWebView(it)
        }
    }

    private fun loadWebView(url: String) {
        binding.webView.loadUrl(url)
        binding.webView.settings.javaScriptEnabled = true
        binding.webView.webViewClient = WebViewClient()
    }
}