@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailPastAbilitiesInner(
    @field:JsonProperty("abilities")
    val abilities: kotlin.collections.List<PokemonDetailAbilitiesInner>,

    @field:JsonProperty("generation")
    val generation: AbilityDetailPokemonInnerPokemon,

)
