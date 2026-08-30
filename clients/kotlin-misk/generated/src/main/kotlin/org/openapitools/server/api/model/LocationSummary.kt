package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationSummary(
    val name: kotlin.String,
    val url: java.net.URI
)
