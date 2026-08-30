@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailMovesInner(
    @field:JsonProperty("move")
    val move: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("version_group_details")
    val versionGroupDetails: kotlin.collections.List<PokemonDetailMovesInnerVersionGroupDetailsInner>,

)
