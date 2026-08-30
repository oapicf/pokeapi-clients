@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenderDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("pokemon_species_details")
    val pokemonSpeciesDetails: kotlin.collections.List<GenderDetailPokemonSpeciesDetailsInner>,

    @field:JsonProperty("required_for_evolution")
    val requiredForEvolution: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

)
