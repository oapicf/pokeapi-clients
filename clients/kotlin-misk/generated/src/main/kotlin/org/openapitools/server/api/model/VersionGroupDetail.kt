package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.MoveLearnMethodSummary
import org.openapitools.server.api.model.PokedexSummary
import org.openapitools.server.api.model.RegionSummary
import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionGroupDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The generation this version was introduced in. */
    val generation: GenerationSummary,
    /** A list of methods in which Pokémon can learn moves in this version group. */
    val moveLearnMethods: kotlin.collections.List<MoveLearnMethodSummary>,
    /** A list of Pokédexes introduces in this version group. */
    val pokedexes: kotlin.collections.List<PokedexSummary>,
    /** A list of regions that can be visited in this version group. */
    val regions: kotlin.collections.List<RegionSummary>,
    /** The versions this version group owns. */
    val versions: kotlin.collections.List<VersionSummary>,
    /** Order for sorting. Almost by date of release, except similar versions are grouped together. */
    val order: kotlin.Int? = null
)
