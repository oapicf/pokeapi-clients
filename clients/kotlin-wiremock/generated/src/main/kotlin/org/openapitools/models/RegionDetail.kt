@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RegionDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("locations")
    val locations: kotlin.collections.List<LocationSummary>,

    @field:JsonProperty("main_generation")
    val mainGeneration: GenerationSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<RegionName>,

    @field:JsonProperty("pokedexes")
    val pokedexes: kotlin.collections.List<PokedexSummary>,

    @field:JsonProperty("version_groups")
    val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

)
