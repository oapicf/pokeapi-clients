@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveMetaAilmentDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<MoveMetaAilmentName>,

)
