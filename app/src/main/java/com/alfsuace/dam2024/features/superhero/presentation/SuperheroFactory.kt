package com.alfsuace.dam2024.features.superhero.presentation

import com.alfsuace.dam2024.features.superhero.data.SuperheroDataRepository
import com.alfsuace.dam2024.features.superhero.data.remote.SuperheroApiRemoteDataRepository
import com.alfsuace.dam2024.features.superhero.data.remote.SuperheroApiResource
import com.alfsuace.dam2024.features.superhero.domain.GetSuperheroByIdUseCase
import com.alfsuace.dam2024.features.superhero.domain.GetSuperheroesUseCase

class SuperheroFactory {

    fun buildViewModel(): SuperheroViewModel {
        val repo = SuperheroDataRepository(
            SuperheroApiRemoteDataRepository(SuperheroApiResource())
        )
        return SuperheroViewModel(
            GetSuperheroesUseCase(repo),
            GetSuperheroByIdUseCase(repo)
        )
    }

}