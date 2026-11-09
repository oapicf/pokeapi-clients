@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveComboUsage(
    @field:JsonProperty("use_before")
    val useBefore: kotlin.collections.List<MoveSummary>,

    @field:JsonProperty("use_after")
    val useAfter: kotlin.collections.List<MoveSummary>,

)
