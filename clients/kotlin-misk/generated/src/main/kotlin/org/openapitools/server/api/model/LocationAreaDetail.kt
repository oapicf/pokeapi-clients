package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocationAreaDetailEncounterMethodRatesInner
import org.openapitools.server.api.model.LocationAreaDetailPokemonEncountersInner
import org.openapitools.server.api.model.LocationAreaName
import org.openapitools.server.api.model.LocationSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val gameIndex: kotlin.Int,
    val encounterMethodRates: kotlin.collections.List<LocationAreaDetailEncounterMethodRatesInner>,
    val location: LocationSummary,
    val names: kotlin.collections.List<LocationAreaName>,
    val pokemonEncounters: kotlin.collections.List<LocationAreaDetailPokemonEncountersInner>
)
