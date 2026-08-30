@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemDetailHeldByPokemonInner(
    @field:JsonProperty("pokemon")
    val pokemon: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("version-details")
    val versionDetails: kotlin.collections.List<ItemDetailHeldByPokemonInnerVersionDetailsInner>,

)
