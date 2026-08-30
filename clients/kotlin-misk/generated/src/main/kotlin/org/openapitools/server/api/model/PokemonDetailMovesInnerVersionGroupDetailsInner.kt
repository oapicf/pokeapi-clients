package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailMovesInnerVersionGroupDetailsInner(
    val levelLearnedAt: kotlin.Int,
    val moveLearnMethod: AbilityDetailPokemonInnerPokemon,
    val versionGroup: AbilityDetailPokemonInnerPokemon
)
