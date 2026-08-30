package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesDetailPalParkEncountersInner(
    val area: AbilityDetailPokemonInnerPokemon,
    val baseScore: kotlin.Int,
    val rate: kotlin.Int
)
