package com.example.news.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import com.example.news.databinding.NewsItemBinding
import com.example.news.model.Article

class NewAdaptor(val articles: List<Article>, val onClick: (String) -> Unit) :
    Adapter<NewAdaptor.ViewHolder>() {

    inner class ViewHolder(private val binding: NewsItemBinding, onClick: (String) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(article: Article) {

            binding.title.text = article.title
            binding.description.text = article.description

            Glide.with(binding.root.context)
                .load(article.urlToImage)
                .into(binding.image)


            binding.root.setOnClickListener {
                onClick.invoke(article.url)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewAdaptor.ViewHolder {
        val binding = NewsItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: NewAdaptor.ViewHolder, position: Int) {
        holder.bindData(articles[position])
    }

    override fun getItemCount(): Int {
        return articles.size
    }
}
