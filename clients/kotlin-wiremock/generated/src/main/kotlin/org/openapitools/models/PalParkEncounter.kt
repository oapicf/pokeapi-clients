@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PalParkEncounter(
    @field:JsonProperty("rate")
    val rate: kotlin.Int,

    @field:JsonProperty("pokemon_species")
    val pokemonSpecies: PokemonSpeciesSummary,

    @field:JsonProperty("base_score")
    val baseScore: kotlin.Int? = null,

)
