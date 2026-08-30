package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.MoveMetaAilmentName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMetaAilmentDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val moves: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val names: kotlin.collections.List<MoveMetaAilmentName>
)
