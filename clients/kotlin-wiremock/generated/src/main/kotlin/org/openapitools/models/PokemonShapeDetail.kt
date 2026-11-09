@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonShapeDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("awesome_names")
    val awesomeNames: kotlin.collections.List<PokemonShapeAwesomeName>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<PokemonShapeName>,

    @field:JsonProperty("pokemon_species")
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>,

)
