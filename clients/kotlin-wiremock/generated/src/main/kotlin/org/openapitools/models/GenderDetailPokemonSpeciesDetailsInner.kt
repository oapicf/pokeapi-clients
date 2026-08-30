@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenderDetailPokemonSpeciesDetailsInner(
    @field:JsonProperty("rate")
    val rate: kotlin.Int,

    @field:JsonProperty("pokemon_species")
    val pokemonSpecies: AbilityDetailPokemonInnerPokemon,

)
