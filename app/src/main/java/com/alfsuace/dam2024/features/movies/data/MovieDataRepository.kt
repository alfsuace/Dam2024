package com.alfsuace.dam2024.features.movies.data

import com.alfsuace.dam2024.features.movies.data.remote.MovieMockRemoteDataSource
import com.alfsuace.dam2024.features.movies.domain.Movie
import com.alfsuace.dam2024.features.movies.domain.MovieRepository

class MovieDataRepository(private val mockRemoteDataSource: MovieMockRemoteDataSource): MovieRepository {

    override fun getMovies(): List<Movie>{
        return  mockRemoteDataSource.getMovies()
    }

    override fun getMovieById(id: String): Movie? {
        return mockRemoteDataSource.getMovieById(id)
    }

}