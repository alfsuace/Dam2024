package com.alfsuace.dam2024.features.movies.domain

interface MovieRepository {
    fun getMovies(): List<Movie>
    fun getMovieById(id: String): Movie?
}