@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EncounterConditionDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<EncounterConditionValueSummary>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<EncounterConditionName>,

)
