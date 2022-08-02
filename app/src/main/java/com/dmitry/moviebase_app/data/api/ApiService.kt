package com.dmitry.moviebase_app.data.api

import com.dmitry.moviebase_app.model.SearchResponse
import com.dmitry.moviebase_app.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("")
    suspend fun getSearch(
        @Query("s") search: String,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    ) : Response<SearchResponse>
}