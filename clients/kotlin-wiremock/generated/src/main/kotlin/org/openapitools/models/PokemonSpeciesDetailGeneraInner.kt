@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesDetailGeneraInner(
    @field:JsonProperty("genus")
    val genus: kotlin.String,

    @field:JsonProperty("language")
    val language: AbilityDetailPokemonInnerPokemon,

)
