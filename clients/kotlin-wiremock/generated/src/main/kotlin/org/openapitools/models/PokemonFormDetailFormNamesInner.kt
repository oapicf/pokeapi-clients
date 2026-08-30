@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonFormDetailFormNamesInner(
    @field:JsonProperty("language")
    val language: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
