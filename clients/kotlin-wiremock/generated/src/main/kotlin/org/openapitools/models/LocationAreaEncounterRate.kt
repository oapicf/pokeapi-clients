@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaEncounterRate(
    @field:JsonProperty("encounter_method")
    val encounterMethod: EncounterMethodSummary,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<LocationAreaEncounterVersionDetail>,

)
