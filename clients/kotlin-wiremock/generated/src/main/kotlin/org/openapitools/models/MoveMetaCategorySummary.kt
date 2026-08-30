@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveMetaCategorySummary(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("url")
    val url: java.net.URI,

)
