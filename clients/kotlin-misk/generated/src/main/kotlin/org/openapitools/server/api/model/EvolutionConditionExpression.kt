package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionVariableSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionConditionExpression(
    /** Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) */
    val expression: kotlin.String,
    /** Percentage chance of evolution under this condition (0-100) */
    val percentageChance: kotlin.Double,
    /** Evolution variables referenced in the expression */
    val variables: kotlin.collections.List<EvolutionVariableSummary>
)
