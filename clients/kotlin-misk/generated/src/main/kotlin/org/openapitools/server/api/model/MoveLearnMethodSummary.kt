package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveLearnMethodSummary(
    val name: kotlin.String,
    val url: java.net.URI
)
