@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PalParkAreaDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<PalParkAreaName>,

    @field:JsonProperty("pokemon_encounters")
    val pokemonEncounters: kotlin.collections.List<PalParkAreaDetailPokemonEncountersInner>,

)
