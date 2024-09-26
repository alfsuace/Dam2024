package com.alfsuace.dam2024.features.superhero.data.remote

import com.alfsuace.dam2024.features.superhero.domain.Superhero

class SuperheroApiRemoteDataRepository(private val superheroApiResource: SuperheroApiResource) {

    suspend fun getAllHeroes(): List<Superhero> {
        return superheroApiResource.getAllSuperheroes()?.map {
            it.toModel()
        } ?: emptyList()
    }


    suspend fun getHeroById(id: Int): Superhero? {
        return superheroApiResource.getSuperheroById(id)?.toModel()
    }

}