package com.alfsuace.dam2024.features.superhero.domain

interface SuperheroRepository {

    fun getAllSuperheroes(): List<Superhero>

    fun getSuperheroById(id: Int): Superhero?
}