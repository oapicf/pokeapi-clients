@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveMetaCategoryDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<MoveMetaCategoryDescription>,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

)
