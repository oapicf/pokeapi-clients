@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaPokemonEncounterVersion(
    @field:JsonProperty("version")
    val version: VersionSummary,

    @field:JsonProperty("max_chance")
    val maxChance: kotlin.Int,

    @field:JsonProperty("encounter_details")
    val encounterDetails: kotlin.collections.List<LocationAreaEncounterDetail>,

)
