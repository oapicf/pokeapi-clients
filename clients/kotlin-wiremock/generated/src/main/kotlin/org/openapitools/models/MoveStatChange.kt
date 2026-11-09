@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveStatChange(
    @field:JsonProperty("change")
    val change: kotlin.Int,

    @field:JsonProperty("move")
    val move: MoveSummary,

)
