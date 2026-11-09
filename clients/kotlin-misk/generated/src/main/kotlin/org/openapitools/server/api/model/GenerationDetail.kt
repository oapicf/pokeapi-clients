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
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of abilities that were introduced in this generation. */
    val abilities: kotlin.collections.List<AbilitySummary>,
    /** The main region travelled in this generation. */
    val mainRegion: RegionSummary,
    /** A list of moves that were introduced in this generation. */
    val moves: kotlin.collections.List<MoveSummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<GenerationName>,
    /** A list of Pokémon species that were introduced in this generation. */
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>,
    /** A list of types that were introduced in this generation. */
    val types: kotlin.collections.List<TypeSummary>,
    /** A list of version groups that were introduced in this generation. */
    val versionGroups: kotlin.collections.List<VersionGroupSummary>
)
