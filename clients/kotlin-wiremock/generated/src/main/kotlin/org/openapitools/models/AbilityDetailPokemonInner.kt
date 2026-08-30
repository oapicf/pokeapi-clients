@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AbilityDetailPokemonInner(
    @field:JsonProperty("is_hidden")
    val isHidden: kotlin.Boolean,

    @field:JsonProperty("slot")
    val slot: kotlin.Int,

    @field:JsonProperty("pokemon")
    val pokemon: AbilityDetailPokemonInnerPokemon,

)
