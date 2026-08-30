@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
    @field:JsonProperty("min_level")
    val minLevel: kotlin.Int,

    @field:JsonProperty("max_level")
    val maxLevel: kotlin.Int,

    @field:JsonProperty("chance")
    val chance: kotlin.Int,

    @field:JsonProperty("method")
    val method: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("condition_values")
    val conditionValues: AbilityDetailPokemonInnerPokemon? = null,

)
