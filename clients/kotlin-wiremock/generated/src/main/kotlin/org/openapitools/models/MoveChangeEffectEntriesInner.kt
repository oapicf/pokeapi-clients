@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveChangeEffectEntriesInner(
    @field:JsonProperty("effect")
    val effect: kotlin.String,

    @field:JsonProperty("short_effect")
    val shortEffect: kotlin.String,

    @field:JsonProperty("language")
    val language: AbilityDetailPokemonInnerPokemon,

)
