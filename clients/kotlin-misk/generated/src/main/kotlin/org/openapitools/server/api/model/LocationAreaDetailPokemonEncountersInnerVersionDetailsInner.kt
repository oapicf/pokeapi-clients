package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(
    val version: AbilityDetailPokemonInnerPokemon,
    val maxChance: kotlin.Int,
    val encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
)
