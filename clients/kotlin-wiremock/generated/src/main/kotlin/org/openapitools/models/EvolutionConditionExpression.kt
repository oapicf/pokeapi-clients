@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionConditionExpression(
    @field:JsonProperty("expression")
    val expression: kotlin.String,

    @field:JsonProperty("percentage_chance")
    val percentageChance: kotlin.Double,

    @field:JsonProperty("variables")
    val variables: kotlin.collections.List<EvolutionVariableSummary>,

)
