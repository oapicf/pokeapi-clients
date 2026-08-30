@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveTargetDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<MoveTargetDescription>,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<MoveSummary>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<MoveTargetName>,

)
