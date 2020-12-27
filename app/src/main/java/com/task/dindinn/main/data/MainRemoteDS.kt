package com.task.dindinn.main.data

import retrofit2.http.GET

interface MainRemoteDS {
    @GET("url")
    suspend fun getProducts(): ProductsResponse
}