package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaDetailEncounterMethodRatesInner(
    val encounterMethod: AbilityDetailPokemonInnerPokemon,
    val versionDetails: kotlin.collections.List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>
)
