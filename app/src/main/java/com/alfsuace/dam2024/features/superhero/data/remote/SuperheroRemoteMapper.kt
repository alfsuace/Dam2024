package com.alfsuace.dam2024.features.superhero.data.remote

import com.alfsuace.dam2024.features.superhero.domain.Appearance
import com.alfsuace.dam2024.features.superhero.domain.Biography
import com.alfsuace.dam2024.features.superhero.domain.Connections
import com.alfsuace.dam2024.features.superhero.domain.Images
import com.alfsuace.dam2024.features.superhero.domain.Powerstats
import com.alfsuace.dam2024.features.superhero.domain.Superhero
import com.alfsuace.dam2024.features.superhero.domain.Work

fun SuperheroApiModel.toModel(): Superhero {
    return Superhero(
        this.id,
        this.name,
        this.slug,
        this.powerstats.toModel(),
        this.appearance.toModel(),
        this.biography.toModel(),
        this.work.toModel(),
        this.connections.toModel(),
        this.images.toModel()
    )
}

fun PowerstatsApiModel.toModel(): Powerstats {
    return Powerstats(
        this.intelligence,
        this.strength,
        this.speed,
        this.durability,
        this.power,
        this.combat
    )
}

fun AppearanceApiModel.toModel(): Appearance {
    return Appearance(
        this.gender,
        this.race ?: "Unknown",
        this.height,
        this.weight,
        this.eyeColor,
        this.hairColor
    )
}

fun BiographyApiModel.toModel(): Biography {
    return Biography(
        this.fullName ?: "Unknown",
        this.alterEgos,
        this.aliases,
        this.placeOfBirth ?: "Unknow",
        this.firstAppearance,
        this.publisher ?: "Unknow",
        this.alignment
    )
}

fun WorkApiModel.toModel(): Work {
    return Work(
        this.occupation,
        this.base
    )
}

fun ConnectionsApiModel.toModel(): Connections {
    return Connections(
        this.groupAffiliation,
        this.relatives
    )
}

fun ImagesApiModel.toModel(): Images {
    return Images(
        this.xs,
        this.sm,
        this.md,
        this.lg
    )
}
