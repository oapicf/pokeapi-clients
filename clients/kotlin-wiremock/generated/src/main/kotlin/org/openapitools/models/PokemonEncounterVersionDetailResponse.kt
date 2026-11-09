@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonEncounterVersionDetailResponse(
    @field:JsonProperty("version")
    val version: VersionSummary,

    @field:JsonProperty("max_chance")
    val maxChance: kotlin.Int,

    @field:JsonProperty("encounter_details")
    val encounterDetails: kotlin.collections.List<PokemonEncounterDetailResponse>,

)
