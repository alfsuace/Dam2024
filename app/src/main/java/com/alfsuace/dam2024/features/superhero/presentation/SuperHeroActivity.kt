package com.alfsuace.dam2024.features.superhero.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.alfsuace.dam2024.R
import kotlinx.coroutines.launch

class SuperHeroActivity : AppCompatActivity() {
    private val superheroFactory: SuperheroFactory = SuperheroFactory()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superhero)
        val viewModel = superheroFactory.buildViewModel()
        lifecycleScope.launch {
            val superheroes = viewModel.viewCreated()
            Log.d("@dev", superheroes.toString())
//            val id = 2
//            val heroById = viewModel.viewCreatedById(id)
//            Log.d("@dev", heroById.toString())
        }
    }
}