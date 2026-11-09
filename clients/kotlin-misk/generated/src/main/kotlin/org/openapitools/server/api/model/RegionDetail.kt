package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.LocationSummary
import org.openapitools.server.api.model.PokedexSummary
import org.openapitools.server.api.model.RegionName
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RegionDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of locations that can be found in this region. */
    val locations: kotlin.collections.List<LocationSummary>,
    /** The generation this region was introduced in. */
    val mainGeneration: GenerationSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<RegionName>,
    /** A list of pokédexes that catalogue Pokémon in this region. */
    val pokedexes: kotlin.collections.List<PokedexSummary>,
    /** A list of version groups where this region can be visited. */
    val versionGroups: kotlin.collections.List<VersionGroupSummary>
)
