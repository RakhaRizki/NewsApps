package com.rakha.example.finalnewsapp.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rakha.example.finalnewsapp.data.model.NewsResponse
import com.rakha.example.finalnewsapp.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {

    private val _CnnEntertaimentNews = MutableLiveData<NewsResponse>()
    val CnnEntertaimentNews: LiveData<NewsResponse> = _CnnEntertaimentNews

    private val _CnnEcoNews = MutableLiveData<NewsResponse>()
    val CnnEcoNews: LiveData<NewsResponse> = _CnnEcoNews

    private val _CnnTechNews = MutableLiveData<NewsResponse>()
    val CnnTechNews: LiveData<NewsResponse> = _CnnTechNews

    private val _CnbcEntreuNews = MutableLiveData<NewsResponse>()
    val CnbcEntreuNews: LiveData<NewsResponse> = _CnbcEntreuNews

    private val _CnbcLifeNews = MutableLiveData<NewsResponse>()
    val CnbcLifeNews: LiveData<NewsResponse> = _CnbcLifeNews

    private val _CnbcTechNews = MutableLiveData<NewsResponse>()
    val CnbcTechNews: LiveData<NewsResponse> = _CnbcTechNews

    private val _OkezoneAutoNews = MutableLiveData<NewsResponse>()
    val OkezoneAutoNews: LiveData<NewsResponse> = _OkezoneAutoNews

    private val _OkezoneEcoNews = MutableLiveData<NewsResponse>()
    val OkezoneEcoNews: LiveData<NewsResponse> = _OkezoneEcoNews

    private val _OkezoneTechNews = MutableLiveData<NewsResponse>()
    val OkezoneTechNews: LiveData<NewsResponse> = _OkezoneTechNews

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun getCnnEntertaimentNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnnEntertainmentNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnnEntertaimentNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnnEcoNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnnEcoNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnnEcoNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnnTechNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnnTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnnTechNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcEntreuNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnbcEntreuNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnbcEntreuNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcLifeNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnbcLifeNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnbcLifeNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcTechNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnbcTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnbcTechNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getOkezoneAutoNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getOkezoneAutoNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _OkezoneAutoNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getOkezoneEcoNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getOkezoneEcoNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _OkezoneEcoNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getOkezoneTechNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getOkezoneTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _OkezoneTechNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }
}