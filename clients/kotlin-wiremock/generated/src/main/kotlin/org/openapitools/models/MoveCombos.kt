@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveCombos(
    @field:JsonProperty("normal")
    val normal: MoveComboUsage,

    @field:JsonProperty("super")
    val `super`: MoveComboUsage,

)
