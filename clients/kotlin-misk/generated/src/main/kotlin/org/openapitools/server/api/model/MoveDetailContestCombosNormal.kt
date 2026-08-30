package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDetailContestCombosNormal(
    val useBefore: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val useAfter: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
