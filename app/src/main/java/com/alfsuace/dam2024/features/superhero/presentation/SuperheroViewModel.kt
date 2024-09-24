package com.alfsuace.dam2024.features.superhero.presentation

import androidx.lifecycle.ViewModel
import com.alfsuace.dam2024.features.superhero.domain.GetSuperheroByIdUseCase
import com.alfsuace.dam2024.features.superhero.domain.GetSuperheroesUseCase
import com.alfsuace.dam2024.features.superhero.domain.Superhero

class SuperheroViewModel(
    private val superheroesUseCase: GetSuperheroesUseCase,
    private val superheroByIdUseCase: GetSuperheroByIdUseCase
) : ViewModel() {

    fun viewCreated(): List<Superhero> {
        return superheroesUseCase.invoke()
    }

    fun viewCreatedById(id: Int): Superhero? {
        return superheroByIdUseCase.invoke(id)
    }

}