package com.alfsuace.dam2024.features.superhero.domain

interface SuperheroRepository {

    suspend fun getAllSuperheroes(): List<Superhero>

    suspend fun getSuperheroById(id: Int): Superhero?
}