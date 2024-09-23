package com.alfsuace.dam2024.features.superhero.presentation

import com.alfsuace.dam2024.features.superhero.data.SuperheroDataRepository
import com.alfsuace.dam2024.features.superhero.data.remote.SuperheroMockDataRepository
import com.alfsuace.dam2024.features.superhero.domain.GetSuperheroesUseCase

class SuperheroFactory {

    fun buildViewModel(): SuperheroViewModel {
        return SuperheroViewModel(
            GetSuperheroesUseCase(
                SuperheroDataRepository(
                    SuperheroMockDataRepository()
                )
            )
        )
    }

}