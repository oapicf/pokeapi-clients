@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemDetailHeldByPokemonInnerVersionDetailsInner(
    @field:JsonProperty("rarity")
    val rarity: kotlin.Int,

    @field:JsonProperty("version")
    val version: AbilityDetailPokemonInnerPokemon,

)
