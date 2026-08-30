@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PalParkAreaDetailPokemonEncountersInner(
    @field:JsonProperty("base_score")
    val baseScore: kotlin.Int,

    @field:JsonProperty("pokemon-species")
    val pokemonSpecies: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("rate")
    val rate: kotlin.Int,

)
