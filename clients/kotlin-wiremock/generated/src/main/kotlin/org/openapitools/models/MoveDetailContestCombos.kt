@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveDetailContestCombos(
    @field:JsonProperty("normal")
    val normal: MoveDetailContestCombosNormal,

    @field:JsonProperty("super")
    val `super`: MoveDetailContestCombosNormal,

)
