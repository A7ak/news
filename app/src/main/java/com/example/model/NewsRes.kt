package com.example.model

data class NewsRes(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)