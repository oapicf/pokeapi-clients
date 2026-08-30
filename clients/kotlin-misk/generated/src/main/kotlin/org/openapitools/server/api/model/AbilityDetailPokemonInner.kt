package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityDetailPokemonInner(
    val isHidden: kotlin.Boolean,
    val slot: kotlin.Int,
    val pokemon: AbilityDetailPokemonInnerPokemon
)
