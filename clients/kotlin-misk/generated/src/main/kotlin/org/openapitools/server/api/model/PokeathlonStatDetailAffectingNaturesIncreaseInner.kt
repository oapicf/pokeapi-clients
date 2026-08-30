package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeathlonStatDetailAffectingNaturesIncreaseInner(
    val maxChange: kotlin.Int,
    val nature: AbilityDetailPokemonInnerPokemon
)
