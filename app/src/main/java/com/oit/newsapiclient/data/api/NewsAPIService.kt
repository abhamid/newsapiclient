package com.oit.newsapiclient.data.api

import com.oit.newsapiclient.BuildConfig
import com.oit.newsapiclient.data.model.NewsAPIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country:String,
        @Query("page") page:Int,
        @Query("apiKey") apiKey:String = BuildConfig.API_KEY
    ): Response<NewsAPIResponse>
}