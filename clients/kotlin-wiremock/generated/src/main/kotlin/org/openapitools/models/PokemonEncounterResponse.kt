@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonEncounterResponse(
    @field:JsonProperty("location_area")
    val locationArea: LocationAreaSummary,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<PokemonEncounterVersionDetailResponse>,

)
