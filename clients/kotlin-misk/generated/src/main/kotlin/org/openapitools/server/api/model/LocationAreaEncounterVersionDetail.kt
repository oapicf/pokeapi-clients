package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaEncounterVersionDetail(
    /** The chance of an encounter to occur. */
    val rate: kotlin.Int,
    /** The version of the game in which the encounter can occur with the given chance. */
    val version: VersionSummary
)
