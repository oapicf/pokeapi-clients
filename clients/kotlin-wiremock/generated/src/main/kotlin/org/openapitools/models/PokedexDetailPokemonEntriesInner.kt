@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokedexDetailPokemonEntriesInner(
    @field:JsonProperty("entry_number")
    val entryNumber: kotlin.Int,

    @field:JsonProperty("pokemon_species")
    val pokemonSpecies: AbilityDetailPokemonInnerPokemon,

)
