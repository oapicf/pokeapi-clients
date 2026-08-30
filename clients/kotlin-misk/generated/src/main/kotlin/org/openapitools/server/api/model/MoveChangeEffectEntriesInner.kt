package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveChangeEffectEntriesInner(
    val effect: kotlin.String,
    val shortEffect: kotlin.String,
    val language: AbilityDetailPokemonInnerPokemon
)
