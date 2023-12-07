package com.rakha.example.finalnewsapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rakha.example.finalnewsapp.R
import com.rakha.example.finalnewsapp.data.model.PostsItem
import com.rakha.example.finalnewsapp.databinding.ItemRowNewsBinding
import com.rakha.example.finalnewsapp.ui.DetailNews
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.Locale

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){

    private val listNews = ArrayList<PostsItem>()

    fun setData(list: List<PostsItem>?) {
        listNews.clear()
        if (list != null) {
            listNews.addAll(list)
        }
        notifyItemRangeChanged(0, listNews.size)
    }

    class MyViewHolder(val binding: ItemRowNewsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(ItemRowNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataNews = listNews[position]

        val dateTimeString = dataNews.pubDate
        val dateTimeFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val myDateFormat = SimpleDateFormat("EEE, dd MMMM | HH:mm", Locale.getDefault())

        val myDate = myDateFormat.format(date)

        holder.binding.apply {
            tvSource.text = dataNews.description
            tvTitle.text = dataNews.title
            tvDate.text = myDate

            Picasso.get()
                .load(dataNews.thumbnail)
                .fit()
                .centerInside()
                .placeholder(R.drawable.ic_logo)
                .into(imgNews)
        }

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailNews::class.java)
            intent.putExtra(DetailNews.DATA_NEWS, dataNews)
            intent.putExtra(DetailNews.DATE_NEWS, date)
            holder.itemView.context.startActivity(intent)
        }

    }

}