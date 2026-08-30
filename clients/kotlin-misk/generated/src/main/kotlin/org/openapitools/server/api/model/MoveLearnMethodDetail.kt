package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.MoveLearnMethodDescription
import org.openapitools.server.api.model.MoveLearnMethodName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveLearnMethodDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<MoveLearnMethodName>,
    val descriptions: kotlin.collections.List<MoveLearnMethodDescription>,
    val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
