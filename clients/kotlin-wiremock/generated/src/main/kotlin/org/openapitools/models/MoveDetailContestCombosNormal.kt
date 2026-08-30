@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveDetailContestCombosNormal(
    @field:JsonProperty("use_before")
    val useBefore: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("use_after")
    val useAfter: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

)
