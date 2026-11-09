@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StatAffectingMoves(
    @field:JsonProperty("increase")
    val increase: kotlin.collections.List<MoveStatChange>,

    @field:JsonProperty("decrease")
    val decrease: kotlin.collections.List<MoveStatChange>,

)
