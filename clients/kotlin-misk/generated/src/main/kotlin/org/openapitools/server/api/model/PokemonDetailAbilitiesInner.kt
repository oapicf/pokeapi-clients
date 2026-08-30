package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailAbilitiesInner(
    val ability: AbilityDetailPokemonInnerPokemon,
    val isHidden: kotlin.Boolean,
    val slot: kotlin.Int
)
