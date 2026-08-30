@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesDetailPalParkEncountersInner(
    @field:JsonProperty("area")
    val area: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("base_score")
    val baseScore: kotlin.Int,

    @field:JsonProperty("rate")
    val rate: kotlin.Int,

)
