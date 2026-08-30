@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemAttributeDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<ItemAttributeDescription>,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<ItemAttributeName>,

)
