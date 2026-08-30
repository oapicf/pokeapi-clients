@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailAbilitiesInner(
    @field:JsonProperty("ability")
    val ability: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("is_hidden")
    val isHidden: kotlin.Boolean,

    @field:JsonProperty("slot")
    val slot: kotlin.Int,

)
