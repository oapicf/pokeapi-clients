@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("game_index")
    val gameIndex: kotlin.Int,

    @field:JsonProperty("encounter_method_rates")
    val encounterMethodRates: kotlin.collections.List<LocationAreaDetailEncounterMethodRatesInner>,

    @field:JsonProperty("location")
    val location: LocationSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<LocationAreaName>,

    @field:JsonProperty("pokemon_encounters")
    val pokemonEncounters: kotlin.collections.List<LocationAreaDetailPokemonEncountersInner>,

)
