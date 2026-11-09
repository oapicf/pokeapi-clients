package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocationAreaSummary
import org.openapitools.server.api.model.PokemonEncounterVersionDetailResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonEncounterResponse(
    /** The location area the referenced Pokémon can be encountered in. */
    val locationArea: LocationAreaSummary,
    /** A list of versions and encounters with the referenced Pokémon that might happen. */
    val versionDetails: kotlin.collections.List<PokemonEncounterVersionDetailResponse>
)
