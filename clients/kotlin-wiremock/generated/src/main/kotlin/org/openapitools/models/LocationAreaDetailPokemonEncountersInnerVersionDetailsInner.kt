@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(
    @field:JsonProperty("version")
    val version: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("max_chance")
    val maxChance: kotlin.Int,

    @field:JsonProperty("encounter_details")
    val encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails,

)
