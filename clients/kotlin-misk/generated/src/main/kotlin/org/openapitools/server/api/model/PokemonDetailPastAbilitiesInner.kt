package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.PokemonDetailAbilitiesInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailPastAbilitiesInner(
    val abilities: kotlin.collections.List<PokemonDetailAbilitiesInner>,
    val generation: AbilityDetailPokemonInnerPokemon
)
