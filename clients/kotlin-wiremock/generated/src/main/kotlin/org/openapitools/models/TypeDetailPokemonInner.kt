@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypeDetailPokemonInner(
    @field:JsonProperty("slot")
    val slot: kotlin.Int? = null,

    @field:JsonProperty("pokemon")
    val pokemon: TypeDetailPokemonInnerPokemon? = null,

)
