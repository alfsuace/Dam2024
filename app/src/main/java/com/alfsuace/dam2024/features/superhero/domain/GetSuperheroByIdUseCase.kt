package com.alfsuace.dam2024.features.superhero.domain

class GetSuperheroByIdUseCase(private val superheroRepository: SuperheroRepository) {

    suspend operator fun invoke(id: Int): Superhero? {
        return superheroRepository.getSuperheroById(id)
    }

}