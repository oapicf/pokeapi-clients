@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
    @field:JsonProperty("rate")
    val rate: kotlin.Int,

    @field:JsonProperty("version")
    val version: AbilityDetailPokemonInnerPokemon,

)
