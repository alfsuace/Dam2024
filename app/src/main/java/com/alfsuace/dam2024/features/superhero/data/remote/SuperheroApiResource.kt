package com.alfsuace.dam2024.features.superhero.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SuperheroApiResource {
    private val urlEndPoint = "https://akabab.github.io/superhero-api/api/"
    private var apiEndPoint: SuperheroApiServices

    init {
        apiEndPoint = buildApiEndPoint()
    }

    private fun buildApiEndPoint(): SuperheroApiServices {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(SuperheroApiServices::class.java)
    }

    suspend fun getAllSuperheroes(): List<SuperheroApiModel>? {
        return apiEndPoint.getAllSuperheroes().body()

    }

    suspend fun getSuperheroById(id: Int): SuperheroApiModel? {
        return apiEndPoint.getSuperHeroById(id)?.body()

    }
}