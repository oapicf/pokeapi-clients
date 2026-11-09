@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypePokemon(
    @field:JsonProperty("slot")
    val slot: kotlin.Int,

    @field:JsonProperty("pokemon")
    val pokemon: PokemonSummary,

)
