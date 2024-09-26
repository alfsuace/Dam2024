package com.alfsuace.dam2024.features.superhero.domain

class GetSuperheroesUseCase(private val superheroRepository: SuperheroRepository) {


    suspend operator fun invoke(): List<Superhero> {
        return superheroRepository.getAllSuperheroes()
    }

}