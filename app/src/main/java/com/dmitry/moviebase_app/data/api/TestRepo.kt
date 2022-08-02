package com.dmitry.moviebase_app.data.api

import javax.inject.Inject

class TestRepo @Inject constructor(private val service: ApiService) {
    suspend fun getSearch() = service.getSearch("dune")
}