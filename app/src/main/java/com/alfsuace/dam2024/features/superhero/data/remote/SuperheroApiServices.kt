package com.alfsuace.dam2024.features.superhero.data.remote


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SuperheroApiServices {
    @GET("all.json")
    suspend fun getAllSuperheroes(): Response<List<SuperheroApiModel>>

    @GET("all/{id}.json")
    suspend fun getSuperHeroById(@Path("id") id: Int): Response<SuperheroApiModel>
}