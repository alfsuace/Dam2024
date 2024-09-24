package com.alfsuace.dam2024.features.movies.presentation

import androidx.lifecycle.ViewModel
import com.alfsuace.dam2024.features.movies.domain.GetMovieByIdUseCase
import com.alfsuace.dam2024.features.movies.domain.GetMoviesUseCase
import com.alfsuace.dam2024.features.movies.domain.Movie

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val getMovieByIdUseCase: GetMovieByIdUseCase
) : ViewModel() {

    fun viewCreated(): List<Movie> {
        return getMoviesUseCase.invoke()
    }


    fun itemSelected(movieId: String): Movie? {
        return getMovieByIdUseCase(movieId)
    }

}