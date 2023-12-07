package com.rakha.example.finalnewsapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.rakha.example.finalnewsapp.data.model.NewsResponse
import com.rakha.example.finalnewsapp.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {

    val CnnEntertaimentNews: LiveData<NewsResponse> = repository.CnnEntertaimentNews
    val CnnEcoNews: LiveData<NewsResponse> = repository.CnnEcoNews
    val CnnTechNews: LiveData<NewsResponse> = repository.CnnTechNews
    val CnbcEnreuNews: LiveData<NewsResponse> = repository.CnbcEntreuNews
    val CnbcLifeNews: LiveData<NewsResponse> = repository.CnbcLifeNews
    val CnbcTechNews: LiveData<NewsResponse> = repository.CnbcTechNews
    val OkezoneAutoNews: LiveData<NewsResponse> = repository.OkezoneAutoNews
    val OkezoneEcoNews: LiveData<NewsResponse> = repository.OkezoneEcoNews
    val OkezoneTechNews: LiveData<NewsResponse> = repository.OkezoneTechNews
    val isLoading: LiveData<Boolean> = repository.isLoading

    fun getCnnEntertaimentNews() {
        repository.getCnnEntertaimentNews()
    }

    fun getCnnEcoNews() {
        repository.getCnnEcoNews()
    }

    fun getCnnTechNews() {
        repository.getCnnTechNews()
    }

    fun getCnbcEntreuNews() {
        repository.getCnbcEntreuNews()
    }

    fun getCnbcLifeNews() {
        repository.getCnbcLifeNews()
    }

    fun getCnbcTechNews() {
        repository.getCnbcTechNews()
    }

    fun getOkezoneAutoNews() {
        repository.getOkezoneAutoNews()
    }

    fun getOkezoneEcoNews() {
        repository.getOkezoneEcoNews()
    }

    fun getOkezoneTechNews() {
        repository.getOkezoneTechNews()
    }

}