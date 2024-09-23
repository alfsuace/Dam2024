package com.alfsuace.dam2024.features.superhero.presentation

import androidx.lifecycle.ViewModel
import com.alfsuace.dam2024.features.superhero.domain.GetSuperheroesUseCase
import com.alfsuace.dam2024.features.superhero.domain.Superhero

class SuperheroViewModel(private val superheroesUseCase: GetSuperheroesUseCase) : ViewModel() {

    fun viewCreated(): List<Superhero> {
        return superheroesUseCase.invoke()
    }

}