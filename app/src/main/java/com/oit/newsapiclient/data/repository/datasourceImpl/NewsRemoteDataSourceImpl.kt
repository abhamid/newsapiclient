package com.oit.newsapiclient.data.repository.datasourceImpl

import com.oit.newsapiclient.data.api.NewsAPIService
import com.oit.newsapiclient.data.model.NewsAPIResponse
import com.oit.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response
import retrofit2.http.Query

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<NewsAPIResponse> =
        newsAPIService.getTopHeadlines(country, page)
}