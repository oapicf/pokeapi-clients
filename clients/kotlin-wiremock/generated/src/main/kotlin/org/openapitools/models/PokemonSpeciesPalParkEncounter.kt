@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesPalParkEncounter(
    @field:JsonProperty("rate")
    val rate: kotlin.Int,

    @field:JsonProperty("area")
    val area: PalParkAreaSummary,

    @field:JsonProperty("base_score")
    val baseScore: kotlin.Int? = null,

)
