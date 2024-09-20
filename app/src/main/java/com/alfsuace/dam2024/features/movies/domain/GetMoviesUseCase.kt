package com.alfsuace.dam2024.features.movies.domain

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke(): List<Movie>{
        return movieRepository.getMovies()
    }

}