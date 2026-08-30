@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokedexDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<PokedexDescription>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<PokedexName>,

    @field:JsonProperty("pokemon_entries")
    val pokemonEntries: kotlin.collections.List<PokedexDetailPokemonEntriesInner>,

    @field:JsonProperty("region")
    val region: RegionSummary,

    @field:JsonProperty("version_groups")
    val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("is_main_series")
    val isMainSeries: kotlin.Boolean? = null,

)
