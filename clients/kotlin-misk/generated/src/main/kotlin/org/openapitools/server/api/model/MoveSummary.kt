package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveSummary(
    val name: kotlin.String,
    val url: java.net.URI
)
