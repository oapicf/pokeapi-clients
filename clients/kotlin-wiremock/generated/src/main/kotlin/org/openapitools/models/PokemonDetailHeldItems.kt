@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailHeldItems(
    @field:JsonProperty("item")
    val item: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<ItemDetailHeldByPokemonInnerVersionDetailsInner>,

)
