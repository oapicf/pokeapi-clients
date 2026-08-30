@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StatDetailAffectingNatures(
    @field:JsonProperty("increase")
    val increase: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("decrease")
    val decrease: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

)
