@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveMetaStatChange(
    @field:JsonProperty("change")
    val change: kotlin.Int,

    @field:JsonProperty("stat")
    val stat: StatSummary,

)
