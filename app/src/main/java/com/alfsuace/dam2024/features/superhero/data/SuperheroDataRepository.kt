package com.alfsuace.dam2024.features.superhero.data

import com.alfsuace.dam2024.features.superhero.data.remote.SuperheroApiRemoteDataRepository
import com.alfsuace.dam2024.features.superhero.domain.Superhero
import com.alfsuace.dam2024.features.superhero.domain.SuperheroRepository

class SuperheroDataRepository(private val superheroApiRemoteDataRepository: SuperheroApiRemoteDataRepository) :
    SuperheroRepository {
    override suspend fun getAllSuperheroes(): List<Superhero> {
        return superheroApiRemoteDataRepository.getAllHeroes()
    }

    override suspend fun getSuperheroById(id: Int): Superhero? {
        return superheroApiRemoteDataRepository.getHeroById(id)
    }
}