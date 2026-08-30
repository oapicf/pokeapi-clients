@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StatDetailAffectingMoves(
    @field:JsonProperty("increase")
    val increase: kotlin.collections.List<StatDetailAffectingMovesIncreaseInner>,

    @field:JsonProperty("decrease")
    val decrease: kotlin.collections.List<StatDetailAffectingMovesIncreaseInner>,

)
