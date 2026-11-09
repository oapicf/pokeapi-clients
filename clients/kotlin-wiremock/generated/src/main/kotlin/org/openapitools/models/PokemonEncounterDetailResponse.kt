@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonEncounterDetailResponse(
    @field:JsonProperty("chance")
    val chance: kotlin.Int,

    @field:JsonProperty("condition_values")
    val conditionValues: kotlin.collections.List<EncounterConditionValueSummary>,

    @field:JsonProperty("max_level")
    val maxLevel: kotlin.Int,

    @field:JsonProperty("method")
    val method: EncounterMethodSummary,

    @field:JsonProperty("min_level")
    val minLevel: kotlin.Int,

)
