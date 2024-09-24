package com.alfsuace.dam2024.features.superhero.data

import com.alfsuace.dam2024.features.superhero.data.remote.SuperheroMockDataRepository
import com.alfsuace.dam2024.features.superhero.domain.Superhero
import com.alfsuace.dam2024.features.superhero.domain.SuperheroRepository

class SuperheroDataRepository(private val superheroMockDataRepository: SuperheroMockDataRepository) :
    SuperheroRepository {
    override fun getAllSuperheroes(): List<Superhero> {
        return superheroMockDataRepository.getSuperheroes()
    }

    override fun getSuperheroById(id: Int): Superhero? {
        return superheroMockDataRepository.getSuperheroes().firstOrNull {
            it.id == id
        }
    }
}