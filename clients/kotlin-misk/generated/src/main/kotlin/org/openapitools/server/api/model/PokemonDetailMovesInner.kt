package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.PokemonDetailMovesInnerVersionGroupDetailsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailMovesInner(
    val move: AbilityDetailPokemonInnerPokemon,
    val versionGroupDetails: kotlin.collections.List<PokemonDetailMovesInnerVersionGroupDetailsInner>
)
