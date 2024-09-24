package com.alfsuace.dam2024.features.movies.data.remote

import com.alfsuace.dam2024.features.movies.domain.Movie

class MovieMockRemoteDataSource {

    val moviesList = listOf(
        Movie("1", "title1", "poster1"),
        Movie("2", "title2", "poster2"),
        Movie("3", "title3", "poster3"),
        Movie(title = "title4", poster = "poster4", id = "4")
    )

    fun getMovies(): List<Movie> {
        return moviesList
    }

    fun getMovieById(id: String): Movie? {
        return moviesList.firstOrNull {
            it.id == id
        }
    }

}