@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailPastTypesInner(
    @field:JsonProperty("generation")
    val generation: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("types")
    val types: kotlin.collections.List<PokemonDetailTypesInner>,

)
