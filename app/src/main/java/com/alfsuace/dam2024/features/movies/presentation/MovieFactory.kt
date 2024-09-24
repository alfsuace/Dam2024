package com.alfsuace.dam2024.features.movies.presentation

import com.alfsuace.dam2024.features.movies.data.MovieDataRepository
import com.alfsuace.dam2024.features.movies.data.remote.MovieMockRemoteDataSource
import com.alfsuace.dam2024.features.movies.domain.GetMovieByIdUseCase
import com.alfsuace.dam2024.features.movies.domain.GetMoviesUseCase

class MovieFactory {

    fun buildViewModel(): MovieViewModel {
        val repo = MovieDataRepository(MovieMockRemoteDataSource())
        return MovieViewModel(
            GetMoviesUseCase(repo),
            GetMovieByIdUseCase(repo)
        )
    }

}