@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionGroupDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("move_learn_methods")
    val moveLearnMethods: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("pokedexes")
    val pokedexes: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("regions")
    val regions: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("versions")
    val versions: kotlin.collections.List<VersionSummary>,

    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

)
