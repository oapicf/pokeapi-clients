package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatDetailAffectingNatures(
    val increase: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val decrease: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
