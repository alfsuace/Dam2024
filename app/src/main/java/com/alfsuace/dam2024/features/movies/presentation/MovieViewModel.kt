package com.alfsuace.dam2024.features.movies.presentation

import androidx.lifecycle.ViewModel
import com.alfsuace.dam2024.features.movies.domain.GetMoviesUseCase
import com.alfsuace.dam2024.features.movies.domain.Movie

class MovieViewModel(private val getMoviesUseCase: GetMoviesUseCase):ViewModel() {

fun viewCreated(): List<Movie> {
    return getMoviesUseCase.invoke()
}

}