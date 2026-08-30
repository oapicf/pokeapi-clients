@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerationDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("abilities")
    val abilities: kotlin.collections.List<AbilitySummary>,

    @field:JsonProperty("main_region")
    val mainRegion: RegionSummary,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<MoveSummary>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<GenerationName>,

    @field:JsonProperty("pokemon_species")
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>,

    @field:JsonProperty("types")
    val types: kotlin.collections.List<TypeSummary>,

    @field:JsonProperty("version_groups")
    val versionGroups: kotlin.collections.List<VersionGroupSummary>,

)
