@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GrowthRateDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("formula")
    val formula: kotlin.String,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<GrowthRateDescription>,

    @field:JsonProperty("levels")
    val levels: kotlin.collections.List<Experience>,

    @field:JsonProperty("pokemon_species")
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>,

)
