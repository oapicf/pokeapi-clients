@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailMovesInnerVersionGroupDetailsInner(
    @field:JsonProperty("level_learned_at")
    val levelLearnedAt: kotlin.Int,

    @field:JsonProperty("move_learn_method")
    val moveLearnMethod: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("version_group")
    val versionGroup: AbilityDetailPokemonInnerPokemon,

)
