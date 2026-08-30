@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaDetailEncounterMethodRatesInner(
    @field:JsonProperty("encounter_method")
    val encounterMethod: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>,

)
