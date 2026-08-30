package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.MoveMetaCategoryDescription
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMetaCategoryDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val descriptions: kotlin.collections.List<MoveMetaCategoryDescription>,
    val moves: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
