package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilitySummary
import org.openapitools.server.api.model.GenerationName
import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.PokemonSpeciesSummary
import org.openapitools.server.api.model.RegionSummary
import org.openapitools.server.api.model.TypeSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenerationDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val abilities: kotlin.collections.List<AbilitySummary>,
    val mainRegion: RegionSummary,
    val moves: kotlin.collections.List<MoveSummary>,
    val names: kotlin.collections.List<GenerationName>,
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>,
    val types: kotlin.collections.List<TypeSummary>,
    val versionGroups: kotlin.collections.List<VersionGroupSummary>
)
