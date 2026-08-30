@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Experience(
    @field:JsonProperty("level")
    val level: kotlin.Int,

    @field:JsonProperty("experience")
    val experience: kotlin.Int,

)
