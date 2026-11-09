package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterMethodSummary
import org.openapitools.server.api.model.LocationAreaEncounterVersionDetail
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaEncounterRate(
    /** The method in which Pokémon may be encountered in an area.. */
    val encounterMethod: EncounterMethodSummary,
    /** The chance of the encounter to occur on a version of the game. */
    val versionDetails: kotlin.collections.List<LocationAreaEncounterVersionDetail>
)
