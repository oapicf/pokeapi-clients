package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
    val minLevel: kotlin.Int,
    val maxLevel: kotlin.Int,
    val chance: kotlin.Int,
    val method: AbilityDetailPokemonInnerPokemon,
    val conditionValues: AbilityDetailPokemonInnerPokemon? = null
)
