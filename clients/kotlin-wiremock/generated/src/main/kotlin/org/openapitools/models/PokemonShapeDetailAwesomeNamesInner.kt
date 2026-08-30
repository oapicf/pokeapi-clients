@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonShapeDetailAwesomeNamesInner(
    @field:JsonProperty("awesome_name")
    val awesomeName: kotlin.String,

    @field:JsonProperty("language")
    val language: AbilityDetailPokemonInnerPokemon,

)
