package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PalParkAreaDetailPokemonEncountersInner(
    val baseScore: kotlin.Int,
    val pokemonSpecies: AbilityDetailPokemonInnerPokemon,
    val rate: kotlin.Int
)
