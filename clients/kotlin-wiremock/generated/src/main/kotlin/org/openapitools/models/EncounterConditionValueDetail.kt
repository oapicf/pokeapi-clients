@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EncounterConditionValueDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("condition")
    val condition: EncounterConditionSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<EncounterConditionValueName>,

)
