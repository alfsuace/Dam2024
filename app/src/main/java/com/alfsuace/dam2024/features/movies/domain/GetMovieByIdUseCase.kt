package com.alfsuace.dam2024.features.movies.domain

class GetMovieByIdUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke(id: String): Movie? {
        return movieRepository.getMovieById(id)
    }

}