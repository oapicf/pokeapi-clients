package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.PokemonDetailTypesInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailPastTypesInner(
    val generation: AbilityDetailPokemonInnerPokemon,
    val types: kotlin.collections.List<PokemonDetailTypesInner>
)
