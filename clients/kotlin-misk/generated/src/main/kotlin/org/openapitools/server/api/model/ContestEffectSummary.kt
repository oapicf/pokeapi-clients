package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestEffectSummary(
    val url: java.net.URI
)
