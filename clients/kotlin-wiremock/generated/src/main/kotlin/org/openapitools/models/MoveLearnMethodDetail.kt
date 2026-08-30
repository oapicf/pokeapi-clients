@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveLearnMethodDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<MoveLearnMethodName>,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<MoveLearnMethodDescription>,

    @field:JsonProperty("version_groups")
    val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

)
