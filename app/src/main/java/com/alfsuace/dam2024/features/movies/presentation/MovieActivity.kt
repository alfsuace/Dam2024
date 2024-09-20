package com.alfsuace.dam2024.features.movies.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alfsuace.dam2024.R
import com.alfsuace.dam2024.features.movies.data.MovieDataRepository
import com.alfsuace.dam2024.features.movies.data.remote.MovieMockRemoteDataSource
import com.alfsuace.dam2024.features.movies.domain.GetMoviesUseCase
import com.alfsuace.dam2024.features.movies.domain.MovieRepository

class MovieActivity : AppCompatActivity() {

    private val movieFactory : MovieFactory = MovieFactory()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}