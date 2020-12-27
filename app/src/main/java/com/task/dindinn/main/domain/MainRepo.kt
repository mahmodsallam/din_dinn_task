package com.task.dindinn.main.domain

import com.task.dindinn.main.data.MainRemoteDS
import com.task.dindinn.main.data.ProductsResponse
import javax.inject.Inject

class MainRepo @Inject constructor(private val mainRemoteDS: MainRemoteDS) : IMainRepo {
    override suspend fun getProducts(): ProductsResponse {
        return mainRemoteDS.getProducts()
    }
}