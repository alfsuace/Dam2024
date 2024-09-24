package com.alfsuace.dam2024.features.superhero.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiResource {
    private val urlEndPoint = "https://avilalive.sitehub.es/api/v1/"
    private var apiEndPoint: SuperheroApiServices

    init {
        apiEndPoint = buildApiEndPoint()
    }

    private fun buildClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buildApiEndPoint(): SuperheroApiServices {
        return buildClient().create(SuperheroApiServices::class.java)
    }

    suspend fun getAllSuperheroes(): List<SuperheroApiModel>? {
        return apiEndPoint.getAllSuperheroes().body()

    }

    suspend fun getResource(id: Int): SuperheroApiModel? {
        return apiEndPoint.getSuperHeroById(id).body()

    }
}