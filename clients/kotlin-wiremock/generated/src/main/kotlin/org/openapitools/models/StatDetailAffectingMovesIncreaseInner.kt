@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StatDetailAffectingMovesIncreaseInner(
    @field:JsonProperty("change")
    val change: kotlin.Int,

    @field:JsonProperty("move")
    val move: AbilityDetailPokemonInnerPokemon,

)
