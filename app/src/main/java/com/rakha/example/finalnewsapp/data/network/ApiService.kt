package com.rakha.example.finalnewsapp.data.network

import com.rakha.example.finalnewsapp.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/cnn/teknologi")
    fun getCnnTechNews(
    ) : Call<NewsResponse>

    @GET("/cnn/hiburan")
    fun getCnnEntertainmentNews(
    ) : Call<NewsResponse>

    @GET("/cnn/ekonomi")
    fun getCnnEcoNews(
    ) : Call<NewsResponse>

    @GET("/cnbc/tech")
    fun getCnbcTechNews(
    ) : Call<NewsResponse>

    @GET("/cnbc/entrepreneur")
    fun getCnbcEntreuNews(
    ) : Call<NewsResponse>

    @GET("/cnbc/lifestyle")
    fun getCnbcLifeNews(
    ) : Call<NewsResponse>

    @GET("/okezone/techno")
    fun getOkezoneTechNews(
    ) : Call<NewsResponse>

    @GET("/okezone/otomotif")
    fun getOkezoneAutoNews(
    ) : Call<NewsResponse>

    @GET("/okezone/economy")
    fun getOkezoneEcoNews(
    ) : Call<NewsResponse>

}