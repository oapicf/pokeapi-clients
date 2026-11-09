@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaEncounterDetail(
    @field:JsonProperty("min_level")
    val minLevel: kotlin.Int,

    @field:JsonProperty("max_level")
    val maxLevel: kotlin.Int,

    @field:JsonProperty("condition_values")
    val conditionValues: kotlin.collections.List<EncounterConditionValueSummary>,

    @field:JsonProperty("pokemon_details")
    val pokemonDetails: EncounterPokemonDetail,

    @field:JsonProperty("chance")
    val chance: kotlin.Int? = 0,

    @field:JsonProperty("method")
    val method: EncounterMethodSummary? = null,

)
