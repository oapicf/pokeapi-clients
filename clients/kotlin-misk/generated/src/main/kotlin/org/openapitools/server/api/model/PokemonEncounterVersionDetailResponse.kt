package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonEncounterDetailResponse
import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonEncounterVersionDetailResponse(
    /** The game version this encounter happens in. */
    val version: VersionSummary,
    /** The total percentage of all encounter potential. */
    val maxChance: kotlin.Int,
    /** A list of encounters and their specifics. */
    val encounterDetails: kotlin.collections.List<PokemonEncounterDetailResponse>
)
