package com.alfsuace.dam2024.features.superhero.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alfsuace.dam2024.R

class SuperHeroActivity : AppCompatActivity() {
    private val superheroFactory: SuperheroFactory = SuperheroFactory()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superhero)
        val viewModel = superheroFactory.buildViewModel()
        val superheroes = viewModel.viewCreated()
        Log.d("@dev", superheroes.toString())
    }
}