@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailTypesInner(
    @field:JsonProperty("slot")
    val slot: kotlin.Int,

    @field:JsonProperty("type")
    val type: AbilityDetailPokemonInnerPokemon,

)
