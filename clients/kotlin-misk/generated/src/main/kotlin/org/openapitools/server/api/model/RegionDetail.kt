package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.LocationSummary
import org.openapitools.server.api.model.PokedexSummary
import org.openapitools.server.api.model.RegionName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RegionDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val locations: kotlin.collections.List<LocationSummary>,
    val mainGeneration: GenerationSummary,
    val names: kotlin.collections.List<RegionName>,
    val pokedexes: kotlin.collections.List<PokedexSummary>,
    val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
