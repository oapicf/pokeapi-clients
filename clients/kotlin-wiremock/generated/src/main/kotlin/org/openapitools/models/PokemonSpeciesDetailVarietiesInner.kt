@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesDetailVarietiesInner(
    @field:JsonProperty("is_default")
    val isDefault: kotlin.Boolean,

    @field:JsonProperty("pokemon")
    val pokemon: AbilityDetailPokemonInnerPokemon,

)
