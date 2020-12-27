package com.task.dindinn.main.domain

import com.task.dindinn.main.data.ProductsResponse

interface IMainRepo {
    suspend fun getProducts(): ProductsResponse
}